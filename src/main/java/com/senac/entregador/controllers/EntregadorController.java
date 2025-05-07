package com.senac.entregador.controllers;

import com.senac.entregador.dtos.EntregadorDTO;
import com.senac.entregador.entities.Entregador;
import com.senac.entregador.services.EntregadorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entregador")
@Tag(name = "Entregador", description = "API para Entregador")
public class EntregadorController {

    @Autowired
    private EntregadorService entregadorService;

    @PostMapping("/adicionar")
    @Operation(summary = "Adicionar entregador", description = "Adicionar registro do entregador no banco")
    public ResponseEntity<Entregador> adicionarEntregador(@RequestBody EntregadorDTO entregadorDTO){
        Entregador saveEntregador = entregadorService.adicionarEntregador(entregadorDTO);
        return ResponseEntity.ok().body(saveEntregador);
    }

}
