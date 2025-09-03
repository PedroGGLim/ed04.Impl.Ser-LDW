package Maven.Projeto.Solarispower.controller;
package com.solarispower.service;

import java.util.List;
import com.solarispower.model.Produto;
import com.solarispower.dto.ProdutoDto;
import com.solarispower.response.ProdutoResponse;

public interface IProdutoService {
    ProdutoResponse cadastrar(ProdutoDto produto);
    ProdutoResponse consultarPorId(Long id);
    List<Produto> consultarPorCategoria(String categoria);
    List<Produto> listarTodos();
    ProdutoResponse atualizar(Long id, ProdutoDto produto);
    void excluir(Long id);
}
