package com.example.fueleconomybackend.service.dashboard;

import com.example.fueleconomybackend.domain.Veiculo;
import com.example.fueleconomybackend.repository.LancamentoAbastecimentoRepository;
import com.example.fueleconomybackend.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetTodosVeiculosEGastos {

    private final VeiculoRepository veiculoRepository;
    private final LancamentoAbastecimentoRepository lancamentoAbastecimentoRepository;

    public GetTodosVeiculosEGastos(VeiculoRepository veiculoRepository, LancamentoAbastecimentoRepository lancamentoAbastecimentoRepository) {
        this.veiculoRepository = veiculoRepository;
        this.lancamentoAbastecimentoRepository = lancamentoAbastecimentoRepository;
    }

    public List<GastosPorVeiculoOutput> execute() {
        List<GastosPorVeiculoOutput> output = new ArrayList<>();

        List<Veiculo> veiculos = this.veiculoRepository.findAll();
        veiculos.forEach(veiculo -> {
            GastosPorVeiculoOutput gastosPorVeiculoOutput = new GastosPorVeiculoOutput();

            gastosPorVeiculoOutput.setNome(veiculo.getModeloVeiculo().getNome());
            gastosPorVeiculoOutput.setFabricante(veiculo.getModeloVeiculo().getFabricante());
            gastosPorVeiculoOutput.setPlaca(veiculo.getPlaca());

            Double gasto = this.lancamentoAbastecimentoRepository.findAllByVeiculo(veiculo).stream().mapToDouble(lancamento -> lancamento.getVolume() * lancamento.getValorLitro()).sum();
            gastosPorVeiculoOutput.setGasto(gasto);

            output.add(gastosPorVeiculoOutput);
        });

        return output;
    }

}
