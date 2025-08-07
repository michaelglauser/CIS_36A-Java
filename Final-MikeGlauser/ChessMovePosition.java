/**
*
*
*/
public class ChessMovePosition {
   
    int x;
    int y;
    
    public ChessMovePosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public ChessMovePosition(greenfoot.Actor p) {
        this.x = p.getX();
        this.y = p.getY();
    }   
    
    public boolean correspondsTo(int x, int y) {
        return this.x == x && this.y == y;
    }
    
    public boolean correspondsTo(ChessMovePosition p) {
        return this.x == p.getX() && this.y == p.getY();
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
