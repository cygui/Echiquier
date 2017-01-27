import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by guillot.cdi04 on 27/01/2017.
 */
public class Echiquier implements Serializable {

    private static Echiquier monEchiquier;
    List<Piece> jeux = new ArrayList<Piece>();

    private Echiquier(){

    }

    public static Echiquier getEchiquier(){

        if(monEchiquier == null){
            Echiquier monEchiquier = new Echiquier();
        }
        return monEchiquier;
    }

    public static Echiquier getMonEchiquier() {
        return monEchiquier;
    }

    public static void setMonEchiquier(Echiquier monEchiquier) {
        Echiquier.monEchiquier = monEchiquier;
    }

    public List<Piece> getJeux() {
        return jeux;
    }

    public void setJeux(List<Piece> jeux) {
        this.jeux = jeux;
    }
}
