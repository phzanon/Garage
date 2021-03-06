package com.pedrozanon.chassi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Category {

    private Long id;
    private String titulo;
    private String cor;
}
