package projecte;

public class Movil extends Producte {
    private  int mesura;
    private  String nomMovil;

    public Movil ( int id, String nom, int mesura, String nomMovil){
        super(id, nom);
        this.mesura = mesura;
        this.nomMovil = nomMovil;
    }

    public  int getMesura() {
        return mesura;
    }

    public void setMesura(int mesura) {
        this.mesura = mesura;
    }

    public  String getNomMovil() {
        return nomMovil;
    }

    public void setNomMovil(String nomMovil) {
        this.nomMovil = nomMovil;
    }

}
