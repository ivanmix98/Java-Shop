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

            Producte p1 = new Portatil(1,"test1", 600,"portatil",12345);
            Producte p2 = new Sobretaula(2,"test2", 1200,"Sobretaula", 67890);
            Treballador g1 = new Gerent("arnau","elias","12345678X","calle novenoventa",11,1800);
            Treballador g2 = new Gerent("Ivan","fontclara","87654321W","calle falsa",123,1801);
            Televisio objetoExterno = new Televisio(3,"pantalla1",1000,2,2017);
            Producte pila1 = new Portatil(1,"LG", 900,"portatil",12345);
            Producte pila2 = new Sobretaula(2,"ASUS", 1000,"Sobretaula", 67890);
            Producte cua1 = new Movil(1,"Samsung",600, 5, "S6");
            Producte cua2 = new Movil(2,"iPhone", 1200,3, "X");
            Producte cua3 = new Movil(3,"Huawei", 200,4, "2");
            Producte cua4 = new Movil(4,"Xiaomi", 230,4, "3");
            Producte m = new Movil(1,"Samsung", 250,5, "J7");
            Producte o = new Movil(2,"Lg",150, 2, "V2");
            Producte s = new Movil(1,"Samsung",900, 5, "S7");
            Producte t = new Movil(2,"Lg", 200,2, "V3");
            Treballador sort1 = new Empleat("Hector", "Zeto", "27164902Q", "Calle 123",689493,1000.101);
            Treballador sort2 = new Empleat("Aaron", "Yolo", "63038890F", "Calle 567", 689493,1000.101);
            Treballador sort3 = new Empleat("Albert", "Navas", "34386054L", "Calle 556",689493,1000.101);
            Treballador sort4 = new Empleat("Pepe", "Blázquez", "05760496P", "Calle 111",689493,1000.101);
            Treballador sort5 = new Empleat("Pepe", "Vázquez", "07107542J", "Calle 116",689493,1000.101);
            Producte herencia1 = new Movil(1,"Samsung", 1000,5, "S8");
            Producte herencia2 = new Movil(1,"Lg", 100,1, "V1");
            Treballador e1 = new Empleat("Pepe", null, null, null, 0, 0);
            Treballador e2 = new Empleat("Pepe", null, null, null, 0, 0);
            Treballador e3 = new Empleat("Maria", null, null, null, 0, 0);
            Treballador e4 = new Empleat("Carla", null, null, null, 0, 0);

            int gestio;
            Scanner scan = new Scanner(System.in);
            System.out.println("Hola gerent, sistema iniciat... Escull l'operació a fer:");
        System.out.println("1 - Llista de productes en stock");
            gestio = scan.nextInt();
            switch(gestio){

                case 1:
                    //productes
                    System.out.println(p1);
                    System.out.println(p2);
                    System.out.println(pila1);
                    System.out.println(pila2);
                    System.out.println(cua1);
                    System.out.println(cua2);
                    System.out.println(cua3);
                    System.out.println(cua4);
                    System.out.println(m);
                    System.out.println(o);
                    System.out.println(s);
                    System.out.println(t);
                    System.out.println(herencia1);
                    System.out.println(herencia2);
                    break;
                case 2:
                    //us de classe generica
                    Caixa<String , Integer> caixa= new Caixa<String, Integer>();
                    caixa.add(new String("Teclat logitech"), new Integer(25));

                    System.out.printf("Producte: %s\n", caixa.getObjeto());
                    System.out.printf("Preu: %s\n", caixa.getObjeto2());
                    break;
                case 3:
                    //USO DE LAMBDAS
                    Treballadors gerents;
                    gerents=()->2;
                    System.out.println("Gerents actuals: "+gerents.quantitat());

                    Treballadors empleats;
                    empleats=()->5;
                    System.out.println("Empleats actuals: "+empleats.quantitat());

                    TotalTreballadors totals= (g,e)-> (g+e);
                    System.out.println("Treballadors totals: "+totals.quantitat(2,5));
                    break;

                case 4:
                    //treballadors mostrant atribut estatic i metode
                    System.out.println("En el contracte el minim a cobrar es: "+((Gerent) g1).getSalaribase());
                    System.out.println("En el contracte el minim a cobrar es: "+((Gerent) g2).getSalaribase());
                    break;
                case 5:
                    //us de metode diferit
                    System.out.println(g1.toString());
                    break;
                case 6:
                    //utilitzant classe interna
                    Televisio.Pantalla objetoInterno = objetoExterno.new Pantalla();
                    objetoInterno.mostrarDimensio();
                    break;
                case 7:
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
                    break;
                case 8:
                    //colecció Piles
                    Stack<Producte> pila = new Stack<Producte>();
                    pila.push(pila1); // adiciona un libro a la pila
                    pila.push(pila2);
                    System.out.println("\n--Llista marques venudes avui--");
                    while (!pila.isEmpty()){
                        System.out.println(pila.pop().getNom());
                    }
                    break;
                case 9:
                    //colecció Cues
                    Queue<Producte> cua = new LinkedList<Producte>(){};

                    cua.add(cua1);
                    cua.add(cua2);
                    cua.add(cua3);
                    cua.add(cua4);

                    System.out.println("--Llista movils venuts avui--");
                    while (!cua.isEmpty()){
                        Producte a = cua.remove();
                        System.out.println(a.getId()+ " "+ a.getNom());
                    }
                    break;
                case 10:
                    //colecció Conjunts

                    HashSet<Producte> conjunt = new HashSet<Producte>();
                    conjunt.add(m);
                    conjunt.add(m);//no apareixen 2
                    conjunt.add(o);

                    System.out.println("--Llista de movils defectuosos--");
                    for(Iterator it = conjunt.iterator(); it.hasNext();){
                        Producte x = (Producte)it.next();
                        System.out.println(x.getId()+" "+ x.getNom());
                    }
                    break;
                case 11:
                    //Taules dispersio
                    System.out.println("--Filtratge dates devolucio--");

                    Map taulaHash = new HashMap<Producte,String>();
                    taulaHash.put(s,"La data de devolució d'aquest dispositiu és: 02-03-2018 ");
                    taulaHash.put(t,"La data de devolució d'aquest dispositiu és: 12-07-2018");

                    String descripcio = (String) taulaHash.get(s);
                    System.out.println(descripcio);
                    break;
                case 12:
                    //Us de ""interficie""" en una coleccio(Comparable)
                    ArrayList<Treballador> treballadors = new ArrayList<Treballador>();

                    treballadors.add(sort1);
                    treballadors.add(sort2);
                    treballadors.add(sort3);
                    treballadors.add(sort4);
                    treballadors.add(sort5);

                    Collections.sort(treballadors);

                    System.out.println(" Ordenar els treballadors per el cognom");
                    for(int i=0; i<treballadors.size(); i++)
                        System.out.println(treballadors.get(i));
                    break;
                case 13:
                    //herencia multiple
                    System.out.println(" Implementant herencia multiple");

                    ((Movil) herencia1).Gran();
                    ((Movil) herencia2).Petit();
                    break;
                case 14:
                    //us de Comparator
                    System.out.println("Interficie Comparator");
                    System.out.println(e1.equals(e2));
                    System.out.println(e3.equals(e4));
                    break;


            }













    }// cerrar main

}// cerrar clase