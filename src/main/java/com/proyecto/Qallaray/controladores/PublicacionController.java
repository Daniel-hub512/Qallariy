package com.proyecto.Qallaray.controladores;

import com.proyecto.Qallaray.modelos.Publicacion;
import com.proyecto.Qallaray.repositorios.PublicacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicacionController {
    

    @Autowired
    private PublicacionRepository publicacionRepository;

    @PostMapping("Publicacion")
    public Publicacion crearPublicacion(@RequestBody Publicacion publicacion){       
        return publicacionRepository.save(publicacion);
    }
 
    @PutMapping("PublicacionUpdate/{id}")
    public Publicacion updatepPublicacion(@PathVariable String id,@RequestBody Publicacion publicacion){
        return publicacionRepository.save(publicacion);
    }


    @DeleteMapping("deletePublicacion/{id}")
    public void eliminarProducto(@PathVariable Long id){
         publicacionRepository.deleteById(id);
    }
}


