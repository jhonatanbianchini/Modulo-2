package com.minha.loja.LojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.minha.loja.LojaGames.Model.tb_categoria;

@Repository
public interface tb_categoriaRepository extends JpaRepository<tb_categoria, Long> {
	public List<tb_categoria> findAllByEstiloContainingIgnoreCase (String estilo);
	public List<tb_categoria> findAllByPlataformaContainingIgnoreCase(String plataforma);

}
