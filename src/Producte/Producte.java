package Producte;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Producte {
    
    public SimpleStringProperty nombre = new SimpleStringProperty();
    public SimpleIntegerProperty quantitat = new SimpleIntegerProperty();
    public SimpleIntegerProperty preu = new SimpleIntegerProperty();

    
    public String getNombre(){
        return nombre.get();
    }
    
    public Integer getQuantitat (){
        return quantitat.get();
    }
    
    public Integer getPreu(){
        return preu.get();
    }
    
}