/**
 * Created by guillot.cdi04 on 27/01/2017.
 */
public abstract class Piece {


    public boolean positionPossible(Position p){
        return true;
    }

    public char getSymbol(){
        return 'R';
    }

    public byte getValeur(){
        return 1;
    }

    public void deplacement(Position p){

    }

    public String toString(){
        return "toto";
    }

}
