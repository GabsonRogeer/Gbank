package com.digitalbank.gbank.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_Cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @JsonFormat(timezone = "dd/MM/aaaa")
    private Instant dataDeNascimento;
    private String cpf;

    @OneToOne
    private ContaBancaria contaBancaria;

    public Cliente(Long id, String nome, Instant dataDeNascimento, String cpf) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
    }
}


