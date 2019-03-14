package projecte;

public class Televisio extends Producte {
    private int quantitat;
    private int any;
     int resolucio = 1080;

    public class Pantalla {
        public void mostrarDimensio(){
            System.out.println("qualitat de la pantalla: "+ resolucio+"p" );
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
        return "ID Producte: " + this.getId() + " Nom producte: " + this.getNom()  + " Quantitat: " + this.getQuantitat() + " Any:" + this.getAny() + " Preu:" + this.getPreu();
    }


}
