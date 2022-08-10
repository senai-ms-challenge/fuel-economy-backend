package com.example.fueleconomybackend.service.lancamentoabastecimento;

public class SaveLancamentoAbastecimentoInput {

    private String data;
    private Float volume;
    private Float hodometro;
    private Float valorLitro;
    private Integer veiculoId;

    public SaveLancamentoAbastecimentoInput() {
    }

    public SaveLancamentoAbastecimentoInput(String data, Float volume, Float hodometro, Float valorLitro, Integer veiculoId) {
        this.data = data;
        this.volume = volume;
        this.hodometro = hodometro;
        this.valorLitro = valorLitro;
        this.veiculoId = veiculoId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Float getHodometro() {
        return hodometro;
    }

    public void setHodometro(Float hodometro) {
        this.hodometro = hodometro;
    }

    public Float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(Float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public Integer getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Integer veiculoId) {
        this.veiculoId = veiculoId;
    }
}
