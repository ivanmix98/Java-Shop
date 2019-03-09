package projecte;

public class Main {

    public static void main(String[] args) {

        Bossa<Xocolata> bolsa= new Bossa<Xocolata>(2);
        Xocolata c= new Xocolata("milka");
        Xocolata c1= new Xocolata("milka");
        Xocolata c2= new Xocolata("ferrero");

        bolsa.add(c);
        bolsa.add(c1);
        bolsa.add(c2);

        for (Xocolata chocolatina:bolsa) {

            System.out.println(chocolatina.getMarca());
        }
    }
}