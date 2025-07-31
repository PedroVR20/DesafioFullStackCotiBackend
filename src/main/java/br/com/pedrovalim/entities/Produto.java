package br.com.pedrovalim.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "produto")
public class Produto {
	
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	
	@Column(name = "nome_produto", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "quantidade", nullable = false)
	private Integer quantidade;
	
	@Column(nullable = false)
	private Double preco;
	
	@Column(name = "data_cadastro", nullable = false , updatable = false)
	private LocalDateTime datacadastro;
	
	 @PrePersist
	    public void prePersist() {
	        datacadastro = LocalDateTime.now();
	    }
	

}
