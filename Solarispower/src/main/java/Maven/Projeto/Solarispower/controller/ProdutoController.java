package com.solarispower.controller;

import com.solarispower.dto.ProdutoDto;
import com.solarispower.response.ProdutoResponse;
import com.solarispower.model.Produto;
import com.solarispower.service.IProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private IProdutoService produtoService;

    @PostMapping
    public ProdutoResponse cadastrar(@RequestBody ProdutoDto produto) {
        return produtoService.cadastrar(produto);
    }

    @GetMapping("/{id}")
    public ProdutoResponse consultarPorId(@PathVariable Long id) {
        return produtoService.consultarPorId(id);
    }

    @GetMapping("/categoria/{categoria}")
    public List<Produto> consultarPorCategoria(@PathVariable String categoria) {
        return produtoService.consultarPorCategoria(categoria);
    }

    @GetMapping
    public List<Produto> listarTodos() {
        return produtoService.listarTodos();
    }

    @PutMapping("/{id}")
    public ProdutoResponse atualizar(@PathVariable Long id, @RequestBody ProdutoDto produto) {
        return produtoService.atualizar(id, produto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        produtoService.excluir(id);
    }
}
