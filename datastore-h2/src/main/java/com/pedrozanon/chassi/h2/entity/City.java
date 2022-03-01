package com.pedrozanon.chassi.h2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "CIDADE")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cidade_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nome_cidade")
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private State state;
}
