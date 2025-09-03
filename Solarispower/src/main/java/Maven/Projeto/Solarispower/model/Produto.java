package Maven.Projeto.Solarispower.controller;
package com.solarispower.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String categoria;
    private BigDecimal preco;

    public Produto() {}

    public Produto(String nome, String categoria, BigDecimal preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public BigDecimal getPreco() { return preco; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }
}
