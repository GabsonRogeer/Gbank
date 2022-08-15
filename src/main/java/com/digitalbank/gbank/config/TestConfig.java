package com.digitalbank.gbank.config;


import com.digitalbank.gbank.entities.Cliente;
import com.digitalbank.gbank.entities.ContaBancaria;
import com.digitalbank.gbank.repositories.ClienteRespository;
import com.digitalbank.gbank.repositories.ContaBancariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;

import java.util.List;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClienteRespository clienteRespository;

    @Autowired
    private ContaBancariaRepository contaBancariaRepository;

    @Override
    public void run(String... args) throws Exception {

        Cliente c1 = new Cliente(null, "Gabson", Instant.parse("2019-06-20T19:53:07Z"), "123.456.789-12");
        Cliente c2 = new Cliente(null, "Ingrid", Instant.parse("2019-06-20T19:53:07Z"), "123.456.789-12");

        clienteRespository.saveAll(List.of(c1,c2));

        ContaBancaria cb1 = new ContaBancaria(null, "666-6", Instant.now(), 3000.00);

        contaBancariaRepository.saveAll(List.of(cb1));


    }
}
