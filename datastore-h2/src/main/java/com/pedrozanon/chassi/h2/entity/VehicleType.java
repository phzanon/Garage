package com.pedrozanon.chassi.h2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TIPO_VEICULO")
public class VehicleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_veiculo_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nome_tipo_veiculo", nullable = false)
    private String vehicleTypeName;
}
