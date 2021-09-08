package com.proyecto.Qallaray.controladores;

import com.proyecto.Qallaray.modelos.Negocio;
import com.proyecto.Qallaray.modelos.Persona;
import com.proyecto.Qallaray.repositorios.NegocioRepository;
import com.proyecto.Qallaray.repositorios.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class PersonaController {
    
    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private NegocioRepository negocioRepository;


    @PostMapping("Persona/Negocio")
    public Negocio publicarNegocio(@RequestBody Negocio negocio){              
        return negocioRepository.save(negocio);
    }

    @PostMapping("Persona/Cuenta")
    public Persona crearCuenta(@RequestBody Persona persona){    
        return personaRepository.save(persona);
    }
    

    @PutMapping("CuentaUpdate/{id}")
    public Persona configCuenta(@PathVariable String id, @RequestBody Persona persona) {
        return personaRepository.save(persona);
    }

    
   


}
