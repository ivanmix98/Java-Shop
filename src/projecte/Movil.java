package projecte;

public class Movil extends Producte {
    int mesura;

    public Movil ( int id, String nom, int mesura){
        super(id, nom);
        this.mesura = mesura;
    }
}
