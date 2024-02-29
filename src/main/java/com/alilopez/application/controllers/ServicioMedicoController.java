package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Doctor;
import com.alilopez.application.models.Enfermero;
import com.alilopez.application.models.Farmaceutico;
import com.alilopez.application.models.Paciente;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ServicioMedicoController {
    Paciente paciente=App.getPacientes();
    @FXML
    private TextField apellidoDoctorInput;

    @FXML
    private TextField apellidoEnfermeroInput;

    @FXML
    private TextField apellidoFarmaceuticoInput;

    @FXML
    private TextField cargoFarmaceuticoInput;

    @FXML
    private Button closeBtn;

    @FXML
    private TextField edadDoctorInput;

    @FXML
    private TextField edadEnfermeroInput;

    @FXML
    private TextField edadFarmaceuticoInput;

    @FXML
    private TextField especialidadDoctorInput;

    @FXML
    private TextField idDoctorInput;

    @FXML
    private TextField idEnfermeroInput;

    @FXML
    private TextField idFarmaceuticoInput;

    @FXML
    private TextField nombreDoctorInput;

    @FXML
    private TextField nombreEnfermeroInput;

    @FXML
    private TextField nombreFarmaceuticoInput;

    @FXML
    private Button saveDoctorBtn;

    @FXML
    private Button saveEnfermeroBtn;

    @FXML
    private Button saveFarmaButton;

    @FXML
    private TextField tipoEnfermeroInput;

    @FXML
    void onClickSaveDoctor(MouseEvent event) {

        String nombreDoctor=nombreDoctorInput.getText();
        String apellidoDoctor=apellidoDoctorInput.getText();
        String edadDoctor=edadDoctorInput.getText();
        String especialidad= especialidadDoctorInput.getText();
        try{
            int idDoctor=Integer.parseInt(idDoctorInput.getText());
            Doctor doctor=new Doctor(idDoctor,edadDoctor,nombreDoctor,apellidoDoctor,especialidad);
            if(paciente.addServiceMedical(doctor)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Doctor");
                alert.setContentText("Doctor agregado exitosamente");
                alert.showAndWait();
            }
            else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Error");
                alert.setContentText("Algo falló");
                alert.showAndWait();
            }
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setContentText("Se requiere un valor numerico");
            alert.showAndWait();
        }

    }
    
    @FXML
    void onClickSaveEnfermero(MouseEvent event) {
        String nombreEnfer=nombreEnfermeroInput.getText();
        String apellidoEnfer=apellidoEnfermeroInput.getText();
        String edadEnfer=edadEnfermeroInput.getText();
        String tipoEnfer=tipoEnfermeroInput.getText();
        try {
            int idEnfer=Integer.parseInt(idEnfermeroInput.getText());
            Enfermero enfermero=new Enfermero(idEnfer,edadEnfer,nombreEnfer,apellidoEnfer,tipoEnfer);
            if(paciente.addServiceMedical(enfermero)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Enfermero");
                alert.setContentText("Enfermero agregado exitosamente");
                alert.showAndWait();
            }
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setContentText("Se requiere un valor numerico");
            alert.showAndWait();
        }

    }

    @FXML
    void onClickSaveFarma(MouseEvent event) {

        String nombreFarma=nombreFarmaceuticoInput.getText();
        String apellidoFarma=apellidoFarmaceuticoInput.getText();
        String edadFarma=edadFarmaceuticoInput.getText();
        String cargoFarma=cargoFarmaceuticoInput.getText();
        try {

            int idFarma = Integer.parseInt(idFarmaceuticoInput.getText());
            Farmaceutico farmaceutico = new Farmaceutico(idFarma, edadFarma, nombreFarma, apellidoFarma, cargoFarma);
            if (paciente.addServiceMedical(farmaceutico)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Farmaceutico");
                alert.setContentText("Farmaceutico agregado exitosamente");
                alert.showAndWait();
            }
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setContentText("Se requiere un valor numerico");
            alert.showAndWait();
        }
    }

    @FXML
    void onClickcloseService(MouseEvent event) {
        App.getStageView().close();
    }

}
