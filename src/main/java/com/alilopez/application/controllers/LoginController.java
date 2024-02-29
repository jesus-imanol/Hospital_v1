package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Admin;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private Button closeButton;

    @FXML
    private Label errorLog;

    @FXML
    private Button loginButton1;

    @FXML
    private PasswordField passwordText;

    @FXML
    private TextField userText;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void onClickLoginButton(MouseEvent event) {
        String passwordLog;
        String userLog;
        passwordLog= passwordText.getText();
        userLog=userText.getText();
        Admin admin = new Admin();
        if (admin.getUser().equals(userLog) && admin.getPassword().equals(passwordLog)){
            App.newStage("admin-view", "Administrador - View View");
        }
        else{
            errorLog.setText("Inicio de sesion fallido");
        }
    }
    @FXML
    void initialize() {
        closeButton.getStyleClass().setAll("btn","btn-success");
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }
}

