package projecte;

public class Sobretaula extends Pc {
    private int idSobretaula;

    public Sobretaula ( int id, String nom , double preu, String categoria, int idSobretaula){
        super(id, nom, preu, categoria);
        this.idSobretaula = idSobretaula;
    }

    public int getIdSobretaula() {
        return idSobretaula;
    }

    public void setIdSobretaula(int idSobretaula) {
        this.idSobretaula = idSobretaula;
    }

    public String toString(){
        return "\n" + this.getClass().getSimpleName() + "\n ID Producte: " + this.getId() + "\n Nom producte: " + this.getNom()  + "\n Categoria: " + this.getCategoria() + "\n ID Sobretaula:" + this.getIdSobretaula() + "\n Preu:" + this.getPreu() + "€";
    }
}
