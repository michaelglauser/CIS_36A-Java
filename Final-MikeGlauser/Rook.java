import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Rook piece.
 */
public class Rook extends ChessPieces
{
    Rook(int move) {
        super(move);  
        if (this.move == 1) setImage("rook_white.png");
        else setImage("rook_black.png");
    }

    public List<ChessMovePosition> availableChessMoves(){
        List<ChessMovePosition> list = new ArrayList<ChessMovePosition>();
        int move = 1;
        while (getX() + move < 8 && !isOwnPieceAtOffset(move, 0)) {
            list.add(new ChessMovePosition(getX()+move, getY()));
            if (isPieceAtOffset(move, 0)) break;
            move++;
        }
        move = 1;
        while (getX() - move >= 0 && !isOwnPieceAtOffset(-move, 0)) {
            list.add(new ChessMovePosition(getX()-move, getY()));
            if (isPieceAtOffset(-move, 0)) break;
            move++;
        }
        move = 1;
        while (getY() + move < 8 && !isOwnPieceAtOffset(0, move)) {
            list.add(new ChessMovePosition(getX(), getY()+move));
            if (isPieceAtOffset(0, move)) break;
            move++;
        }
        move = 1;
        while (getY() - move >= 0 && !isOwnPieceAtOffset(0, -move)) {
            list.add(new ChessMovePosition(getX(), getY()-move));
            if (isPieceAtOffset(0,-move)) break;
            move++;
        }
        return list;
    } 
}
