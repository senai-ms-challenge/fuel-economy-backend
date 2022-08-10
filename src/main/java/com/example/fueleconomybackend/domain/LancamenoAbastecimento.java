package com.example.fueleconomybackend.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class LancamenoAbastecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "date", nullable = false)
    private LocalDate data;

    @Column(nullable = false)
    private Float volume;

    @Column(nullable = false)
    private Float hodometro;

    @Column(nullable = false)
    private Float valorLitro;

    @ManyToOne
    private Veiculo veiculo;

    public LancamenoAbastecimento() {
    }

    public LancamenoAbastecimento(Integer id, LocalDate data, Float volume, Float hodometro, Float valorLitro, Veiculo veiculo) {
        this.id = id;
        this.data = data;
        this.volume = volume;
        this.hodometro = hodometro;
        this.valorLitro = valorLitro;
        this.veiculo = veiculo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
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

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
