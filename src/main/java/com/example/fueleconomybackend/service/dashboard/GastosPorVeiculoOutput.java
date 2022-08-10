package com.example.fueleconomybackend.service.dashboard;

public class GastosPorVeiculoOutput {
    private String nome;
    private String fabricante;
    private String placa;
    private Double gasto;

    public GastosPorVeiculoOutput() {
    }

    public GastosPorVeiculoOutput(String nome, String fabricante, String placa, Double gasto, Double volume) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.placa = placa;
        this.gasto = gasto;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getGasto() {
        return gasto;
    }

    public void setGasto(Double gasto) {
        this.gasto = gasto;
    }

}
