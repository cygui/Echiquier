/**
 * Created by guillot.cdi04 on 27/01/2017.
 */
public class Pion extends Piece  {

    public Pion(Position position, char couleur) {
        super(position, couleur);
    }

    @Override
    public char getSymbole() {
        return 'P';
    }

    @Override
    public int getValeur() {
        return 1;
    }

    @Override
    public boolean positionPossible() {
        return true;
    }
}
