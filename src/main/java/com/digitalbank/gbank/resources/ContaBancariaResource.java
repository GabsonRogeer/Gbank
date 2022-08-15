package com.digitalbank.gbank.resources;

import com.digitalbank.gbank.entities.Cliente;
import com.digitalbank.gbank.entities.ContaBancaria;
import com.digitalbank.gbank.services.ContaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contas")
public class ContaBancariaResource {

    @Autowired
    private ContaBancariaService service;

    @GetMapping
    public ResponseEntity<List<ContaBancaria>> findAll(){
        List<ContaBancaria> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
