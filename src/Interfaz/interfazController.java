package Interfaz;

import Objetos.TablaCodigo;
import Objetos.TablaSimbolos;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

public class interfazController implements Initializable{

    @FXML private TextArea codigoTextArea;
    @FXML private ListView lineaCodigoList;
    @FXML private ListView lineaErrorList;
    
    @FXML private TableView<TablaSimbolos> tablaSimbolosTable;
    @FXML private TableColumn tokenTableColumn;
    @FXML private TableColumn cantidadTableColumn;
    @FXML private TableColumn tipoTableColumn;
    ObservableList<TablaSimbolos> tablaSimbolosObservableList;

    @FXML private TextArea consolaTextArea;
    
    @FXML private JFXButton generarTablaSimbolosButton;
    @FXML private JFXButton ejecutarButton;
    @FXML private JFXButton limpiarButton;

    

    @FXML
    void ejecutarButtonEvent(ActionEvent event) {
        String textoConsola = codigoTextArea.getText();
    }

    @FXML
    void generarTablaSimbolosButtonEvent(ActionEvent event) {
        mostrarTablaSimbolos();
    }

    @FXML
    void limpiarButtonEvent(ActionEvent event) {
        codigoTextArea.setText("");
        tablaSimbolosTable.getItems().clear();
        consolaTextArea.setText("");
        lineaCodigoList.getItems().clear();
        lineaErrorList.getItems().clear();
    }
    
//    eliminar
    private void mostrarTablaCodigo(){
        List<TablaCodigo> datosTablaCodigo = FXCollections.observableArrayList();
        for(int i=0;i<10;i++){
            datosTablaCodigo.add(new TablaCodigo("i",i));    
        }
        
        ObservableList datosLineaError = FXCollections.observableArrayList();
        ObservableList datosNumeroLinea = FXCollections.observableArrayList();
        
        for(int i=0;i<10;i++){
            if(i==5){
                datosLineaError.add(datosTablaCodigo.get(i).getLineaError());  
            }else{
                datosLineaError.add("");
            }
        }
        
        for(int i=0;i<10;i++){
            datosNumeroLinea.add(datosTablaCodigo.get(i).getNumeroLinea());    
        }
        
        lineaErrorList.setItems(datosLineaError);
        lineaCodigoList.setItems(datosNumeroLinea); 
        
//        String DEFAULT_CONTROL_INNER_BACKGROUND = "#FFFFFF";
//        String HIGHLIGHTED_CONTROL_INNER_BACKGROUND = "#8B0000";
//        
//        lineaErrorList.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
//            @Override
//            public ListCell<String> call(ListView<String> param) {
//                return new ListCell<String>() {
//                    @Override
//                    protected void updateItem(String item, boolean empty) {
//                        super.updateItem(item, empty);
//                        if (item == null || empty) {
//                            setText(null);
//                            setStyle("-fx-control-inner-background: " + DEFAULT_CONTROL_INNER_BACKGROUND + ";");
//                        } else {
//                            setText(item);
//                            if (item.startsWith("J")) {
//                                setStyle("-fx-control-inner-background: " + HIGHLIGHTED_CONTROL_INNER_BACKGROUND + ";");
//                            } else {
//                                setStyle("-fx-control-inner-background: " + DEFAULT_CONTROL_INNER_BACKGROUND + ";");
//                            }
//                        }
//                    }
//                };
//            }
//        });
    }
    
//    Usar esta funcion
//    private void mostrarTablaCodigo(List<TablaCodigo> tablaCodigo){
//        List<TablaCodigo> datosTablaCodigo = FXCollections.observableArrayList();
//        
//        for(TablaCodigo data: tablaCodigo){
//            datosTablaCodigo.add(data);    
//        }
//        
//        ObservableList datosLineaError = FXCollections.observableArrayList();
//        ObservableList datosNumeroLinea = FXCollections.observableArrayList();
//        
//        for(TablaCodigo data: tablaCodigo){
//            datosLineaError.add(data.getLineaError());  
//        }
//        
//        for(TablaCodigo data: tablaCodigo){
//            datosNumeroLinea.add(data.getNumeroLinea());    
//        }
//        
//        lineaErrorList.setItems(datosLineaError);
//        lineaCodigoList.setItems(datosNumeroLinea); 
//    }
    
//  eliminar
    private void mostrarTablaSimbolos(){
        ObservableList<TablaSimbolos> datosTablaSimbolo = FXCollections.observableArrayList();
        for(int i=0;i<10;i++){
            datosTablaSimbolo.add(new TablaSimbolos("hola",i,"tipo"));    
        }
        
        tokenTableColumn.setCellValueFactory(new PropertyValueFactory<>("token"));
        cantidadTableColumn.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        tipoTableColumn.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        tablaSimbolosObservableList = FXCollections.observableArrayList();
        tablaSimbolosObservableList.setAll(datosTablaSimbolo);
        tablaSimbolosTable.setItems(tablaSimbolosObservableList);    
    }
    
//    Usar esta funcion
//    private void mostrarTablaSimbolos(List<TablaSimbolos> dataTabla){
//        ObservableList<TablaSimbolos> datosTablaSimbolo = FXCollections.observableArrayList();
//        
//        for(TablaSimbolos data: dataTabla){
//            datosTablaSimbolo.add(data);    
//        }
//        
//        tokenTableColumn.setCellValueFactory(new PropertyValueFactory<>("token"));
//        cantidadTableColumn.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
//        tipoTableColumn.setCellValueFactory(new PropertyValueFactory<>("tipo"));
//        tablaSimbolosObservableList = FXCollections.observableArrayList();
//        tablaSimbolosObservableList.setAll(datosTablaSimbolo);
//        tablaSimbolosTable.setItems(tablaSimbolosObservableList);
//        
//    }
    
    
//    ELIMINAR
    private void llenarConsola(){
        consolaTextArea.setText("Hola");
        consolaTextArea.setStyle("-fx-text-fill: #8B0000;");
    }
    
//    usar esta despues
//    private void llenarConsola(String textoConsola,String tipo){
//        if(tipo.equals("error")){
//            consolaTextArea.setText(textoConsola);
//            consolaTextArea.setStyle("-fx-text-fill: #8B0000;");
//        }
//        else{
//            consolaTextArea.setText(textoConsola);
//        }
//    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mostrarTablaCodigo();
        
        llenarConsola();
    }

}
