import java.io.Serializable;

/**
 * Created by guillot.cdi04 on 27/01/2017.
 */

public abstract class Piece implements Serializable {

    public Position position;
    public char couleur;
    public int valeur;

    public Piece(Position position, char couleur, int valeur) {
        this.position = position;
        this.couleur = couleur;
        this.valeur = valeur;
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

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public boolean positionPossible(Position p){
        return true;
    }


    public char getSymbol(){
        return 'Z';
    }

    public byte getValeur(){
        return 0;
    }

    public void deplacement(Position p){

    }

    public String toString(){
        return "toto";
    }

}
