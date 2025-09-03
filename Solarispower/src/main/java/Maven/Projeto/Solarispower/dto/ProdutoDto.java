package Maven.Projeto.Solarispower.controller;
package com.solarispower.dto;

import java.math.BigDecimal;

public class ProdutoDto {
    private String nome;
    private String categoria;
    private BigDecimal preco;

    public ProdutoDto() {}

    public ProdutoDto(String nome, String categoria, BigDecimal preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public BigDecimal getPreco() { return preco; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }
}
