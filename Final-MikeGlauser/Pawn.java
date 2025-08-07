import greenfoot.*;  
import java.util.List;
import java.util.ArrayList;
/**
 * Pawn piece.
 */
public class Pawn extends ChessPieces {

    boolean hasYetMoved = false;

    Pawn(int move) {
        super(move);  
        if (this.move == 1) setImage("pawn_white.png");
        else setImage("pawn_black.png");
    }

    public List<ChessMovePosition> availableChessMoves(){
        List<ChessMovePosition> list = new ArrayList<ChessMovePosition>();
        if (!hasYetMoved) {
            list.add(new ChessMovePosition(getX(), getY() + 2*this.move));
        }
        list.add(new ChessMovePosition(getX(), getY() + this.move));
        ChessPieces p1 = (ChessPieces) getOneObjectAtOffset(-1, this.move, ChessPieces.class);
        ChessPieces p2 = (ChessPieces) getOneObjectAtOffset(1, this.move, ChessPieces.class);
        if (p1!=null && p1.move() == -this.move) list.add(new ChessMovePosition(p1));
        if (p2!=null && p2.move() == -this.move) list.add(new ChessMovePosition(p2));

        return list;
    } 

    public void move(ChessMovePosition p) {
        hasYetMoved = true;
        super.move(p);
    }
}
