import greenfoot.*;  
import java.util.List;
import java.util.ArrayList;

/**
 * This is the chessboard for the game. There's no "deep blue" chess AI or anything. 
 * Two sides, and each side takes a turn. 
 * @author Mike Glauser 
 * @version (a version number or a date)
 */

public class MyWorld extends World {

    boolean chosenPiece;
    ChessPieces currentPiece = new Null();
    int playerMove; 

    public MyWorld() {    
        super(8, 8, 75); 
        for (int i = 0; i < 8; i++) {
            addObject(new Pawn(1), i, 1);
        }
        addObject(new Rook(1), 0, 0);
        addObject(new Rook(1), 7, 0);
        addObject(new Knight(1), 1, 0);
        addObject(new Knight(1), 6, 0);
        addObject(new Bishop(1), 2, 0);
        addObject(new Bishop(1), 5, 0);
        addObject(new King(1), 4, 0);
        addObject(new Queen(1), 3, 0);


        for (int i = 0; i < 8; i++) {
            addObject(new Pawn(-1), i, 6);
        }
        addObject(new Rook(-1), 0, 7);
        addObject(new Rook(-1), 7, 7);
        addObject(new Knight(-1), 1, 7);
        addObject(new Knight(-1), 6, 7);
        addObject(new Bishop(-1), 2, 7);
        addObject(new Bishop(-1), 5, 7);
        addObject(new King(-1), 4, 7);
        addObject(new Queen(-1), 3, 7);

        
        chosenPiece = false;
        currentPiece = new Null();
        playerMove = 1; 
    }

    public void act() {
        movePiece();
    }

    public boolean select(ChessPieces p, int move) {
        if (move == playerMove) {
            if (chosenPiece) {
                unselectPiece(currentPiece);
            }
            chosenPiece = true;
            currentPiece = p;
            showLegalMoves();
            return true; 
        } else {
            return false;
        }
    }

    private void showLegalMoves() {
        List<ChessMovePosition> legalPositions = currentPiece.availableChessMoves();
        for (ChessMovePosition p: legalPositions) {
            addObject(new LegalMoves(), p.getX(), p.getY());
        }
    }

    private void movePiece() {
        for (LegalMoves p: getObjects(LegalMoves.class)) {
            if (Greenfoot.mouseClicked(p)) {
                ChessMovePosition targetPosition = new ChessMovePosition(p);
                List<ChessPieces> l = getObjectsAt(targetPosition.getX(), targetPosition.getY(), ChessPieces.class);
                currentPiece.move(targetPosition);
                if (l.size() > 0) capture(l.get(0));
                unselectPiece(currentPiece);
                changeTurn();
            }
        }
    }
    
    private void changeTurn() {
        playerMove = -playerMove;
    }
    
    private void capture(ChessPieces p) {
        removeObject(p);
    }
    
    private void unselectPiece(ChessPieces p) {
        p.unselect();
        currentPiece = new Null();
        chosenPiece = false;
        clearHighlights();
    }

    private void clearHighlights() {
        removeObjects(getObjects(LegalMoves.class));
    }
}
