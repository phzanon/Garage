package com.pedrozanon.chassi.h2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "NOME_VEICULO")
public class VehicleName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nome_veiculo")
    private String vehicleName;

    @OneToMany
    @JoinColumn(name = "modelo_id")
    private List<CarModel> carModel;
}
