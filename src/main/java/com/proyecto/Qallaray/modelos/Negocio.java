package com.proyecto.Qallaray.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "negocio")
public class Negocio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_negocio;

    private String descripcion;

    private String nombre;

    private byte imagen;

    private String direccion;

    private String telefono;

    public Negocio(String descripcion, String nombre, byte imagen, String direccion, String telefono) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.imagen = imagen;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Long getId_negocio() {
        return id_negocio;
    }

    public void setId_negocio(Long id_negocio) {
        this.id_negocio = id_negocio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getImagen() {
        return imagen;
    }

    public void setImagen(byte imagen) {
        this.imagen = imagen;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    



}
