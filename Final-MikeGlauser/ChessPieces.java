import greenfoot.*;
import java.util.List;
/**
*
*
*/
public abstract class ChessPieces extends Actor {
    int move;
    boolean isSelected;

    ChessPieces() {
        super();
    }

    ChessPieces(int move) {
        super();
        this.move = move;
        isSelected = false;
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            select();
        }
    }  

    public void select() {
        if (((MyWorld)getWorld()).select(this, move)) {
            isSelected = true;
        }
        adjustAppearance();
    }
    
    public void unselect() {
        isSelected = false;
        adjustAppearance();
    }

    private void adjustAppearance() {
        if (isSelected) getImage().setTransparency(50);
        else getImage().setTransparency(255); 
    }
    
    public int move() {
        return this.move;
    }

    public void move(ChessMovePosition p) {
        isSelected = false;
        setLocation(p.getX(),p.getY());
    }

    public abstract List<ChessMovePosition> availableChessMoves();

    public boolean isPieceAtOffset(int dx, int dy) {
        return getOneObjectAtOffset(dx, dy, ChessPieces.class) != null;
    }

    public boolean isOwnPieceAtOffset(int dx, int dy) {
        return isPieceAtOffset(dx, dy) && move == ((ChessPieces)getOneObjectAtOffset(dx, dy, ChessPieces.class)).move();
    }
    
    public boolean isOnBoardDelta(int dx, int dy) {
        return getX()+dx < 8 && getX()+dx >=0 && getY()+dy < 8 && getY()+dy >= 0; 
    }
}
