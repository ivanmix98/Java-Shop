package projecte;

public class Movil extends Producte {
    private int mesura;

    public Movil ( int id, String nom, int mesura){
        super(id, nom);
        this.mesura = mesura;
    }



    public int getMesura() {
        return mesura;
    }

    public void setMesura(int mesura) {
        this.mesura = mesura;
    }
}
