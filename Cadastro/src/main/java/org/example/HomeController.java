package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class HomeController {

    @FXML
    private void switchToClient() throws IOException {
        App.setRoot("client");

    }
}
