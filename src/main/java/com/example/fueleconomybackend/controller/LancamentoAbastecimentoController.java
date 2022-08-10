package com.example.fueleconomybackend.controller;

import com.example.fueleconomybackend.domain.LancamentoAbastecimento;
import com.example.fueleconomybackend.service.lancamentoabastecimento.SaveLancamentoAbastecimento;
import com.example.fueleconomybackend.service.lancamentoabastecimento.SaveLancamentoAbastecimentoInput;
import com.example.fueleconomybackend.service.lancamentoabastecimento.SaveLancamentoAbastecimentoOutput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/lancamento-abastecimentos")
public class LancamentoAbastecimentoController {

    private final SaveLancamentoAbastecimento save;

    public LancamentoAbastecimentoController(SaveLancamentoAbastecimento save) {
        this.save = save;
    }

    @PostMapping
    public ResponseEntity<SaveLancamentoAbastecimentoOutput> saveLancamentoAbastecimento(@RequestBody SaveLancamentoAbastecimentoInput input) {
        SaveLancamentoAbastecimentoOutput saved = this.save.execute(input);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saved.getId()).toUri();

        return ResponseEntity.created(uri).body(saved);
    }

}
