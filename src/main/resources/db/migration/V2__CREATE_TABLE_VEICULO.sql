CREATE TABLE veiculo
(
    id                  INT AUTO_INCREMENT PRIMARY KEY,
    placa               VARCHAR(10)    NOT NULL,
    volume_reservatorio DECIMAL(6, 3)  NOT NULL,
    ano_fabricacao      INT            NOT NULL,
    ano_modelo          INT            NOT NULL,
    hodometro_inicial   DECIMAL(12, 3) NOT NULL,
    modelo_veiculo_id   INT            NOT NULL,
    FOREIGN KEY (modelo_veiculo_id) REFERENCES modelo_veiculo (id)
);