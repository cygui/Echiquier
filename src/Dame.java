/**
 * Created by guillot.cdi04 on 27/01/2017.
 */
public class Dame extends Piece  {

    public Dame(Position position, char couleur) {
        super(position, couleur);
    }

    @Override
    public char getSymbole() {
        return 'D';
    }

    @Override
    public int getValeur() {
        return 9;
    }

    @Override
    public boolean positionPossible() {
        return true;
    }
}
