package com.example.fueleconomybackend.repository;

import com.example.fueleconomybackend.domain.LancamentoAbastecimento;
import com.example.fueleconomybackend.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LancamentoAbastecimentoRepository extends JpaRepository<LancamentoAbastecimento, Integer> {

    List<LancamentoAbastecimento> findAllByVeiculo(Veiculo veiculo);

}
