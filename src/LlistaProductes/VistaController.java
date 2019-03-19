package LlistaProductes;

import Producte.Producte;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class VistaController implements Initializable {

    // botons
    @FXML private Button aniadirBT;
    @FXML private Button modificarBT;
    @FXML private Button eliminarBT;
    @FXML private Button nuevoBT;
    
    // textfields
    @FXML private TextField nombreTF;
    @FXML private TextField QuantitatTF;
    @FXML private TextField PreuTF;
    
    // taula amb columnes
    @FXML private TableView<Producte> tablaProductes;
    @FXML private TableColumn nombreCL;
    @FXML private TableColumn QuantitatCL;
    @FXML private TableColumn PreuCL;
    ObservableList<Producte> productes;
    
    private int posicionProducteEnTabla;

    @FXML private void nuevo(ActionEvent event) {
        nombreTF.setText("");
        QuantitatTF.setText("");
        PreuTF.setText("");
        modificarBT.setDisable(true);
        eliminarBT.setDisable(true);
        aniadirBT.setDisable(false);
    }

    @FXML private void aniadir(ActionEvent event) {
        Producte producte = new Producte();
        producte.nombre.set(nombreTF.getText());
        producte.quantitat.set(Integer.parseInt(QuantitatTF.getText()));
        producte.preu.set(Integer.parseInt(PreuTF.getText()));
        productes.add(producte);
    }

    @FXML private void modificar(ActionEvent event) {
        Producte producte = new Producte();
        producte.nombre.set(nombreTF.getText());
        producte.quantitat.set(Integer.parseInt(QuantitatTF.getText()));
        producte.preu.set(Integer.parseInt(PreuTF.getText()));
        productes.set(posicionProducteEnTabla, producte);
    }

    @FXML private void eliminar(ActionEvent event) {
        productes.remove(posicionProducteEnTabla);
    }

    private final ListChangeListener<Producte> selectorTablaProductes =
            new ListChangeListener<Producte>() {
                @Override
                public void onChanged(Change<? extends Producte> c) {
                    ponerProducteSeleccionat();
                }
            };

     // seleccionar una fila de la taula

    public Producte getTaulaProductesSeleccionat() {
        if (tablaProductes != null) {
            List<Producte> tabla = tablaProductes.getSelectionModel().getSelectedItems();
            if (tabla.size() == 1) {
                final Producte competicionSeleccionada = tabla.get(0);
                return competicionSeleccionada;
            }
        }
        return null;
    }

     //per colocar les dades en els texfield

    private void ponerProducteSeleccionat() {
        final Producte producte = getTaulaProductesSeleccionat();
        posicionProducteEnTabla = productes.indexOf(producte);

        if (producte != null) {
            // textFields amb les dades corresponents
            nombreTF.setText(producte.getNombre());
            QuantitatTF.setText(producte.getQuantitat().toString());
            PreuTF.setText(producte.getPreu().toString());

            // botons estat inicial
            modificarBT.setDisable(false);
            eliminarBT.setDisable(false);
            aniadirBT.setDisable(true);
        }
    }

    /**
     * iniciar taula
     */
    private void inicializarTablaProductes() {
        nombreCL.setCellValueFactory(new PropertyValueFactory<Producte, String>("nombre"));
        QuantitatCL.setCellValueFactory(new PropertyValueFactory<Producte, Integer>("quantitat"));
        PreuCL.setCellValueFactory(new PropertyValueFactory<Producte, String>("preu"));

        productes = FXCollections.observableArrayList();
        tablaProductes.setItems(productes);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // Inicialitzar la taula
        this.inicializarTablaProductes();

        // Posar els botons off
        modificarBT.setDisable(true);
        eliminarBT.setDisable(true);

        // Mostrar les dades en el lloc que volem
        final ObservableList<Producte> tablaProducteSel = tablaProductes.getSelectionModel().getSelectedItems();
        tablaProducteSel.addListener(selectorTablaProductes);

        Producte p1 = new Producte();
        Producte p2 = new Producte();
        Producte p3 = new Producte();
        Producte p4 = new Producte();
        Producte p5 = new Producte();
        Producte p6 = new Producte();
        Producte p7 = new Producte();
        Producte p8 = new Producte();
        Producte p9 = new Producte();
        Producte p10 = new Producte();


        p1.nombre.set("Sony pantalla plana");
        p1.quantitat.set(5);
        p1.preu.set(750);
        productes.add(p1);

        p2.nombre.set("Teclat racer");
        p2.quantitat.set(15);
        p2.preu.set(30);
        productes.add(p2);

        p3.nombre.set("Pc MasterRace");
        p3.quantitat.set(10);
        p3.preu.set(25);
        productes.add(p3);

        p4.nombre.set("Huawei P20 lite");
        p4.quantitat.set(30);
        p4.preu.set(200);
        productes.add(p4);

        p5.nombre.set("iPhone X");
        p5.quantitat.set(99);
        p5.preu.set(1100);
        productes.add(p5);

        p6.nombre.set("Samsung Galaxy S8");
        p6.quantitat.set(100);
        p6.preu.set(1000);
        productes.add(p6);

        p7.nombre.set("TV Samsung Color");
        p7.quantitat.set(42);
        p7.preu.set(700);
        productes.add(p7);

        p8.nombre.set("Portatil MSI GL.63");
        p8.quantitat.set(15);
        p8.preu.set(939);
        productes.add(p8);

        p9.nombre.set("ACER Nitro 5");
        p9.quantitat.set(200);
        p9.preu.set(899);
        productes.add(p9);

        p10.nombre.set("LG OLED77C8LLA 77º");
        p10.quantitat.set(1);
        p10.preu.set(5699);
        productes.add(p10);
    }
}
