package projecte;

public class Portatil extends Pc{
    int idPortatil;

    public Portatil ( int id, String nom , String categoria, int idPortatil){
        super(id, nom, categoria);
        this.idPortatil = idPortatil;
    }

}
