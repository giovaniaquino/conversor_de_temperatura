module com.example.conversor_de_temperatura {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.conversor_de_temperatura to javafx.fxml;
    exports com.example.conversor_de_temperatura;
}