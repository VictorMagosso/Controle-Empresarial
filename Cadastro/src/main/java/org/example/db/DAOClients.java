package org.example.db;

import org.example.model.Client;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class DAOClients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nome, endereco, telefone, observacoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    //pra chamar tudo de uma vez do db

    @Override
    public String toString() {
        return "DAOClients{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }

    public void inserirDados(Client client) {
        System.out.println(client);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Cadastro");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(client);
        manager.getTransaction().commit();

        System.out.println(id);
        System.out.println(nome);
        manager.close();
    }
}
