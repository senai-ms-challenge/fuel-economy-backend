package com.example.fueleconomybackend.service.modeloveiculo;

public class SaveModeloVeiculoInput {
    private String nome;
    private String fabricante;

    public SaveModeloVeiculoInput() {
    }

    public SaveModeloVeiculoInput(String nome, String fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
