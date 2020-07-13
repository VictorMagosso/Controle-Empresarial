package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.db.DbClients;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class ClientController {
    @FXML
    TextField nomeCliente, enderecoCliente, telCliente;
    @FXML
    TextArea obsCliente;

    public TextField getNomeCliente() {
        return nomeCliente;
    }

    public TextField getEnderecoCliente() {
        return enderecoCliente;
    }

    public TextField getTelCliente() {
        return telCliente;
    }

    public TextArea getObsCliente() {
        return obsCliente;
    }

    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("home");
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementator")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "nome")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @FXML
    private void salvarCliente(){
        DbClients dbClients = new DbClients();
        dbClients.inserirDados();
    }
}
