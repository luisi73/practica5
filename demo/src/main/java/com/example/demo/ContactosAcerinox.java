package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactosAcerinox {
    @GetMapping("/contacts")
    public Contactos postContactos(@RequestBody Contactos contacto){
        return contacto;
    }
    
}
