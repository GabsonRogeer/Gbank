package com.digitalbank.gbank.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_contasbancarias")
public class ContaBancaria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numConta;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant dataDeCriacao;
    private Double saldo;

    @OneToOne
    @JoinColumn(referencedColumnName = "id_cliente")
    private Cliente cliente;


    public ContaBancaria() {
    }

    public ContaBancaria(Long id, String numConta, Instant dataDeCriacao, Double saldo) {
        this.id = id;
        this.numConta = numConta;
        this.dataDeCriacao = dataDeCriacao;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public Instant getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(Instant dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @JsonIgnore
    public Cliente getCliente() {
        return cliente;
    }

}