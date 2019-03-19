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

            Producte p1 = new Portatil(106858,"test1", 600,"portatil",12345);
            Producte p2 = new Sobretaula(37392,"test2", 1200,"Sobretaula", 67890);
            Treballador g1 = new Gerent("Arnau","Elias","12345678X","calle novenoventa",11,1800);
            Treballador g2 = new Gerent("Ivan","Fontclara","87654321W","calle falsa",123,1801);
            Televisio objetoExterno = new Televisio(3676968,"pantalla1",1000,2,2017);
            Producte pila1 = new Portatil(156748478,"LG", 900,"portatil",12345);
            Producte pila2 = new Sobretaula(968682,"ASUS", 1000,"Sobretaula", 67890);
            Producte cua1 = new Movil(1549589,"Samsung",600, 5, "S6");
            Producte cua2 = new Movil(25689948,"iPhone", 1200,3, "X");
            Producte cua3 = new Movil(3545489,"Huawei", 200,4, "2");
            Producte cua4 = new Movil(423587849,"Xiaomi", 230,4, "3");
            Producte m = new Movil(158589,"Samsung", 250,5, "J7");
            Producte o = new Movil(212546,"Lg",150, 2, "V2");
            Producte s = new Movil(170678,"Samsung",1900, 10, "S11");
            Producte t = new Movil(22546,"iPhone", 2000,5, "XIII");
            Treballador sort1 = new Empleat("Hector", "Zeto", "27164902Q", "Calle 123",689493,1000.101);
            Treballador sort2 = new Empleat("Aaron", "Yolo", "63038890F", "Calle 567", 689493,1000.101);
            Treballador sort3 = new Empleat("Willy", "Navas", "34386054L", "Calle 556",689493,1000.101);
            Treballador sort4 = new Empleat("Pepe", "Blázquez", "05760496P", "Calle 111",689493,1000.101);
            Treballador sort5 = new Empleat("Pepe", "Vázquez", "07107542J", "Calle 116",689493,1000.101);
            Producte herencia1 = new Movil(60585981,"Samsung", 1000,5, "S8");
            Producte herencia2 = new Movil(5658781,"Lg", 100,1, "V1");
            Treballador e1 = new Empleat("Pepe", null, null, null, 0, 0);
            Treballador e2 = new Empleat("Pepe", null, null, null, 0, 0);
            Treballador e3 = new Empleat("Maria", null, null, null, 0, 0);
            Treballador e4 = new Empleat("Carla", null, null, null, 0, 0);
            Client c1 = new Client("Mike","Wasowsky","03-02-2019");
            Client c2 = new Client("Mark","Evans","14-02-2019");
            Client c3 = new Client("Axel","Blaze","22-03-2019");
            Client c4 = new Client("Jon","Snow","01-01-2019");
            Client c5 = new Client("David","Storm","06-02-2019");
            Client c6 = new Client("Jhonny","Storm","12-01-2019");
            Client c7 = new Client("Yaiza","Gago","24-02-2019");
            Client c8 = new Client("Carla","Valderas","21-03-2019");
            Client c9 = new Client("Sara","Furiati","15-01-2019");
            Client c10 = new Client("Judit","Martinez","19-03-2019");

            int gestio;
            Scanner scan = new Scanner(System.in);
        System.out.println("Hola director, sistema iniciat... Que vols consultar?:");
        System.out.println("1 - Llista de productes en stock");
        System.out.println("2 - Oferta de la setmana");
        System.out.println("3 - Llistat de gerents");
        System.out.println("4 - Llistat d' empleats");
        System.out.println("5 - Llistat de treballadors");
        System.out.println("6 - Contracte gerents");
        System.out.println("7 - Pagar als gerents");
        System.out.println("8 - Resolucions de TV disponibles");
        System.out.println("9 - Llista clients amb tarjeta descompte");
        System.out.println("10 - Marques de PC més venudes avui");
        System.out.println("11 - Marques de Mòvil més venudes avui");
        System.out.println("12 - Llista dispositius defectuosos");
        System.out.println("13 - Llista de pròxims dispositius disponibles");
        System.out.println("14 - Pagar als treballadors");
        System.out.println("15 - Mòvil min/max");
        System.out.println("16 - Comparable");
        System.out.println("18 - Tancar sistema");
            gestio = scan.nextInt();

        while (gestio<18) {
            switch (gestio) {

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

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 2:
                    //us de classe generica
                    Caixa<String, Integer> caixa = new Caixa<String, Integer>();
                    caixa.add(new String("Teclat logitech"), new Integer(25));

                    System.out.printf("Producte: %s\n", caixa.getObjeto());
                    System.out.printf("Preu: %s\n", caixa.getObjeto2());

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 3:
                    //USO DE LAMBDAS
                    Treballadors gerents;
                    gerents = () -> 2;
                    System.out.println("Gerents: " + gerents.quantitat() + "\n Arnau Elias \n Ivan Fontclara ");

                    System.out.println("");
                    System.out.println("17 - Anar enrere");

                    break;
                case 4:
                    //USO DE LAMBDAS
                    Treballadors empleats;
                    empleats = () -> 5;
                    System.out.println("Empleats actuals: " + empleats.quantitat() + "\n Hector Zeto \n Aaron Yolo \n Willy Navas \n Pepe Blàzquez  \n Pepe Vazquez ");

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 5:
                    //USO DE LAMBDAS
                    TotalTreballadors totals = (g, e) -> (g + e);
                    System.out.println("Treballadors totals: " + totals.quantitat(2, 5) + "\n Arnau Elias \n Ivan Fontclara \n Hector Zeto \n Aaron Yolo \n Willy Navas \n Pepe Blàzquez  \n Pepe Vazquez ");

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 6:
                    //treballadors mostrant atribut estatic i metode
                    System.out.println("En el contracte de " + g1.getNom() + " " + g1.getCognom() + " el minim a cobrar es: " + ((Gerent) g1).getSalaribase());
                    System.out.println("En el contracte de " + g2.getNom() + " " + g2.getCognom() + " el minim a cobrar es: " + ((Gerent) g2).getSalaribase());

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 7:
                    //us de metode diferit
                    System.out.println(g1.toString());
                    System.out.println(g2.toString());

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 8:
                    //utilitzant classe interna
                    Televisio.Pantalla objetoInterno = objetoExterno.new Pantalla();
                    objetoInterno.mostrarDimensio();

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 9:
                    //colecció llistes
                    List<Client> clients = new ArrayList<Client>();
                    clients.add(c1);
                    clients.add(c2);
                    clients.add(c3);
                    clients.add(c4);
                    clients.add(c5);
                    clients.add(c6);
                    clients.add(c7);
                    clients.add(c8);
                    clients.add(c9);
                    clients.add(c10);
                    System.out.println("--Llista clients amb tarjeta descompte--");
                    System.out.println("--Nom || Cognom || Data de alta de la tarjeta--");
                    for (int x = 0; x < clients.size(); x++) {
                        System.out.println("  " + clients.get(x).getNom() + "    " + clients.get(x).getCognom() + "    " + clients.get(x).getFechacompra());
                    }

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 10:
                    //colecció Piles
                    Stack<Producte> pila = new Stack<Producte>();
                    pila.push(pila1); // adiciona un libro a la pila
                    pila.push(pila2);
                    Date today = Calendar.getInstance().getTime();
                    System.out.println("\n--Llista marques més venudes avui (" + today + ") --");
                    while (!pila.isEmpty()) {
                        System.out.println(pila.pop().getNom());
                    }

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 11:
                    //colecció Cues
                    Queue<Producte> cua = new LinkedList<Producte>() {
                    };

                    cua.add(cua1);
                    cua.add(cua2);
                    cua.add(cua3);
                    cua.add(cua4);
                    Date today2 = Calendar.getInstance().getTime();
                    System.out.println("--Llista movils més venuts avui (" + today2 + ") --");
                    while (!cua.isEmpty()) {
                        Producte a = cua.remove();
                        System.out.println(a.getId() + " " + a.getNom());
                    }

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 12:
                    //colecció Conjunts

                    HashSet<Producte> conjunt = new HashSet<Producte>();
                    conjunt.add(m);
                    conjunt.add(m);//no apareixen 2
                    conjunt.add(o);

                    System.out.println("--Llista de dispositius defectuosos--");
                    for (Iterator it = conjunt.iterator(); it.hasNext(); ) {
                        Producte x = (Movil) it.next();
                        System.out.println(x.getId() + " " + x.getNom() + " " + ((Movil) x).getVersio());
                    }

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 13:
                    //Taules dispersio
                    System.out.println("--Futurs productes--");

                    Map taulaHash = new HashMap<Producte, String>();
                    taulaHash.put(s, "La data de llançament del dispositiu " + " " + s.getNom() + " " + ((Movil) s).getVersio() + " dispositiu és: 02-03-2020 ");
                    taulaHash.put(t, "La data de llançament del dispositiu " + " " + t.getNom() + " " + ((Movil) t).getVersio() + "  és: 12-07-2020");

                    String descripcio = (String) taulaHash.get(s);
                    String descripcio2 = (String) taulaHash.get(t);


                    System.out.println(descripcio);
                    System.out.println(descripcio2);

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 14:
                    //Us de ""interficie""" en una coleccio(Comparable)
                    ArrayList<Treballador> treballadors = new ArrayList<Treballador>();

                    treballadors.add(sort1);
                    treballadors.add(sort2);
                    treballadors.add(sort3);
                    treballadors.add(sort4);
                    treballadors.add(sort5);

                    Collections.sort(treballadors);

                    for (int i = 0; i < treballadors.size(); i++)
                        System.out.println(treballadors.get(i));

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 15:
                    //herencia multiple
                    System.out.println("Mòvil min/max");

                    ((Movil) herencia1).Gran();
                    ((Movil) herencia2).Petit();

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;
                case 16:
                    //us de Comparator
                    System.out.println("Interficie Comparator");
                    System.out.println(e1.equals(e2));
                    System.out.println(e3.equals(e4));

                    System.out.println("");
                    System.out.println("17 - Anar enrere");
                    break;


                case 17:
                    System.out.println("Hola director, sistema iniciat... Que vols consultar?:");
                    System.out.println("1 - Llista de productes en stock");
                    System.out.println("2 - Oferta de la setmana");
                    System.out.println("3 - Llistat de gerents");
                    System.out.println("4 - Llistat d' empleats");
                    System.out.println("5 - Llistat de treballadors");
                    System.out.println("6 - Contracte gerents");
                    System.out.println("7 - Pagar als gerents");
                    System.out.println("8 - Resolucions de TV disponibles");
                    System.out.println("9 - Llista clients amb tarjeta descompte");
                    System.out.println("10 - Marques de PC més venudes avui");
                    System.out.println("11 - Marques de Mòvil més venudes avui");
                    System.out.println("12 - Llista dispositius defectuosos");
                    System.out.println("13 - Llista de pròxims dispositius disponibles");
                    System.out.println("14 - Pagar als treballadors");
                    System.out.println("15 - Mòvil min/max");
                    System.out.println("16 - Comparable");
                    System.out.println("18 - Tancar programa");
                    break;
            }

            gestio = scan.nextInt();
        }











    }// cerrar main

}// cerrar clase