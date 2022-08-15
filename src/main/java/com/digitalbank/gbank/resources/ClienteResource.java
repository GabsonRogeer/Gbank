package com.digitalbank.gbank.resources;


import com.digitalbank.gbank.entities.Cliente;
import com.digitalbank.gbank.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        List<Cliente> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
