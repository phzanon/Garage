package com.pedrozanon.chassi.h2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "MARCA")
public class CarBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marca_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nome_marca")
    private String brandName;
}
