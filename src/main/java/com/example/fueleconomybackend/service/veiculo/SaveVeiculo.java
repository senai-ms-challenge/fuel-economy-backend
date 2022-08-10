package com.example.fueleconomybackend.service.veiculo;

import com.example.fueleconomybackend.domain.ModeloVeiculo;
import com.example.fueleconomybackend.domain.Veiculo;
import com.example.fueleconomybackend.repository.ModeloVeiculoRepository;
import com.example.fueleconomybackend.repository.VeiculoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SaveVeiculo {

    private final VeiculoRepository veiculoRepository;
    private final ModeloVeiculoRepository modeloVeiculoRepository;
    private final ModelMapper mapper;

    public SaveVeiculo(VeiculoRepository veiculoRepository, ModeloVeiculoRepository modeloVeiculoRepository, ModelMapper mapper) {
        this.veiculoRepository = veiculoRepository;
        this.modeloVeiculoRepository = modeloVeiculoRepository;
        this.mapper = mapper;
    }

    public SaveVeiculoOutput execute(SaveVeiculoInput saveVeiculoInput) {
        ModeloVeiculo modeloVeiculo = this.modeloVeiculoRepository.findById(saveVeiculoInput.getModeloVeiculoId()).orElseThrow();

        Veiculo veiculo = this.mapper.map(saveVeiculoInput, Veiculo.class);
        veiculo.setModeloVeiculo(modeloVeiculo);

        veiculo = this.veiculoRepository.save(veiculo);

        return this.mapper.map(veiculo, SaveVeiculoOutput.class);
    }
}
