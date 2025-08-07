import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Knight piece.
 */
public class Knight extends ChessPieces
{
    Knight(int move) {
        super(move);  
        if (this.move == 1) setImage("knight_white.png");
        else setImage("knight_black.png");
    }
  
    public List<ChessMovePosition> availableChessMoves(){
        List<ChessMovePosition> list = new ArrayList<ChessMovePosition>();
        if (!isOwnPieceAtOffset(1,2) && isOnBoardDelta(1,2)) {
            list.add(new ChessMovePosition(getX()+1, getY()+2)); 
        }
        if (!isOwnPieceAtOffset(1,-2) && isOnBoardDelta(1,-2)) {
            list.add(new ChessMovePosition(getX()+1, getY()-2)); 
        }
        if (!isOwnPieceAtOffset(-1,2) && isOnBoardDelta(-1,2)) {
            list.add(new ChessMovePosition(getX()-1, getY()+2)); 
        }
        if (!isOwnPieceAtOffset(-1,-2) && isOnBoardDelta(-1,-2)) {
            list.add(new ChessMovePosition(getX()-1, getY()-2)); 
        }
        if (!isOwnPieceAtOffset(-2,1) && isOnBoardDelta(-2,1)) {
            list.add(new ChessMovePosition(getX()-2, getY()+1)); 
        }
        if (!isOwnPieceAtOffset(-2,-1) && isOnBoardDelta(-2,-1)) {
            list.add(new ChessMovePosition(getX()-2, getY()-1)); 
        }
        if (!isOwnPieceAtOffset(2,1) && isOnBoardDelta(2,1)) {
            list.add(new ChessMovePosition(getX()+2, getY()+1)); 
        }
        if (!isOwnPieceAtOffset(2,-1) && isOnBoardDelta(2,-1)) {
            list.add(new ChessMovePosition(getX()+2, getY()-1)); 
        }
        return list;
    } 
}
