import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by guillot.cdi04 on 27/01/2017.
 */
public class Echiquier implements Serializable {

    private static Echiquier monEchiquier = new Echiquier();
    private byte xmax = (byte)8;
    private byte ymax = (byte)8;
    private List<Piece> jeux = new ArrayList<Piece>();

    private Position rb = new Position((byte)4,(byte)0);
    private Position rn = new Position((byte)5,(byte)7);
    private Position db = new Position((byte)5,(byte)0);
    private Position dn = new Position((byte)4,(byte)7);
    private Position cb = new Position((byte)3,(byte)0);
    private Position cn = new Position((byte)6,(byte)7);
    private Position pb = new Position((byte)6,(byte)0);
    private Position pn = new Position((byte)3,(byte)7);

    private Roi roib = new Roi(rb,'b');
    private Roi roin = new Roi(rn,'n');
    private Dame damb = new Dame(db,'b');
    private Dame damn = new Dame(dn,'n');
    private Cavalier cavb = new Cavalier(cb,'b');
    private Cavalier cavn = new Cavalier(cn,'n');
    private Pion piob = new Pion(pb,'b');
    private Pion pion = new Pion(pn,'n');

    private Echiquier(){
        jeux.add(roib);
        jeux.add(damb);
        jeux.add(cavb);
        jeux.add(piob);
        jeux.add(roin);
        jeux.add(damn);
        jeux.add(cavn);
        jeux.add(pion);

    }
    public void afficheEchiquier(){


        for (int k = 0; k < jeux.size(); k++) {

            Piece p = jeux.get(k);
            for (int i = 0; i < xmax; i++) {
                String ligne="";
                for( int j = 0; j < ymax; j++) {
                    if (p.position.getX() == (byte)j && p.position.getY() == (byte)i) {
                        ligne= ligne+ '|'+ p.getSymbole()+'|';
                    } else {
                        ligne= ligne+"| |";
                    }
                }
                System.out.println(ligne);
            }
        }
    }

    public static Echiquier getEchiquier(){

        if(monEchiquier == null){
            Echiquier monEchiquier = new Echiquier();
        }
        return monEchiquier;
    }

   /* public static Echiquier getMonEchiquier() {
        return monEchiquier;
    }

    public static void setMonEchiquier(Echiquier monEchiquier) {
        Echiquier.monEchiquier = monEchiquier;
    }
*/
    public List<Piece> getJeux() {
        return jeux;
    }

    public void setJeux(List<Piece> jeux) {
        this.jeux = jeux;
    }

    public void ajouterPiece(Piece piece){}

    public Piece getPiece(Position position){return null ;}

    public int getPoints(char couleur){return  0; }

    public static Echiquier getMonEchiquier() {
        return monEchiquier;
    }

    public static void setMonEchiquier(Echiquier monEchiquier) {
        Echiquier.monEchiquier = monEchiquier;
    }

    public byte getXmax() {
        return xmax;
    }

    public void setXmax(byte xmax) {
        this.xmax = xmax;
    }

    public byte getYmax() {
        return ymax;
    }

    public void setYmax(byte ymax) {
        this.ymax = ymax;
    }

    public Position getRb() {
        return rb;
    }

    public void setRb(Position rb) {
        this.rb = rb;
    }

    public Position getRn() {
        return rn;
    }

    public void setRn(Position rn) {
        this.rn = rn;
    }

    public Position getDb() {
        return db;
    }

    public void setDb(Position db) {
        this.db = db;
    }

    public Position getDn() {
        return dn;
    }

    public void setDn(Position dn) {
        this.dn = dn;
    }

    public Position getCb() {
        return cb;
    }

    public void setCb(Position cb) {
        this.cb = cb;
    }

    public Position getCn() {
        return cn;
    }

    public void setCn(Position cn) {
        this.cn = cn;
    }

    public Position getPb() {
        return pb;
    }

    public void setPb(Position pb) {
        this.pb = pb;
    }

    public Position getPn() {
        return pn;
    }

    public void setPn(Position pn) {
        this.pn = pn;
    }

    public Roi getRoib() {
        return roib;
    }

    public void setRoib(Roi roib) {
        this.roib = roib;
    }

    public Roi getRoin() {
        return roin;
    }

    public void setRoin(Roi roin) {
        this.roin = roin;
    }

    public Dame getDamb() {
        return damb;
    }

    public void setDamb(Dame damb) {
        this.damb = damb;
    }

    public Dame getDamn() {
        return damn;
    }

    public void setDamn(Dame damn) {
        this.damn = damn;
    }

    public Cavalier getCavb() {
        return cavb;
    }

    public void setCavb(Cavalier cavb) {
        this.cavb = cavb;
    }

    public Cavalier getCavn() {
        return cavn;
    }

    public void setCavn(Cavalier cavn) {
        this.cavn = cavn;
    }

    public Pion getPiob() {
        return piob;
    }

    public void setPiob(Pion piob) {
        this.piob = piob;
    }

    public Pion getPion() {
        return pion;
    }

    public void setPion(Pion pion) {
        this.pion = pion;
    }

    public void sauvegarde() {
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("echiquier.txt"))));
            objectOutputStream.writeObject(this.jeux);
            objectOutputStream.close();
        }
        catch(IOException  e){ e.printStackTrace();}
    }



    public void chargement(){
        ObjectInputStream objectInputStream;
        try {
        objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("echiquier.txt"))));
        System.out. println (((ArrayList)objectInputStream.readObject()));
        objectInputStream. close () ;
    }
    catch (IOException | ClassNotFoundException  e) { e.printStackTrace () ; }
    }
}
