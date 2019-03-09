package projecte;

public class Caixa<T,S> {
    private T objeto;
    private S objeto2;

    public void add(T objeto , S objeto2 ) {
        this.objeto = objeto;
        this.objeto2 = objeto2;
    }

    public void addObjeto2(S objeto2){
        this.objeto2 = objeto2;
    }

    public void addObjeto(T objeto){
        this.objeto = objeto;
    }

    public T getObjeto(){
        return this.objeto;
    }
    public S getObjeto2(){
        return this.objeto2;
    }



}