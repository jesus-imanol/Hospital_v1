package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Citas;
import com.alilopez.application.models.Doctor;
import com.alilopez.application.models.Farmaceutico;
import com.alilopez.application.models.Paciente;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class CitasController {
    //Citas citas=new Citas();

    @FXML
    private Button agendarCitaBtn;

    @FXML
    private Button buscarEstatusBtn;

    @FXML
    private TextField buscarPacientInput;

    @FXML
    private TextField casoPacientInput;

    @FXML
    private Button closeButton;

    @FXML
    private TextField edadPacientInput;

    @FXML
    private Label estatusPacientLabel;

    @FXML
    private TextField nombrePacientInput;

    @FXML
    private Label registroLabel;

    @FXML
    void onClickAgendarCita(MouseEvent event) {
      String nombrePaciente;
      String edadPaciente;
      String casoPaciente;
      nombrePaciente= nombrePacientInput.getText();
      edadPaciente = edadPacientInput.getText();
      casoPaciente=casoPacientInput.getText();
      Paciente paciente=new Paciente(nombrePaciente,edadPaciente,casoPaciente);
      if (App.getCitass().addPaciente(paciente)){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Citas");
          alert.setContentText("Cita agregada exitosamente");
          alert.showAndWait();
      }
      else {
          registroLabel.setText("Uppss Algo fallo");
      }

    }

    @FXML
    void onClickBuscarEstatus(MouseEvent event) {
        ArrayList<Paciente> citas1= App.getCitass().getPacientes();
        String searchNombre=buscarPacientInput.getText();
        boolean flag=false;
        for (int i = 0; i <citas1.size() && !flag; i++) {
            if (searchNombre.equals(citas1.get(i).getNombrePaciente())){
                flag=true;
                if(citas1.get(i).isStatuss()==true){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Estatus de cita");
                    alert.setContentText("Su cita fue validada"+" ,tu servicio medico es: "+'\n'+citas1.get(i).getNombrePaciente()+App.getPacientes().getServicioMedicos().get(0).toString()+App.getPacientes().getServicioMedicos().get(1).toString()
                    +App.getPacientes().getServicioMedicos().get(2).toString());
                    alert.showAndWait();
                }
                else{
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Lo sentimos");
                    alert.setContentText("El administrador no ha autorizado");
                    alert.showAndWait();
                }
            }
        }
        if(!flag){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Lo sentimos");
            alert.setContentText("El paciente que se registro no existe");
            alert.showAndWait();
            registroLabel.setText(" ");
        }

    }

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();

    }
    void initialize() {
        closeButton.getStyleClass().setAll("btn","btn-success");
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }
}
