package org.example;

import javafx.fxml.FXML;
import org.example.App;

import java.io.IOException;

public class ProviderController {
    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("home");
    }
}
