package com.pacadmin.banchilechallenge.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pac")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PAC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pac_id")
    Long pacId;

    @Column(name = "fecha")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date pacFecha;

    @Column(name = "monto")
    Integer pacMonto;
}
