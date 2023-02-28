package com.example.demo.controller;

import model.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/hello-world")
public class HelloWorldController {
    @GetMapping("/say-hello")
    public ResponseEntity<Map<String, String>> sayHello(){
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello World");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/persona")
    public ResponseEntity<Persona> sayHelloPersona(){
        Persona messi = new Persona();
        messi.setEdad(36);
        messi.setNombre("Messi");
        messi.setEquipoFutbol("Argentina");
        return new ResponseEntity<>(messi, HttpStatus.OK);
    }

    @GetMapping("/persona/list")
    public ResponseEntity<List<Persona>> listPersona(){
        Persona messi = new Persona();
        messi.setEdad(36);
        messi.setNombre("Messi");
        messi.setEquipoFutbol("Argentina");

        Persona ronaldo = new Persona();
        ronaldo.setEdad(38);
        ronaldo.setNombre("Ronaldo");
        ronaldo.setEquipoFutbol("Portugal");

        List<Persona> topPlayers = new ArrayList<>();
        topPlayers.add(messi);
        topPlayers.add(ronaldo);

        return new ResponseEntity<>(topPlayers, HttpStatus.OK);
    }

    @PostMapping("/persona/save")
    public ResponseEntity<Persona> savePersona(@RequestBody Persona p){
        p.getEdad();
        p.getNombre();
        p.getEquipoFutbol();
        return new ResponseEntity<>(p, HttpStatus.OK);
    }
}
