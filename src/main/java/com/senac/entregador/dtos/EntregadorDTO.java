package com.senac.entregador.dtos;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

public class EntregadorDTO {
    private int entregador_id;
    private String entregador_nome;
    private String entregador_telefone;
    private String entregador_identificacao;
    private int entregador_status;

    public EntregadorDTO() {}

    public EntregadorDTO(int entregador_id, String entregador_nome, String entregador_telefone, String entregador_identificacao,
                     int entregador_status) {
        this.entregador_id = entregador_id;
        this.entregador_nome = entregador_nome;
        this.entregador_telefone = entregador_telefone;
        this.entregador_identificacao = entregador_identificacao;
        this.entregador_status = entregador_status;

    }

    public int getEntregador_id() {
        return entregador_id;
    }

    public void setEntregador_id(Integer entregador_id) {
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

    public void setEntregador_status(Integer entregador_status) {
        this.entregador_status = entregador_status;
    }
}
