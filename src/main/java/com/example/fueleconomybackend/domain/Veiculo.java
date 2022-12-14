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
    private Float hodometroInicial;

    @ManyToOne
    private ModeloVeiculo modeloVeiculo;

    public Veiculo() {
    }

    public Veiculo(Integer id, String placa, Float volumeReservatorio, Integer anoFabricacao, Integer anoModelo, Float hodometroInicial, ModeloVeiculo modeloVeiculo) {
        this.id = id;
        this.placa = placa;
        this.volumeReservatorio = volumeReservatorio;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.hodometroInicial = hodometroInicial;
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

    public Float getHodometroInicial() {
        return hodometroInicial;
    }

    public void setHodometroInicial(Float hodometro_inicial) {
        this.hodometroInicial = hodometro_inicial;
    }

    public ModeloVeiculo getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(ModeloVeiculo modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }
}
