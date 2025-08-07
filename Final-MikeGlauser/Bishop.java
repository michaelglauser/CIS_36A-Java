import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Bishop piece.
 */
public class Bishop extends ChessPieces {
    
    Bishop(int move) {
        super(move);  
        if (this.move == 1) setImage("bishop_white.png");
        else setImage("bishop_black.png");
    }
 
    public List<ChessMovePosition> availableChessMoves(){
        List<ChessMovePosition> list = new ArrayList<ChessMovePosition>();
        int d = 1;      
        while (getX() + d < 8 && getY() + d < 8 && !isOwnPieceAtOffset(d, d)) {
            list.add(new ChessMovePosition(getX()+d, getY()+d));
            if (isPieceAtOffset(d, d)) break;
            d++;
        }
        d = 1;
        while (getX() - d >= 0 && getY() + d < 8 && !isOwnPieceAtOffset(-d, d)) {
            list.add(new ChessMovePosition(getX()-d, getY()+d));
            if (isPieceAtOffset(-d, d)) break;
            d++;     
        }
        d = 1;
        while (getX() + d < 8 && getY() - d >= 0 && !isOwnPieceAtOffset(d, -d)) {
            list.add(new ChessMovePosition(getX()+d, getY()-d));
            if (isPieceAtOffset(d, -d)) break;
            d++;
        }
        d = 1;
        while (getX() - d >= 0 && getY() - d >= 0 && !isOwnPieceAtOffset(-d, -d)) {
            list.add(new ChessMovePosition(getX()-d, getY()-d));
            if (isPieceAtOffset(-d,-d)) break;
            d++;
        }
        return list;
    } 
    
   
}
