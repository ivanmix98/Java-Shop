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
        Treballador g2 = new Gerent("Ivan","fontclara","87654321W","calle falsa",123,1801);
        System.out.println("En el contracte el minim a cobrar es: "+((Gerent) g1).getSalaribase());
        System.out.println("En el contracte el minim a cobrar es: "+((Gerent) g2).getSalaribase());

        //us de metode diferit
        System.out.println(g1.toString());

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
        cua.add(new Movil(1,"Samsung", 5, "Pepe"));
        cua.add(new Movil(2,"iPhone", 3, "Anna"));
        cua.add(new Movil(3,"Huawei", 4, "Joan"));
        cua.add(new Movil(4,"Xiaomi", 4, "Fizz"));

        System.out.println("--Llista movils venuts avui--");
        while (!cua.isEmpty()){
            Producte a = cua.remove();
            System.out.println(a.getId()+ " "+ a.getNom());
        }

        //colecció Conjunts
        Producte m = new Movil(1,"Samsung", 5, "Pepe");
        Producte o = new Movil(2,"Lg", 2, "Anna");

        HashSet<Producte> conjunt = new HashSet<Producte>();
        conjunt.add(m);
        conjunt.add(m);//no apareixen 2
        conjunt.add(o);

        System.out.println("--Llista de movils defectuosos--");
        for(Iterator it = conjunt.iterator(); it.hasNext();){
            Producte x = (Producte)it.next();
            System.out.println(x.getId()+" "+ x.getNom());
        }

        //Taules dispersio
        System.out.println("--Filtratge dates devolucio--");
        Producte s = new Movil(1,"Samsung", 5, "Pepe");
        Producte t = new Movil(2,"Lg", 2, "Anna");

        Map taulaHash = new HashMap<Producte,String>();
        taulaHash.put(s,"La data de devolució d'aquest dispositiu és: 02-03-2018 ");
        taulaHash.put(t,"La data de devolució d'aquest dispositiu és: 12-07-2018");

        String descripcio = (String) taulaHash.get(s);
        System.out.println(descripcio);

        //Us de ""interficie""" en una coleccio(Comparable)
        ArrayList<Treballador> treballadors = new ArrayList<Treballador>();
        treballadors.add(new Empleat("Hector", "Zeto", "27164902Q", "Calle 123",689493,1000.101));
        treballadors.add(new Empleat("Aaron", "Yolo", "63038890F", "Calle 567", 689493,1000.101));
        treballadors.add(new Empleat("Albert", "Navas", "34386054L", "Calle 556",689493,1000.101));
        treballadors.add(new Empleat("Pepe", "Blázquez", "05760496P", "Calle 111",689493,1000.101));
        treballadors.add(new Empleat("Pepe", "Vázquez", "07107542J", "Calle 116",689493,1000.101));

        Collections.sort(treballadors);

        System.out.println(" Ordenar els treballadors per el cognom");
        for(int i=0; i<treballadors.size(); i++)
            System.out.println(treballadors.get(i));

        //herencia multiple
        System.out.println(" Implementant herencia multiple");
        Producte herencia1 = new Movil(1,"Samsung", 5, "Pepe");
        Producte herencia2 = new Movil(1,"Lg", 1, "Juan");
        ((Movil) herencia1).Gran();
        ((Movil) herencia1).Petit();

        //us de Comparator
        System.out.println("Interficie Comparator");
        Empleat e1 = new Empleat("Pepe", null, null, null, 0, 0);
        Empleat e2 = new Empleat("Pepe", null, null, null, 0, 0);

        System.out.println(e1.equals(e2));

        Empleat e3 = new Empleat("Maria", null, null, null, 0, 0);
        Empleat e4 = new Empleat("Carla", null, null, null, 0, 0);

        System.out.println(e3.equals(e4));

    }// cerrar main

}// cerrar clase