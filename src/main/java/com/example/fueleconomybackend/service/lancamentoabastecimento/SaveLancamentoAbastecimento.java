package com.example.fueleconomybackend.service.lancamentoabastecimento;

import com.example.fueleconomybackend.domain.LancamentoAbastecimento;
import com.example.fueleconomybackend.domain.Veiculo;
import com.example.fueleconomybackend.repository.LancamentoAbastecimentoRepository;
import com.example.fueleconomybackend.repository.VeiculoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class SaveLancamentoAbastecimento {

    private final LancamentoAbastecimentoRepository lancamentoAbastecimentoRepository;
    private final VeiculoRepository veiculoRepository;
    private final ModelMapper mapper;

    public SaveLancamentoAbastecimento(LancamentoAbastecimentoRepository lancamentoAbastecimentoRepository, VeiculoRepository veiculoRepository, ModelMapper mapper) {
        this.lancamentoAbastecimentoRepository = lancamentoAbastecimentoRepository;
        this.veiculoRepository = veiculoRepository;
        this.mapper = mapper;
    }

    public SaveLancamentoAbastecimentoOutput execute(SaveLancamentoAbastecimentoInput saveLancamentoAbastecimentoInput) {
        Veiculo veiculo = this.veiculoRepository.findById(saveLancamentoAbastecimentoInput.getVeiculoId()).orElseThrow();

        LancamentoAbastecimento lancamentoAbastecimento = this.mapper.map(saveLancamentoAbastecimentoInput, LancamentoAbastecimento.class);
        lancamentoAbastecimento.setVeiculo(veiculo);
        lancamentoAbastecimento.setData(LocalDateTime.parse(saveLancamentoAbastecimentoInput.getData(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        lancamentoAbastecimento = this.lancamentoAbastecimentoRepository.save(lancamentoAbastecimento);

        return this.mapper.map(lancamentoAbastecimento, SaveLancamentoAbastecimentoOutput.class);
    }

}
