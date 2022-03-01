package com.pedrozanon.chassi.h2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "COR")
public class VehicleColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cor_id")
    private Long id;

    @Column(name = "nome_cor")
    private String colorName;
}
