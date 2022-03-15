package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientesAcerinoxController {

    Clientes clientes;

    @PostMapping("/setclientes")
    public void postClientes(@RequestBody Clientes clientes) {
        this.clientes = clientes;
    }

    @GetMapping("/getclientes")
    public Clientes getClientes() {
        return clientes;
    }



}
