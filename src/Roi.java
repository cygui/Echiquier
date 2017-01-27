/**
 * Created by guillot.cdi04 on 27/01/2017.
 */
public class Roi extends Piece {

    public Roi(Position position, char couleur) {
        super(position, couleur);
    }

    @Override
    public char getSymbole() {
        return 'R';
    }

    @Override
    public int getValeur() {
        return 20;
    }

    @Override
    public boolean positionPossible() {
        return true;
    }


}
