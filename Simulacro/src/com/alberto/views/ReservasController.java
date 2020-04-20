package com.alberto.views;

import com.alberto.logic.Logica;
import com.alberto.logic.utils.Utils;
import com.alberto.models.Reserva;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class ReservasController implements Initializable {

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Button btnReservar;

    @FXML
    private TableView<Reserva> tvAulas;

    @FXML
    private Button btnLiberar;

    @FXML
    public void reservar(){
        String aula = comboBox.getSelectionModel().getSelectedItem();
        Date fecha = Utils.convertToDate(datePicker.getValue());

        Reserva reserva = new Reserva(aula, fecha);
        Logica.getInstance().addReserva(reserva);
    }

    @FXML
    public void liberar(){
        Reserva reserva = tvAulas.getSelectionModel().getSelectedItem();
        Logica.getInstance().removeReserva(reserva);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(Logica.getInstance().getListaAulas());
        tvAulas.setItems(Logica.getInstance().getListaReservas());
    }
}
