import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
/**
 * King piece.
 */
public class King extends ChessPieces
{
    King(int move) {
        super(move);  
        if (move == 1) setImage("king_white.png");
        else setImage("king_black.png");
    }
   
    public List<ChessMovePosition> availableChessMoves(){
        List<ChessMovePosition> list = new ArrayList<ChessMovePosition>();
        if (!isOwnPieceAtOffset(1, 0) && isOnBoardDelta(1, 0)) {
            list.add(new ChessMovePosition(getX()+1, getY()));
        }
        if (!isOwnPieceAtOffset(-1, 0) && isOnBoardDelta(-1, 0)) {
            list.add(new ChessMovePosition(getX()-1, getY()));
        }
        if (!isOwnPieceAtOffset(0, 1) && isOnBoardDelta(0, 1)) {
            list.add(new ChessMovePosition(getX(), getY()+1));
        }
        if (!isOwnPieceAtOffset(0, -1) && isOnBoardDelta(0, -1)) {
            list.add(new ChessMovePosition(getX(), getY()-1));
        }
        if (!isOwnPieceAtOffset(1, 1) && isOnBoardDelta(1, 1)) {
            list.add(new ChessMovePosition(getX()+1, getY()+1));
        }
        if (!isOwnPieceAtOffset(-1, 1) && isOnBoardDelta(-1, 1)) {
            list.add(new ChessMovePosition(getX()-1, getY()+1));
        }
        if (!isOwnPieceAtOffset(1, -1) && isOnBoardDelta(1, -1)) {
            list.add(new ChessMovePosition(getX()+1, getY()-1));
        }
        if (!isOwnPieceAtOffset(-1, -1) && isOnBoardDelta(-1, -1)) {
            list.add(new ChessMovePosition(getX()-1, getY()-1));
        }
        return list;
    } 
}
