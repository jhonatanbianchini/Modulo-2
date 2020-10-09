package com.minha.loja.LojaGameController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.minha.loja.LojaGames.Model.tb_categoria;
import com.minha.loja.LojaGames.repository.tb_categoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class tb_categoriaController {
	
	@Autowired
	private tb_categoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<tb_categoria>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<tb_categoria> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/estilo/{estilo}")
	public ResponseEntity<List<tb_categoria>> GetByEstilo(@PathVariable String estilo){
		return ResponseEntity.ok(repository.findAllByEstiloContainingIgnoreCase(estilo));
	}
	
	@GetMapping("/plataforma/{plataforma}")
	public ResponseEntity<List<tb_categoria>> GetByPlataforma(@PathVariable String plataforma){
		return ResponseEntity.ok(repository.findAllByPlataformaContainingIgnoreCase(plataforma));
	}
	
	@PostMapping
	public ResponseEntity<tb_categoria> post (@RequestBody tb_categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<tb_categoria> put (@RequestBody tb_categoria categoria){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}	

}
