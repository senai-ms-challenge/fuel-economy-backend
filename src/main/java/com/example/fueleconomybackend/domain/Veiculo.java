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
}
