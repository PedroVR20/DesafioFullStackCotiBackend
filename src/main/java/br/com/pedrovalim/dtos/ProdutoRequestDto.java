package br.com.pedrovalim.dtos;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProdutoRequestDto {

	@NotBlank(message = "O nome do produto é obrigatório")
	@Size(max = 150, message = "O nome do produto deve ter no máximo 150 caracteres")
	private String nome;
	
	@NotNull(message = "O preço do produto é obrigatório")
	@DecimalMin(value = "0.01", message = "O preço do produto deve ser maior que zero")
	private Double preco;
	
	@NotNull(message = "A quantidade do produto é obrigatória")
	private Integer quantidade;
	
	
	
	
}
