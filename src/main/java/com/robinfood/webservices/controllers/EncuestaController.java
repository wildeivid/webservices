package com.robinfood.webservices.controllers;

import com.robinfood.webservices.entities.Encuesta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping({"/", "/encuesta"})
public class EncuestaController {

    @GetMapping("/mostrar")
    public Encuesta mostrarEncuesta(){
        return Encuesta.builder()
                .nombre("Encuesta 21e")
                .createdAt(LocalTime.now())
                .build();
    }

}
