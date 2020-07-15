package org.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.model.Client;

public class ClientController {
    @FXML
    TextField nomeCliente, enderecoCliente, telCliente;
    @FXML
    TextArea obsCliente;
    @FXML
    Label msgErro;

    @FXML
    public void switchToHome() throws IOException {
        App.setRoot("home");
    }
    @FXML
    private void salvarCliente(){
        String campos [] = {
                nomeCliente.toString(),
                enderecoCliente.toString(),
                telCliente.toString(),
                obsCliente.toString()};
        int i = 0;
        while (campos[i].equals(null)){
            if (campos[i].equals("") || campos[i].equals(null)){
                msgErro.setText("Preencha todos os campos obrigatórios");
            }
            i++;
        }
    }
}
