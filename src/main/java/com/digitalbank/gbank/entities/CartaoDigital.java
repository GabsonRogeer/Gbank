package com.digitalbank.gbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

@Entity
@Table(name = "tb_cartao-digital")
public class CartaoDigital {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private Integer numeroDoCartao;
    private Date validade;
    private Integer cvv;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CartaoDigital()throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        Random random = new Random();

        this.numeroDoCartao = random.nextInt(16);
        this.cvv = random.nextInt(3);
        this.validade = simpleDateFormat.parse("01/12/2029");
    }

    public Integer getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public Date getValidade() {
        return validade;
    }

    public Integer getCvv() {
        return cvv;
    }
}
