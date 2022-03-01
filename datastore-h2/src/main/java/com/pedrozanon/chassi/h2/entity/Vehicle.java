package com.pedrozanon.chassi.h2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "VEICULO")
public class Vehicle {

    @EmbeddedId
    private VehiclePK vehiclePK;

    @ManyToOne
    @JoinColumn(name = "tipo_veiculo_id")
    private VehicleType vehicleType;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private CarBrand carBrand;

    @Column(name = "preco_veiculo")
    private Double vehiclePrice;

    @Column(name = "ano_veiculo")
    private LocalDate vehicleYear;

    @Column(name = "quilometragem_veiculo")
    private BigInteger vehicleMileage;

    @ManyToOne
    @JoinColumn(name = "combustivel_id")
    private Fuel fuel;

    @Column(name = "final_placa_veiculo")
    private Integer finalPlate;

    @ManyToOne
    @JoinColumn(name = "cor_id")
    private VehicleColor vehicleColor;

    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private City city;

    @ManyToMany
    @JoinTable(name = "EQUIPAMENTO",
        joinColumns = { @JoinColumn(name = "id"),
                        @JoinColumn(name = "nome_equipamento")},
        inverseJoinColumns = {@JoinColumn(name = "vehicle_id")}
    )
    private List<Equipment> equipments;
}
