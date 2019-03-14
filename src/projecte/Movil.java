package projecte;

public class Movil extends Producte implements IVoluminos {
    private  int mesura;
    private  String versio;

    public Movil ( int id, String nom, double preu, int mesura, String versio){
        super(id, nom, preu);
        this.mesura = mesura;
        this.versio = versio;
    }

    public  int getMesura() {
        return mesura;
    }

    public void setMesura(int mesura) {
        this.mesura = mesura;
    }

    public  String getVersio() {
        return versio;
    }

    public void setVersio(String versio) {
        this.versio = versio;
    }

    public void Gran(){
         System.out.println("Aquest movil es més gran que la mitjana");
    }
    public void Petit(){
        System.out.println("Aquest movil es més petit que la mitjana");
    }

    public String toString(){
        return "\n" + this.getClass().getSimpleName() + "\n ID Producte: " + this.getId() + "\n Nom producte: " + this.getNom()  + "\n Mesura: " + this.getMesura() + "\n Versió:" + this.getVersio() + "\n Preu: " + this.getPreu() + "€";
    }
}
