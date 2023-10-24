package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import dao.AeropuertoDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Aeropuertos;

public class AeropuertosTabla implements Initializable {

    @FXML
    private MenuItem mnItAniadirAeropuerto;

    @FXML
    private MenuItem mnItEditarAeropuerto;

    @FXML
    private MenuItem mnItBorrarAeropuerto;

    @FXML
    private MenuItem mnItMostarAeropuerto;

    @FXML
    private MenuItem mnItAniadirAvion;

    @FXML
    private MenuItem mnItActivarAvion;

    @FXML
    private MenuItem mnItBorrarAvion;

    @FXML
    private RadioButton rdBtnPublico;

    @FXML
    private ToggleGroup categoria;

    @FXML
    private RadioButton rdBtnPrivados;

    @FXML
    private TextField txtVNombre;

    @FXML
    private TableView<Aeropuertos> tbViewAeropuertos;

    @FXML
    private TableColumn<Aeropuertos, Integer> tbColId;

    @FXML
    private TableColumn<Aeropuertos, String> tbColNombre;

    @FXML
    private TableColumn<Aeropuertos, String> tbColPais;

    @FXML
    private TableColumn<Aeropuertos, String> tbColCiudad;

    @FXML
    private TableColumn<Aeropuertos, String> tbColCalle;

    @FXML
    private TableColumn<Aeropuertos, Integer> tbColNumero;

    @FXML
    private TableColumn<Aeropuertos, Integer> tbColAnio;

    @FXML
    private TableColumn<Aeropuertos, Integer> tbColCapacidad;
    
    @FXML
    private TableColumn<Aeropuertos, Integer> tbColNumSocios;
    
    @FXML
    private TableColumn<Aeropuertos, Integer> tbColFinanciacion;
    
    @FXML
    private TableColumn<Aeropuertos, Integer> tbColNumTrabajadores;
    
    private AeropuertoDao aeropuertoD;
    
    private ObservableList<Aeropuertos> lstAeropuertos;
    
    @FXML
    void activarAvion(ActionEvent event) {
    	
    }

    @FXML
    void aniadirAeropuerto(ActionEvent event) {
    	
    }

    @FXML
    void aniadirAvion(ActionEvent event) {

    }

    @FXML
    void borrarAeropuerto(ActionEvent event) {

    }

    @FXML
    void borrarAvion(ActionEvent event) {

    }

    @FXML
    void editarAeropuerto(ActionEvent event) {

    }

    @FXML
    void filtrarNombre(ActionEvent event) {

    }

    @FXML
    void mostrarAeropuerto(ActionEvent event) {
    	
    }
    
    private void getTabla(ActionEvent event) {
    	if (rdBtnPublico.isSelected()) {
    		tbColNumSocios.setVisible(false);
    		tbColFinanciacion.setVisible(true);
    		tbColNumTrabajadores.setVisible(true);
    		
    		lstAeropuertos = aeropuertoD.cargarAeropuertosPublicos();
    		tbViewAeropuertos.setItems(aeropuertoD.cargarAeropuertosPublicos());
    	}
    	if (rdBtnPrivados.isSelected()) {
    		tbColNumSocios.setVisible(true);
    		tbColFinanciacion.setVisible(false);
    		tbColNumTrabajadores.setVisible(false);
    		
    		lstAeropuertos = aeropuertoD.cargarAeropuertosPrivados();
    		tbViewAeropuertos.setItems(aeropuertoD.cargarAeropuertosPrivados());
    	}
    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		rdBtnPublico.setOnAction(e -> getTabla(e));
		rdBtnPrivados.setOnAction(e -> getTabla(e));
		
		// TODO Auto-generated method stub
		tbColId.setCellValueFactory(new PropertyValueFactory<Aeropuertos, Integer>("id"));
		tbColNombre.setCellValueFactory(new PropertyValueFactory<Aeropuertos, String>("Nombre"));
		tbColPais.setCellValueFactory(new PropertyValueFactory<Aeropuertos, String>("pais"));
		tbColCiudad.setCellValueFactory(new PropertyValueFactory<Aeropuertos, String>("Ciudad"));
		tbColCalle.setCellValueFactory(new PropertyValueFactory<Aeropuertos, String>("Calle"));
		tbColNumero.setCellValueFactory(new PropertyValueFactory<Aeropuertos, Integer>("numero"));
		tbColAnio.setCellValueFactory(new PropertyValueFactory<Aeropuertos, Integer>("anio"));
		tbColCapacidad.setCellValueFactory(new PropertyValueFactory<Aeropuertos, Integer>("Capacidad"));
		// Tabla Aeropuerto Privado
		tbColNumSocios.setCellValueFactory(new PropertyValueFactory<Aeropuertos, Integer>("numSocios"));
		// Tabla Aeropuertos Público
		tbColFinanciacion.setCellValueFactory(new PropertyValueFactory<Aeropuertos, Integer>("financiacion"));
		tbColNumTrabajadores.setCellValueFactory(new PropertyValueFactory<Aeropuertos, Integer>("numTrabajadores"));
		
		
		
		aeropuertoD = new AeropuertoDao();
		
		lstAeropuertos = aeropuertoD.cargarAeropuertosPrivados();
		
		tbViewAeropuertos.setItems(aeropuertoD.cargarAeropuertosPrivados());
	}
}
