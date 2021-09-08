package com.proyecto.Qallaray.controladores;

import com.proyecto.Qallaray.modelos.Negocio;
import com.proyecto.Qallaray.repositorios.NegocioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class NegocioController {

    @Autowired
    private NegocioRepository negocioRepository;

    @PostMapping("Negocio")
    public Negocio crearNegocio(@RequestBody Negocio negocio) {       
        return negocioRepository.save(negocio);
    }
 
    @PutMapping("NegocioUpdate/{id}")
    public Negocio updateNegocio(@PathVariable String id, @RequestBody Negocio negocio) {

        return negocioRepository.save(negocio);
    }


    @DeleteMapping("deleteNegocio/{id}")
    public void eliminarNegocio(@PathVariable Long id){
         negocioRepository.deleteById(id);
    }

    
}
