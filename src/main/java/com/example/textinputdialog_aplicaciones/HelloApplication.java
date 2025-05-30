package com.example.textinputdialog_aplicaciones;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Optional;

public class HelloApplication extends Application {
    @Override

    public void start(Stage s){
        s.setTitle("Creación de un TextInputDialog");
        VBox r = new VBox();
        TextInputDialog td = new TextInputDialog("ingrese texto aquí");
        td.setHeaderText("Ingrese su nombre, por favor:");

        Button d = new Button("TextInputDialog");

        Label resultadoLabel = new Label();

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                Optional<String> resultado = td.showAndWait();

                if (resultado.isPresent()) {
                    String nombre = resultado.get();
                    resultadoLabel.setText("Ingresaste: " + nombre);

                    // Evita agregar la etiqueta varias veces
                    if (!r.getChildren().contains(resultadoLabel)) {
                        r.getChildren().add(resultadoLabel);
                    }
                }
            }
        };

        d.setOnAction(event);
        r.getChildren().add(d);

        Scene sc = new Scene(r, 500, 300);
        s.setScene(sc);
        s.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}
