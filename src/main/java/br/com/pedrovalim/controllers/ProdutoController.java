package br.com.pedrovalim.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedrovalim.entities.Produto;
import br.com.pedrovalim.services.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;
	
	
	@PostMapping
	@Operation(summary = "Cria um novo produto", description = "Adiciona um novo produto à base de dados.")
	@Tag(name = "Produto", description = "Operações relacionadas a produtos")
	public ResponseEntity<Produto> criar(@RequestBody Produto produto) {
		Produto novoProduto = produtoService.criarProduto(produto);
     
        return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);
	}
	
	@GetMapping
	@Tag(name = "Produto", description = "Operações relacionadas a produtos")
	@Operation(summary = "Lista todos os produtos", description = "Retorna uma lista de todos os produtos disponíveis na base de dados.")
	public ResponseEntity<List<Produto>> listarTodos() {
		List<Produto> produtos = produtoService.consultarTodosProdutos();
		return new ResponseEntity<>(produtos, HttpStatus.OK);
	}
	
	
}
