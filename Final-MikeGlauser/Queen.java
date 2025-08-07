import greenfoot.*;  
import java.util.List;
import java.util.ArrayList;
/**
 * Queen piece.
 */
public class Queen extends ChessPieces {
    Queen(int move) {
        super(move);  
        if (this.move == 1) setImage("queen_white.png");
        else setImage("queen_black.png");
    }
     
    public List<ChessMovePosition> availableChessMoves(){
        List<ChessMovePosition> list = new ArrayList<ChessMovePosition>();
        int queenMove = 1;      
        while (getX() + queenMove < 8 && getY() + queenMove < 8 && !isOwnPieceAtOffset(queenMove, queenMove)) {
            list.add(new ChessMovePosition(getX()+queenMove, getY()+queenMove));
            if (isPieceAtOffset(queenMove, queenMove)) break;
            queenMove++;
        }
        queenMove = 1;
        while (getX() - queenMove >= 0 && getY() + queenMove < 8 && !isOwnPieceAtOffset(-queenMove, queenMove)) {
            list.add(new ChessMovePosition(getX()-queenMove, getY()+queenMove));
            if (isPieceAtOffset(-queenMove, queenMove)) break;
            queenMove++;     
        }
        queenMove = 1;
        while (getX() + queenMove < 8 && getY() - queenMove >= 0 && !isOwnPieceAtOffset(queenMove, -queenMove)) {
            list.add(new ChessMovePosition(getX()+queenMove, getY()-queenMove));
            if (isPieceAtOffset(queenMove, -queenMove)) break;
            queenMove++;
        }
        queenMove = 1;
        while (getX() - queenMove >= 0 && getY() - queenMove >= 0 && !isOwnPieceAtOffset(-queenMove, -queenMove)) {
            list.add(new ChessMovePosition(getX()-queenMove, getY()-queenMove));
            if (isPieceAtOffset(-queenMove,-queenMove)) break;
            queenMove++;
        }
        queenMove = 1;
        while (getX() + queenMove < 8 && !isOwnPieceAtOffset(queenMove, 0)) {
            list.add(new ChessMovePosition(getX()+queenMove, getY()));
            if (isPieceAtOffset(queenMove, 0)) break;
            queenMove++;
        }
        queenMove = 1;
        while (getX() - queenMove >= 0 && !isOwnPieceAtOffset(-queenMove, 0)) {
            list.add(new ChessMovePosition(getX()-queenMove, getY()));
            if (isPieceAtOffset(-queenMove, 0)) break;
            queenMove++;
        }
        queenMove = 1;
        while (getY() + queenMove < 8 && !isOwnPieceAtOffset(0, queenMove)) {
            list.add(new ChessMovePosition(getX(), getY()+queenMove));
            if (isPieceAtOffset(0, queenMove)) break;
            queenMove++;
        }
        queenMove = 1;
        while (getY() - queenMove >= 0 && !isOwnPieceAtOffset(0, -queenMove)) {
            list.add(new ChessMovePosition(getX(), getY()-queenMove));
            if (isPieceAtOffset(0,-queenMove)) break;
            queenMove++;
        }
        return list;
    } 
}
