package projecte;

public class Portatil extends Pc{
    private int idPortatil;

    public Portatil ( int id, String nom , double preu, String categoria, int idPortatil){
        super(id, nom, preu, categoria);
        this.idPortatil = idPortatil;
    }

    public int getIdPortatil() {
        return idPortatil;
    }

    public void setIdPortatil(int idPortatil) {
        this.idPortatil = idPortatil;
    }

    @Override
    public String toString(){
        return "\n" + this.getClass().getSimpleName() + "\n ID Producte: " + this.getId() + "\n Nom producte: " + this.getNom()  + "\n Categoria: " + this.getCategoria() + "\n ID Portatil: " + this.getIdPortatil() + "\n Preu:" + this.getPreu() +"€";
    }
}
