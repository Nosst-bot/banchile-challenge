package com.pacadmin.banchilechallenge.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Filtro {


    private String rut;

    private String nombreProducto;

    private String diaPago;

    private String banco;


}
