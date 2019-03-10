package projecte;

public class Portatil extends Pc{
    private int idPortatil;

    public Portatil ( int id, String nom , String categoria, int idPortatil){
        super(id, nom, categoria);
        this.idPortatil = idPortatil;
    }

    public int getIdPortatil() {
        return idPortatil;
    }

    public void setIdPortatil(int idPortatil) {
        this.idPortatil = idPortatil;
    }
}
