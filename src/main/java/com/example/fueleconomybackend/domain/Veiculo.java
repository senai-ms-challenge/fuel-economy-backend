package com.example.fueleconomybackend.domain;

import javax.persistence.*;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10, nullable = false)
    private String placa;

    @Column(nullable = false)
    private Float volumeReservatorio;

    @Column(nullable = false)
    private Integer anoFabricacao;

    @Column(nullable = false)
    private Integer anoModelo;

    @Column(nullable = false)
    private Float hodometro_inicial;

    @ManyToOne
    private ModeloVeiculo modeloVeiculo;

    public Veiculo() {
    }

    public Veiculo(Integer id, String placa, Float volumeReservatorio, Integer anoFabricacao, Integer anoModelo, Float hodometro_inicial, ModeloVeiculo modeloVeiculo) {
        this.id = id;
        this.placa = placa;
        this.volumeReservatorio = volumeReservatorio;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.hodometro_inicial = hodometro_inicial;
        this.modeloVeiculo = modeloVeiculo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Float getVolumeReservatorio() {
        return volumeReservatorio;
    }

    public void setVolumeReservatorio(Float volumeReservatorio) {
        this.volumeReservatorio = volumeReservatorio;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Float getHodometro_inicial() {
        return hodometro_inicial;
    }

    public void setHodometro_inicial(Float hodometro_inicial) {
        this.hodometro_inicial = hodometro_inicial;
    }

    public ModeloVeiculo getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(ModeloVeiculo modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }
}
