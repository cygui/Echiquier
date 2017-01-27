import java.io.*;
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

    public void sauvegarde() {
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("form.txt"))));
            objectOutputStream.writeObject(this.jeux);
            objectOutputStream.close();
        }
        catch(IOException  e){ e.printStackTrace();};
    }



    public void chargement(){
        ObjectInputStream objectInputStream;
        try {
        objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("form.txt"))));
        System.out. println (((ArrayList)objectInputStream.readObject()));
        objectInputStream. close () ;
    }
    catch (IOException | ClassNotFoundException  e) { e.printStackTrace () ; };
    }
}
