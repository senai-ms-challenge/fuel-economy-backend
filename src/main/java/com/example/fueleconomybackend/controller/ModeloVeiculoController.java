package com.example.fueleconomybackend.controller;

import com.example.fueleconomybackend.service.modeloveiculo.ModeloVeiculoOutput;
import com.example.fueleconomybackend.service.modeloveiculo.SaveModeloVeiculo;
import com.example.fueleconomybackend.service.modeloveiculo.SaveModeloVeiculoInput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/modelo-veiculos")
public class ModeloVeiculoController {

    private final SaveModeloVeiculo save;

    public ModeloVeiculoController(SaveModeloVeiculo save) {
        this.save = save;
    }

    @PostMapping
    public ResponseEntity<ModeloVeiculoOutput> saveModelVeiculo(@RequestBody SaveModeloVeiculoInput input){
        ModeloVeiculoOutput output = this.save.execute(input);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(output.getId()).toUri();

        return ResponseEntity.created(uri).body(output);
    }

}
