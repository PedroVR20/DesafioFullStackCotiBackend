package br.com.pedrovalim.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pedrovalim.entities.Produto;
import br.com.pedrovalim.repositories.ProdutoRepository;

@Service

public class ProdutoService {

	@Autowired
	 ProdutoRepository produtoRepository;
	
	
	public List<Produto> consultarTodosProdutos() {
		return produtoRepository.findAll();
	}
	
	
	public Produto criarProduto(Produto produto) {
		if (produto.getNome() == null || produto.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser nulo ou vazio.");
        }
        if (produto.getPreco() < 0) {
            throw new IllegalArgumentException("O preço do produto não pode ser negativo.");
        }
        
        return produtoRepository.save(produto);
	}


	public void deletarProduto(UUID id) {
	
		
		if (!produtoRepository.existsById(id)) {
			throw new IllegalArgumentException("Produto com ID " + id + " não encontrado.");
		}
		
		produtoRepository.deleteById(id);
	}
	
	
}
