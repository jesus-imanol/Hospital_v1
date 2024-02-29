package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Citas;
import com.alilopez.application.models.Paciente;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;


public class AdminController {
    Citas citas;
    @FXML
    private Button asignServiceBtn;
    @FXML
    private Button noValidarBtn;


    @FXML
    private TextField infoValidarBtn;
    @FXML
    private Button closeAdminBtn;

    @FXML
    private Button validarPacientBtn;
    @FXML
    private Button verPacientBtn1;
    private int m=0;
    private int i=0;
    @FXML
    void onClickAsignServioe(MouseEvent event) {
        App.newStage("servicioMedico-view", "Asignar-Servicio-View");
    }
    @FXML
    void onClickVerPaciente(MouseEvent event) {
        ArrayList<Paciente> citas1=App.getCitass().getPacientes();
        boolean flag;
        do{
            infoValidarBtn.setText(" "+ citas1.get(i));
            i++;
            flag=false;
        }while (flag==true);
    }

    @FXML
    void onClickValidarPaciente(MouseEvent event) {
        ArrayList<Paciente> citas1=App.getCitass().getPacientes();
        boolean flag;
            do{
                citas1.get(m).setStatuss(true);
                m++;
                flag=false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Cita");
                alert.setContentText("Cita validada exitosamente");
                alert.showAndWait();
            }while (flag==true);
    }
    @FXML
    void onClickNoValidarPaciente(MouseEvent event) {
        ArrayList<Paciente> citas1=App.getCitass().getPacientes();
        boolean flag;
        do{
            citas1.get(m).setStatuss(false);
            m++;
            flag=false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Adverencia");
            alert.setContentText("No se le valido al paciente");
            alert.showAndWait();
        }while (flag==true);
    }
    @FXML
    void onClickCloseAdmin(MouseEvent event) {
    App.getStageView().close();
    }

}

