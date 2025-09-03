package Maven.Projeto.Solarispower.controller;
package com.solarispower.service;

import com.solarispower.model.Produto;
import com.solarispower.repository.ProdutoRepository;
import com.solarispower.dto.ProdutoDto;
import com.solarispower.response.ProdutoResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService implements IProdutoService {

    Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public ProdutoResponse cadastrar(ProdutoDto dto) {
        try {
            Produto produto = new Produto(dto.getNome(), dto.getCategoria(), dto.getPreco());
            Produto novoProduto = produtoRepository.save(produto);
            return new ProdutoResponse(true, "Produto cadastrado com sucesso", novoProduto);
        } catch (Exception e) {
            logger.error("Erro ao cadastrar produto", e);
            return new ProdutoResponse(false, "Erro ao cadastrar produto: " + e.getMessage(), null);
        }
    }

    @Override
    public ProdutoResponse consultarPorId(Long id) {
        return produtoRepository.findById(id)
                .map(prod -> new ProdutoResponse(true, "Produto encontrado", prod))
                .orElse(new ProdutoResponse(false, "Produto não encontrado", null));
    }

    @Override
    public List<Produto> consultarPorCategoria(String categoria) {
        return produtoRepository.findByCategoria(categoria);
    }

    @Override
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public ProdutoResponse atualizar(Long id, ProdutoDto dto) {
        return produtoRepository.findById(id).map(produto -> {
            produto.setNome(dto.getNome());
            produto.setCategoria(dto.getCategoria());
            produto.setPreco(dto.getPreco());
            produtoRepository.save(produto);
            return new ProdutoResponse(true, "Produto atualizado com sucesso", produto);
        }).orElse(new ProdutoResponse(false, "Produto não encontrado", null));
    }

    @Override
    public void excluir(Long id) {
        produtoRepository.deleteById(id);
    }
}
