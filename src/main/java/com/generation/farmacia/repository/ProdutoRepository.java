package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByDeNomeContainingIgnoreCase(@Param("nome") String nome);
	
	public List<Produto> findAllByDeDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
	
	public List<Produto> findAllByDeMarcaContainingIgnoreCase(@Param("marca") String marca);
	
	public List<Produto> findAllByDeCategoriaContainingIgnoreCase(@Param("categoria") String categoria);
}
