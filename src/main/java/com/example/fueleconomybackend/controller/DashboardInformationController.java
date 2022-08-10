package com.example.fueleconomybackend.controller;

import com.example.fueleconomybackend.service.dashboard.GastosPorVeiculoOutput;
import com.example.fueleconomybackend.service.dashboard.GetTodosVeiculosEGastos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashboardInformationController {

    private final GetTodosVeiculosEGastos getTodosVeiculosEGastos;

    public DashboardInformationController(GetTodosVeiculosEGastos getTodosVeiculosEGastos) {
        this.getTodosVeiculosEGastos = getTodosVeiculosEGastos;
    }

    @GetMapping("/gastos-por-veiculo")
    public ResponseEntity<List<GastosPorVeiculoOutput>> getTodosVeiculosEGastos() {
        return ResponseEntity.ok(this.getTodosVeiculosEGastos.execute());
    }

}
