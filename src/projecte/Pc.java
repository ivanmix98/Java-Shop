package projecte;

public abstract class Pc extends Producte {
    private String categoria;

    public Pc ( int id, String nom , String categoria){
        super(id, nom);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
