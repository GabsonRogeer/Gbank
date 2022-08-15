package com.digitalbank.gbank.services;

import com.digitalbank.gbank.entities.ContaBancaria;
import com.digitalbank.gbank.repositories.ContaBancariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaBancariaService {

    @Autowired
    private ContaBancariaRepository repository;

    public List<ContaBancaria> findAll(){
        return repository.findAll();
    }
}
