package com.digitalbank.gbank.services;


import com.digitalbank.gbank.entities.Cliente;
import com.digitalbank.gbank.repositories.ClienteRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRespository respository;

    public List<Cliente> findAll(){
        return respository.findAll();
    }
}
