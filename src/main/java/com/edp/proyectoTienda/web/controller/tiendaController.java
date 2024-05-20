package com.edp.proyectoTienda.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/inicio")
public class tiendaController {
    @GetMapping("/holamundo")
    public String holamundo(){
        return "<h1>hola Mundo</h1>";
    }
    @GetMapping("")
    public String getInit(){
        return "<h1>inicio</h1>";
    }
}
