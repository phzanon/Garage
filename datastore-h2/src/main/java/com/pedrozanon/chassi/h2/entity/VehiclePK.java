package com.pedrozanon.chassi.h2.entity;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class VehiclePK implements Serializable {
    private Long id;

    @MapsId
    @ManyToOne
    private VehicleName nome_veiculo;
}
