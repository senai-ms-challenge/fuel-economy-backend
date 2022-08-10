package com.example.fueleconomybackend.controller;

import com.example.fueleconomybackend.service.veiculo.SaveVeiculo;
import com.example.fueleconomybackend.service.veiculo.SaveVeiculoInput;
import com.example.fueleconomybackend.service.veiculo.SaveVeiculoOutput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    private final SaveVeiculo save;

    public VeiculoController(SaveVeiculo save) {
        this.save = save;
    }

    @PostMapping
    public ResponseEntity<SaveVeiculoOutput> saveVeiculo(@RequestBody SaveVeiculoInput input) {
        SaveVeiculoOutput saved = this.save.execute(input);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saved.getId()).toUri();

        return ResponseEntity.created(uri).body(saved);
    }

}
