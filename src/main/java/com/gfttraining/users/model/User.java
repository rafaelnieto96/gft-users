package com.gfttraining.users.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidos;
    private String direccion;
    private String metodoPago;
    private int puntosFidelidad;
    private double compraMedia;

    public User(String nombre, String apellidos, String direccion, String metodoPago, int puntosFidelidad, double compraMedia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.metodoPago = metodoPago;
        this.puntosFidelidad = puntosFidelidad;
        this.compraMedia = compraMedia;
    }

    public User() {
    }
}
