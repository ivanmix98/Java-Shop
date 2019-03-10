package projecte;

public class Sobretaula extends Pc {
    private int idSobretaula;

    public Sobretaula ( int id, String nom , String categoria, int idSobretaula){
        super(id, nom, categoria);
        this.idSobretaula = idSobretaula;
    }

    public int getIdSobretaula() {
        return idSobretaula;
    }

    public void setIdSobretaula(int idSobretaula) {
        this.idSobretaula = idSobretaula;
    }
}
