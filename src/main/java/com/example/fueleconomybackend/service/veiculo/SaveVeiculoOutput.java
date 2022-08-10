package com.example.fueleconomybackend.service.veiculo;

public class SaveVeiculoOutput {
    private Integer id;
    private String placa;
    private Float volumeReservatorio;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private Float hodometroInicial;
    private Integer modeloVeiculoId;

    public SaveVeiculoOutput() {
    }

    public SaveVeiculoOutput(Integer id, String placa, Float volumeReservatorio, Integer anoFabricacao, Integer anoModelo, Float hodometroInicial, Integer modeloVeiculoId) {
        this.id = id;
        this.placa = placa;
        this.volumeReservatorio = volumeReservatorio;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.hodometroInicial = hodometroInicial;
        this.modeloVeiculoId = modeloVeiculoId;
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

    public void setHodometroInicial(Float hodometroInicial) {
        this.hodometroInicial = hodometroInicial;
    }

    public Integer getModeloVeiculoId() {
        return modeloVeiculoId;
    }

    public void setModeloVeiculoId(Integer modeloVeiculoId) {
        this.modeloVeiculoId = modeloVeiculoId;
    }
}
