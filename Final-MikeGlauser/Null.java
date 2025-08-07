import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
/**
*The null class returns an empty List of ChessMovePosition objects. 
*It exists primarily because I couldn't figure out a way to make it not exist. 
*In practice, this class represents an empty square on the chessboard. 

 */
public class Null extends ChessPieces {
    public List<ChessMovePosition> availableChessMoves(){
        return new ArrayList<ChessMovePosition>();
    } 
}
