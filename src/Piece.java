import java.io.Serializable;

/**
 * Created by guillot.cdi04 on 27/01/2017.
 */

public abstract class Piece implements Serializable {

    protected Position position;
    protected char couleur;

    public Piece(Position position, char couleur) {
        this.position = position;
        this.couleur = couleur;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public char getCouleur() {
        return couleur;
    }

    public void setCouleur(char couleur) {
        this.couleur = couleur;
    }

    public abstract char getSymbole();

    public abstract int getValeur();

    public abstract boolean positionPossible();

    public boolean positionPossible(Position position){
        return true;
    }


    public void deplacement(Position position){

    }

    public String toString(){
        return "toto";
    }

}
