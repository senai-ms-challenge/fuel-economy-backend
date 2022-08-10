package com.example.fueleconomybackend.domain;

import javax.persistence.*;

@Entity
public class ModeloVeiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 100, nullable = false)
    private String fabricante;

    public ModeloVeiculo() {
    }

    public ModeloVeiculo(Integer id, String nome, String fabricante) {
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

    public void setNome(String name) {
        this.nome = name;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
