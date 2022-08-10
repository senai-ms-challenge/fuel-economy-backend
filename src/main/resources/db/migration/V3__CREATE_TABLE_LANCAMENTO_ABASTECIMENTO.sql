CREATE TABLE lancamento_abastecimento
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    data        TIMESTAMP      NOT NULL,
    volume      DECIMAL(6, 3)  NOT NULL,
    hodometro   DECIMAL(12, 3) NOT NULL,
    valor_litro DECIMAL(6, 2)  NOT NULL,
    veiculo_id  INT            NOT NULL,
    FOREIGN KEY (veiculo_id) REFERENCES veiculo (id)
);