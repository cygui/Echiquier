/**
 * Created by guillot.cdi04 on 27/01/2017.
 */
public class Cavalier extends Piece  {

    public Cavalier(Position position, char couleur) {
        super(position, couleur);
    }

    @Override
    public char getSymbole() {
        return 'C';
    }

    @Override
    public int getValeur() {
        return 3;
    }

    @Override
    public boolean positionPossible() {
        return true;
    }
}
