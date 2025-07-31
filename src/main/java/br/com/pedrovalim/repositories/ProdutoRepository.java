package br.com.pedrovalim.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedrovalim.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {

}
