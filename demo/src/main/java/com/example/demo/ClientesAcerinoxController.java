package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientesAcerinoxController {

    @PostMapping("/clientes")
    public Clientes postClientes(@RequestBody Clientes clientes){
        return clientes;
    }
    
}
