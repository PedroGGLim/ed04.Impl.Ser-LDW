package Maven.Projeto.Solarispower.controller;
package com.solarispower.repository;

import com.solarispower.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByCategoria(String categoria);
}
