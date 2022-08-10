package com.example.fueleconomybackend.service.lancamentoabastecimento;

import java.time.LocalDateTime;

public class SaveLancamentoAbastecimentoOutput {
    private Integer id;
    private LocalDateTime data;
    private Float volume;
    private Float hodometro;
    private Float valorLitro;
    private Integer veiculoId;

    public SaveLancamentoAbastecimentoOutput() {
    }

    public SaveLancamentoAbastecimentoOutput(Integer id, LocalDateTime data, Float volume, Float hodometro, Float valorLitro, Integer veiculoId) {
        this.id = id;
        this.data = data;
        this.volume = volume;
        this.hodometro = hodometro;
        this.valorLitro = valorLitro;
        this.veiculoId = veiculoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
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
