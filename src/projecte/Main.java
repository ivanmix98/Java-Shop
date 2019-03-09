package projecte;

//USO DE LAMBDAS
interface Treballadors {
    int quantitat();
}
//USO DE LAMBDAS
interface TotalTreballadors {
    int quantitat(int g, int e);
}

public class Main {

    public static void main(String[] args) {

        Caixa<String , Integer> caixa= new Caixa<String, Integer>();

        caixa.add(new String("Teclat logitech"), new Integer(25));

        System.out.printf("Producte: %s\n", caixa.getObjeto());
        System.out.printf("Preu: %s\n", caixa.getObjeto2());


        //USO DE LAMBDAS
        Treballadors gerents;
        gerents=()->2;
        System.out.println("Gerents actuals: "+gerents.quantitat());

        Treballadors empleats;
        empleats=()->5;
        System.out.println("Empleats actuals: "+empleats.quantitat());

        TotalTreballadors totals= (g,e)-> (g+e);
        System.out.println("Treballadors totals: "+totals.quantitat(2,5));

    }
}