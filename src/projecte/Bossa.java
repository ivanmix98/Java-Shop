package projecte;

import java.util.ArrayList;
import java.util.Iterator;

public class Bossa<T> implements Iterable<T>{

    private ArrayList<T> lista= new ArrayList<T>();
    private int tope;


    public Bossa(int tope) {
        this.tope = tope;
    }

    public void add(T objeto ) {
        if (lista.size()<tope) {

            lista.add(objeto);
        }else {

            throw new RuntimeException("esta ple");
        }

    }
    public Iterator<T> iterator() {
        return lista.iterator();
    }

}