package com.senac.entregador.services;

import com.senac.entregador.dtos.EntregadorDTO;
import com.senac.entregador.entities.Entregador;
import com.senac.entregador.repositories.EntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregadorService {
    @Autowired
    private EntregadorRepository entregadorRepository;


    public Entregador adicionarEntregador(EntregadorDTO entregadorDTO){
        Entregador entregador = new Entregador();

        entregador.setEntregador_id(entregadorDTO.getEntregador_id());
        entregador.setEntregador_nome(entregadorDTO.getEntregador_nome());
        entregador.setEntregador_telefone(entregadorDTO.getEntregador_telefone());
        entregador.setEntregador_identificacao(entregadorDTO.getEntregador_identificacao());
        entregador.setEntregador_status(1);

        return entregadorRepository.save(entregador);
    }
}
