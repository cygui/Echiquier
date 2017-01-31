import java.io.Serializable;

/**
 * Created by guillot.cdi04 on 27/01/2017.
 */
public class Position implements Serializable {

    private byte x;
    private byte y;

    public boolean equals(Position p){
        if(this.x== p.x && this.y == p.y)
        {   return true;
        }else{
            return false;
        }

    }

    public Position(byte x, byte y) {
        this.x = x;
        this.y = y;
    }

    public byte getX() {
        return x;
    }

    public void setX(byte x) {
        if(x<7 && x>0 ){
        this.x = x;}
    }

    public byte getY() {
        return y;
    }

    public void setY(byte y) {
        if(y<7 && y>0){
            this.y = y;}
    }
}
