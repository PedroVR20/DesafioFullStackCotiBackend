package br.com.pedrovalim.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProdutoResponseDto {

	private UUID id; 
	private String nome;
	private Integer quantidade;
	private Double preco;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime datacadastro;
	
}
