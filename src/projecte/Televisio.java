package projecte;

public class Televisio extends Producte {
    private int quantitat;
    private int any;
     int resolucio = 1080;

    public class Pantalla {
        public void mostrarDimensio(){
            System.out.println("En stock: " + resolucio+"p" );
        }
    }

    public Televisio ( int id, String nom, double preu, int quantitat, int any){
        super(id, nom,preu);
        this.quantitat = quantitat;
        this.any = any;

    }

    public int getQuantitat() {
        return quantitat;
    }

    public int getAny() {
        return any;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public String toString(){
        return "\n" + this.getClass().getSimpleName() + "\n ID Producte: " + this.getId() + "\n Nom producte: " + this.getNom()  + "\n Quantitat: " + this.getQuantitat() + "\n Any:" + this.getAny() + "\n Preu:" + this.getPreu() + "€";
    }


}
