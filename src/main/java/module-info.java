module com.example.textinputdialog_aplicaciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.textinputdialog_aplicaciones to javafx.fxml;
    exports com.example.textinputdialog_aplicaciones;
}