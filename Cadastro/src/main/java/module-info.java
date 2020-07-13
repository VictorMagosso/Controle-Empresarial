module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires hibernate.jpa;

    opens org.example to javafx.fxml;
    exports org.example;
}