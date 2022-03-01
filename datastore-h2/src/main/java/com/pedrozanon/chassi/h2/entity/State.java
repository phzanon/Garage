package com.pedrozanon.chassi.h2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ESTADO")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estado_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nome_estado")
    private String stateName;
}
