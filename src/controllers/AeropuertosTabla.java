package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class AeropuertosTabla {

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
    private TableView<?> tbViewAeropuertos;

    @FXML
    private TableColumn<?, ?> tbColId;

    @FXML
    private TableColumn<?, ?> tbColNombre;

    @FXML
    private TableColumn<?, ?> tbColPais;

    @FXML
    private TableColumn<?, ?> tbColCiudad;

    @FXML
    private TableColumn<?, ?> tbColCalle;

    @FXML
    private TableColumn<?, ?> tbColNumero;

    @FXML
    private TableColumn<?, ?> tbColAnio;

    @FXML
    private TableColumn<?, ?> tbColCapacidad;

    @FXML
    private TableColumn<?, ?> tbColNumSocios;

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

}
