package projecte;

public class Televisio extends Producte {
    private int quantitat;
    private int preu;
     int resolucio = 1080;

    public class Pantalla {
        public void mostrarDimensio(){
            System.out.println("qualitat de la pantalla: "+ resolucio+"p" );
        }
    }

    public Televisio ( int id, String nom, int quantitat, int preu){
        super(id, nom);
        this.quantitat = quantitat;
        this.preu = preu;

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
