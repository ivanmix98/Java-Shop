package projecte;
import java.util.*;

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
        //us de classe generica
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

        //colecció llistes
        List clients =new ArrayList();
        clients.add("Pepe");
        clients.add("Juan");
        clients.add("Anna");
        System.out.println("--Llista clients--");
        Iterator iterador = clients.iterator();
        while (iterador.hasNext()){
            String element = (String) iterador.next();
            System.out.print(element+" ");
        }

        //colecció Piles
        Stack<Producte> pila = new Stack<Producte>();

        Producte pila1 = new Portatil(1,"LG","portatil",12345);
        Producte pila2 = new Sobretaula(2,"ASUS", "Sobretaula", 67890);

        pila.push(pila1); // adiciona un libro a la pila
        pila.push(pila2);
        System.out.println("\n--Llista marques venudes avui--");
        while (!pila.isEmpty()){
            System.out.println(pila.pop().getNom());
        }
        //colecció Cues

        Queue<Producte> cua = new LinkedList<Producte>(){};
        cua.add(new Movil(1,"Samsung", 5));
        cua.add(new Movil(2,"iPhone", 3));
        cua.add(new Movil(3,"Huawei", 4));
        cua.add(new Movil(4,"Xiaomi", 4));

        System.out.println("--Llista movils venuts avui--");
        while (!cua.isEmpty()){
            Producte a = cua.remove();
            System.out.println(a.getId()+ " "+ a.getNom());
        }

        //colecció Conjunts
        Producte m = new Movil(1,"Samsung", 5);
        Producte o = new Movil(2,"Lg", 2);

        HashSet<Producte> conjunt = new HashSet<Producte>();
        conjunt.add(m);
        conjunt.add(m);//no apareixen 2
        conjunt.add(o);

        System.out.println("--Llista conjunts venuts avui--");
        for(Iterator it = conjunt.iterator(); it.hasNext();){
            Producte x = (Producte)it.next();
            System.out.println(x.getId()+" "+ x.getNom());
        }

    }// cerrar main

}// cerrar clase