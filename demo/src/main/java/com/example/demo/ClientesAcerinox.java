package com.example.demo;

import com.example.Clientes;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientesAcerinox {
    @PostMapping("/clientes")
    public Clientes postClientes(@RequestBody Clientes clientes){
        return clientes;
    }
    
}
