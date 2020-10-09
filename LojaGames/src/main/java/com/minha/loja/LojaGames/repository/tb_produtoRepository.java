package com.minha.loja.LojaGames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.minha.loja.LojaGames.Model.tb_produto;

public interface tb_produtoRepository extends JpaRepository<tb_produto, Long> {
	
	public List<tb_produto> findAllByNomeContainingIgnoreCase(String nome);
	public List<tb_produto> findAllByCategoriaContainingIgnoreCase(String categoria);

}
