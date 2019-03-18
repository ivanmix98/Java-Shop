package projecte;

public class Client {
    private String cognom;
    private String nom;
    private String fechacompra;

    public Client ( String nom, String cognom, String fechacompra ){
        this.nom = nom;
        this.cognom = cognom;
        this.fechacompra = fechacompra;
    }

    public void saludar()
    {
        System.out.println("Hola!");
    }
    public void despedirse()
    {
        System.out.println("Adeu! Que vagi bé!");
    }


    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getFechacompra() { return fechacompra; }
    public void setFechacompra(String fechacompra) { this.fechacompra = fechacompra; }
    public String getCognom() { return cognom; }
    public void setCognom(String cognom) { this.cognom = cognom; }
}
