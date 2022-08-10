package com.example.fueleconomybackend.service.modeloveiculo;

import java.util.Objects;

public class ModeloVeiculoOutput {
    private Integer id;
    private String nome;
    private String fabricante;

    public ModeloVeiculoOutput() {
    }

    public ModeloVeiculoOutput(Integer id, String nome, String fabricante) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
