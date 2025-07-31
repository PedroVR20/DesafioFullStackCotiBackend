package br.com.pedrovalim.configurations;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Minha API de Produtos")
                .version("1.0.0")
                .description("Esta é uma API para o gerenciamento de produtos.")
            );
    }
}
