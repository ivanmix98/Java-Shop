package projecte;

public class Televisio extends Producte {
    private int quantitat;
    private int preu;

    public class Pantalla {
        int pulzada;

        public Pantalla(int pulzada){
            this.pulzada = pulzada;
        }
    }
    public Televisio ( int id, String nom, int quantitat, int preu,  int pulzada){
        super(id, nom);
        this.quantitat = quantitat;
        this.preu = preu;
        //this.pulzada = pulzada; no se com sagafava
    }

    public int getQuantitat() {
        return quantitat;
    }

    public int getPreu() {
        return preu;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }
}
