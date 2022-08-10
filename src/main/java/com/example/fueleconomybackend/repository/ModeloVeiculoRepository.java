package com.example.fueleconomybackend.repository;

import com.example.fueleconomybackend.domain.ModeloVeiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloVeiculoRepository extends JpaRepository<ModeloVeiculo, Integer> {
}
