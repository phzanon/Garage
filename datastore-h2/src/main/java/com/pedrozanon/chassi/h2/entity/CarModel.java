package com.pedrozanon.chassi.h2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "MODELO_CARRO")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "modelo_carro_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nome_veiculo")
    private String vehicleName;
}
