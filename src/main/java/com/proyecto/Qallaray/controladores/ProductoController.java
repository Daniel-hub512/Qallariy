package com.proyecto.Qallaray.controladores;

import com.proyecto.Qallaray.modelos.Producto;
import com.proyecto.Qallaray.repositorios.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    


    @Autowired
    private ProductoRepository productoRepository;

    @PostMapping("Producto")
    public Producto crearProducto(@RequestBody Producto producto) {       
        return productoRepository.save(producto);
    }
 
    @PutMapping("ProductoUpdate/{id}")
    public Producto updateNegocio(@PathVariable String id, @RequestBody Producto producto) {

        return productoRepository.save(producto);
    }


    @DeleteMapping("deleteProdcuto/{id}")
    public void eliminarProducto(@PathVariable Long id){
         productoRepository.deleteById(id);
    }
}
