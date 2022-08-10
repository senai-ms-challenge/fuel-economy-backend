package com.example.fueleconomybackend.service.modeloveiculo;

import com.example.fueleconomybackend.domain.ModeloVeiculo;
import com.example.fueleconomybackend.repository.ModeloVeiculoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SaveModeloVeiculo {

    private final ModelMapper mapper;
    private final ModeloVeiculoRepository repository;

    public SaveModeloVeiculo(ModelMapper mapper, ModeloVeiculoRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public ModeloVeiculoOutput execute(SaveModeloVeiculoInput saveModeloVeiculoInput) {
        ModeloVeiculo modeloVeiculo = this.mapper.map(saveModeloVeiculoInput, ModeloVeiculo.class);

        modeloVeiculo = this.repository.save(modeloVeiculo);

        return this.mapper.map(modeloVeiculo, ModeloVeiculoOutput.class);
    }

}
