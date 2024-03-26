/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import java.io.Serializable;

/**
 *
 * @author JDANIEL
 */
@Entity
public class Mascota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMascota;
    private String nombre;
    private String color;
    private String alergico;
    private String observacion;
    private String atencion;
    private String raza;



    @OneToOne
    private Cliente duenio;

    public Mascota() {
    }

    public Mascota(int idMascota, String nombre, String color, String alergico, String observacion, String atencion, String raza, Cliente duenio) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.color = color;
        this.alergico = alergico;
        this.observacion = observacion;
        this.atencion = atencion;
        this.raza = raza;
        this.duenio = duenio;
    }



    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getAtencion() {
        return atencion;
    }

    public void setAtencion(String atencion) {
        this.atencion = atencion;
    }

    public Cliente getDuenio() {
        return duenio;
    }

    public void setDuenio(Cliente duenio) {
        this.duenio = duenio;
    }
    
    
        public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    
  
}
