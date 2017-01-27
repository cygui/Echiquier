import java.io.Serializable;

/**
 * Created by guillot.cdi04 on 27/01/2017.
 */
public class Position implements Serializable {

    private byte x;
    private byte y;

    boolean equals(Position p){
    return true;

    }

    public Position(byte x, byte y) {
        this.x = x;
        this.y = y;
    }

    public byte getX() {
        return x;
    }

    public void setX(byte x) {
        this.x = x;
    }

    public byte getY() {
        return y;
    }

    public void setY(byte y) {
        this.y = y;
    }
}
