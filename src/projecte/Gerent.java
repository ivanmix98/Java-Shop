package projecte;

import java.util.Calendar;


public class Gerent extends Treballador {

    public Gerent (String nom, String cognom, String DNI, String adreca, int num, double salari) {
        super (nom, cognom, DNI, adreca, num, salari);

    }

    public static void diadepago(){
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(Calendar.DATE, 25);

        System.out.println("Es cobra el: "+fecha1.get(Calendar.DATE) + " de cada mes");
    }

    @Override
    public String toString(){
        return "Envia nomina a " + this.getCognom() + " " + this.getNom()  + ", amb el DNI " + this.getDNI() + ", a l'adreça " + this.getAdreca() + " i al numero " + this.getNum() + " amb el salari " + this.getSalari();
    }

    @Override

    public String treballar(){
        return "Estic treballant!!!";
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
