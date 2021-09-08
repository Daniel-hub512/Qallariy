package com.proyecto.Qallaray.repositorios;

import com.proyecto.Qallaray.modelos.Producto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
    
}
