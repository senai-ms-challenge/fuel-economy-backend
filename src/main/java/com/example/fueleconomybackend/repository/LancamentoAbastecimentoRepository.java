package com.example.fueleconomybackend.repository;

import com.example.fueleconomybackend.domain.LancamentoAbastecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoAbastecimentoRepository extends JpaRepository<LancamentoAbastecimento, Integer> {

}
