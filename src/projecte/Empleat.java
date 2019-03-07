package projecte;

public class Empleat extends Treballador {




    public Empleat (String nom, String cognom, String DNI, String adreca, int num, double salari) {
        super (nom, cognom, DNI, adreca, num, salari);
        ;
    }

    @Override
    public String toString(){
        return "Envia nomina a " + this.getCognom() + " " + this.getNom()  + ", amb el DNI " + this.getDNI() + ", a l'adreça " + this.getAdreca() + " i al numero " + this.getNum() + " amb el salari " + this.getSalari();
    }

    @Override
    public String treballar(){
        return "Estic treballant!!!";
    }

    @Override
    public boolean equals(Object obj) {
        Empleat e= (Empleat)obj;

        return e.getNom().equals(this.getNom());
    }

    public void saludar()
    {
        System.out.println("Hola!");
    }
    public void despedirse()
    {
        System.out.println("Adeu! Que vagi bé!");
    }

}
