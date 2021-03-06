package com.pedrozanon.chassi.h2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "COMBUSTIVEL")
public class Fuel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "combustivel_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nome_combustivel", nullable = false)
    private String fuelName;
}
