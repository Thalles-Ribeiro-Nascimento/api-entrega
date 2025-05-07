package com.senac.entregador.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "entregador")
public class Entregador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int entregador_id;

    private String entregador_nome;
    private String entregador_telefone;
    private String entregador_identificacao;
    private int entregador_status;

    public int getEntregador_id() {
        return entregador_id;
    }

    public void setEntregador_id(int entregador_id) {
        this.entregador_id = entregador_id;
    }

    public String getEntregador_nome() {
        return entregador_nome;
    }

    public void setEntregador_nome(String entregador_nome) {
        this.entregador_nome = entregador_nome;
    }

    public String getEntregador_telefone() {
        return entregador_telefone;
    }

    public void setEntregador_telefone(String entregador_telefone) {
        this.entregador_telefone = entregador_telefone;
    }

    public String getEntregador_identificacao() {
        return entregador_identificacao;
    }

    public void setEntregador_identificacao(String entregador_identificacao) {
        this.entregador_identificacao = entregador_identificacao;
    }

    public int getEntregador_status() {
        return entregador_status;
    }

    public void setEntregador_status(int entregador_status) {
        this.entregador_status = entregador_status;
    }
}
