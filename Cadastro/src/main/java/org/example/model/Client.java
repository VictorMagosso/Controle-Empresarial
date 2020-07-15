package org.example.model;

import javax.persistence.Entity;
import javax.persistence.Table;

public class Client {
    String nome, endereco, tel, observacoes;

    public Client(String nome, String endereco, String tel, String observacoes) {
        this.nome = nome;
        this.endereco = endereco;
        this.tel = tel;
        this.observacoes = observacoes;
    }

    public Client() {

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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
