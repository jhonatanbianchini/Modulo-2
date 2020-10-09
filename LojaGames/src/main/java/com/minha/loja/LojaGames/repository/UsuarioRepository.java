package com.minha.loja.LojaGames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.minha.loja.LojaGames.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public List<Usuario> findAllBySenhaContainingIgnoreCase(String senha);
	public List<Usuario> findAllByEmailContainingIgnoreCase(String email);
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	
}
