package projecte;

import java.util.Calendar;

public abstract class Treballador implements IPersona, Comparable<Treballador> {
    private String nom, cognom, DNI,adreca;
    private int num;
    private double salari;

    public Treballador(String nom, String cognom, String DNI, String adreca, int num, double salari ) {
        this.nom = nom;
        this.cognom = cognom;
        this.DNI = DNI;
        this.adreca = adreca;
        this.num = num;
        this.salari = salari;
    }

    public int compareTo(Treballador a) {
        return this.cognom.compareTo(a.cognom);
    }
    public static void diadepago(){
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(Calendar.DATE, 25);

        System.out.println("Cobro el: "+ fecha1.get(Calendar.DATE) +" de cada mes");
    }

    public abstract String toString();

    public abstract String treballar();

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getCognom() { return cognom; }
    public void setCognom(String cognom) { this.cognom = cognom; }
    public String getDNI() { return DNI; }
    public void setDNI(String dNI) { DNI = dNI; }
    public int getNum() { return num; }
    public void setNum(int num) { this.num = num; }
    public String getAdreca() { return adreca; }
    public void setAdreca(String adreca) { this.adreca = adreca; }
    public double getSalari() { return salari; }
    public void setSalari(double salari) { this.salari = salari; }
}
