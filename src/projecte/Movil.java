package projecte;

public class Movil extends Producte implements IVoluminos {
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

    public void Gran(){
         System.out.println("Aquest movil es més gran que la mitjana");
    }
    public void Petit(){
        System.out.println("Aquest movil es més petit que la mitjana");
    }
}
