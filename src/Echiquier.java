/**
 * Created by guillot.cdi04 on 27/01/2017.
 */
public class Echiquier {

    private static Echiquier monEchiquier;

    private Echiquier(){


    }

    public static Echiquier getEchiquier(){

        if(monEchiquier == null){
            Echiquier monEchiquier = new Echiquier();
        }
        return monEchiquier;
    }

}
