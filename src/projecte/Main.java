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

        //productes
        Producte p1 = new Portatil(1,"test1","portatil",12345);
        Producte p2 = new Sobretaula(2,"test2", "Sobretaula", 67890);

        //treballadors mostrant atribut estatic i metode
        Treballador g1 = new Gerent("arnau","elias","12345678X","calle novenoventa",11,1800);
        System.out.println("En el contracte el minim a cobrar es: "+((Gerent) g1).getSalaribase());

        //utilitzant classe interna
        Televisio objetoExterno = new Televisio(3,"pantalla1",2,500);
        Televisio.Pantalla objetoInterno = objetoExterno.new Pantalla();
        objetoInterno.mostrarDimensio();

        //
    }
}