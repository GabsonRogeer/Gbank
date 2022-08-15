package com.digitalbank.gbank.repositories;

import com.digitalbank.gbank.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRespository extends JpaRepository<Cliente, Long> {
}
