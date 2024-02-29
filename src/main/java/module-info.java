module com.alilopez.vererinaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.charm.glisten;
    requires com.gluonhq.attach.display;


    opens com.alilopez.application to javafx.fxml;
    exports com.alilopez.application;
    exports com.alilopez.application.controllers;
    opens com.alilopez.application.controllers to javafx.fxml;
}