package projecte;

public abstract class Pc extends Producte {
        String categoria;

    public Pc ( int id, String nom , String categoria){
        super(id, nom);
        this.categoria = categoria;
    }
}
