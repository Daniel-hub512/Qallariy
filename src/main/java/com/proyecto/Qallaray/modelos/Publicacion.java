package com.proyecto.Qallaray.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publicacion")
public class Publicacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_publicacion;

    private int estado;

    private String titulo;

    private String fecha;

    private String country;

    public Publicacion(int estado, String titulo, String fecha, String country) {
        this.estado = estado;
        this.titulo = titulo;
        this.fecha = fecha;
        this.country = country;
    }

    public Long getId_publicacion() {
        return id_publicacion;
    }

    public void setId_publicacion(Long id_publicacion) {
        this.id_publicacion = id_publicacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    




}
