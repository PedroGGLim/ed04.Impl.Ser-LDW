package Maven.Projeto.Solarispower.controller;
package com.solarispower.response;

import com.solarispower.model.Produto;

public class ProdutoResponse {
    private boolean sucesso;
    private String mensagem;
    private Produto produto;

    public ProdutoResponse() {}

    public ProdutoResponse(boolean sucesso, String mensagem, Produto produto) {
        this.sucesso = sucesso;
        this.mensagem = mensagem;
        this.produto = produto;
    }

    public boolean isSucesso() { return sucesso; }
    public void setSucesso(boolean sucesso) { this.sucesso = sucesso; }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }
}
