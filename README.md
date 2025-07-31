# DesafioFullStackCotiBackend

Este projeto é uma API RESTful simples desenvolvida como parte do desafio FullStack da Coti. Ele oferece funcionalidades básicas de manipulação de dados através de endpoints POST e GET, e está conectado a um banco de dados PostgreSQL.



## Tecnologias Utilizadas

As seguintes tecnologias foram utilizadas no desenvolvimento deste projeto:

- **Java**: Linguagem de programação principal.
- **Maven**: Ferramenta de automação de build e gerenciamento de dependências.
- **Spring Boot**: Framework para facilitar a criação de aplicações Java autônomas e baseadas em produção.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional.
- **Docker**: Plataforma para desenvolver, enviar e executar aplicações em contêineres.
- **Docker Compose**: Ferramenta para definir e executar aplicações Docker multi-contêineres.




## Como Rodar o Projeto

Para executar este projeto localmente, siga os passos abaixo:

1.  **Pré-requisitos:**
    *   Certifique-se de ter o Docker e o Docker Compose instalados em sua máquina.

2.  **Clonar o Repositório:**
    ```bash
    git clone https://github.com/PedroVR20/DesafioFullStackCotiBackend.git
    cd DesafioFullStackCotiBackend
    ```

3.  **Configurar e Iniciar com Docker Compose:**
    Este projeto utiliza Docker Compose para orquestrar o serviço da API e o banco de dados PostgreSQL. O arquivo `docker-compose.yml` já está configurado.

    No diretório raiz do projeto, execute o seguinte comando para construir as imagens e iniciar os contêineres:
    ```bash
    docker-compose up --build
    ```
    Isso irá:
    *   Construir a imagem Docker para a aplicação backend.
    *   Iniciar um contêiner para o banco de dados PostgreSQL.
    *   Iniciar o contêiner da aplicação backend, que se conectará ao PostgreSQL.

4.  **Verificar o Status:**
    Você pode verificar o status dos contêineres em execução com:
    ```bash
    docker-compose ps
    ```

5.  **Acessar a Aplicação:**
    A API estará disponível em `http://localhost:8080` (ou a porta configurada no `application.properties` do Spring Boot).




## Endpoints da API

A API possui os seguintes endpoints:

### `POST /api/recurso`

Cria um novo recurso no sistema.

-   **URL:** `/api/recurso`
-   **Método:** `POST`
-   **Corpo da Requisição (Exemplo):**
    ```json
    {
        "nome": "Exemplo",
        "descricao": "Descrição do recurso"
    }
    ```
-   **Respostas:**
    *   `201 Created`: Recurso criado com sucesso.
    *   `400 Bad Request`: Dados inválidos na requisição.

### `GET /api/recurso`

Retorna todos os recursos existentes no sistema.

-   **URL:** `/api/recurso`
-   **Método:** `GET`
-   **Respostas:**
    *   `200 OK`: Retorna uma lista de recursos.
    *   `204 No Content`: Não há recursos para retornar.

### `GET /api/recurso/{id}`

Retorna um recurso específico pelo seu ID.

-   **URL:** `/api/recurso/{id}`
-   **Método:** `GET`
-   **Parâmetros de Path:**
    *   `id` (inteiro): O ID do recurso a ser recuperado.
-   **Respostas:**
    *   `200 OK`: Retorna o recurso solicitado.
    *   `404 Not Found`: Recurso não encontrado.




## Estrutura do Projeto

A estrutura detalhada do projeto é a seguinte:

```
src/
├── main/
│   ├── java/
│   │   └── br/
│   │       └── com/
│   │           └── pedrovalim/
│   │               └── DesafioFullStackCotiApiApplication.java
│   │               ├── configurations/
│   │               │   ├── CorsConfiguration.java
│   │               │   └── SwaggerConfiguration.java
│   │               ├── controllers/
│   │               │   └── ProdutoController.java
│   │               ├── dtos/
│   │               │   ├── ProdutoRequestDto.java
│   │               │   └── ProdutoResponseDto.java
│   │               ├── entities/
│   │               │   └── Produto.java
│   │               ├── handlers/
│   │               │   └── GlobalExceptionHandler.java
│   │               ├── repositories/
│   │               │   └── ProdutoRepository.java
│   │               └── services/
│   │                   └── ProdutoService.java
│   └── resources/
│       └── application.properties
├── test/
│   └── java/
│       └── br/
│           └── com/
│               └── pedrovalim/
│                   └── DesafioFullStackCotiApiApplicationTests.java
docker-compose.yml
HELP.md
mvnw
mvnw.cmd
pom.xml
README.md
```

-   **`src/main/java/`**: Contém o código fonte principal da aplicação Java.
    -   **`br.com.pedrovalim/`**: Pacote raiz da aplicação.
        -   **`DesafioFullStackCotiApiApplication.java`**: Classe principal de inicialização da aplicação Spring Boot.
        -   **`configurations/`**: Classes de configuração, como CORS e Swagger.
        -   **`controllers/`**: Classes que definem os endpoints da API e lidam com as requisições HTTP (ex: `ProdutoController.java`).
        -   **`dtos/`**: Classes de Data Transfer Object (DTO) para entrada e saída de dados (ex: `ProdutoRequestDto.java`, `ProdutoResponseDto.java`).
        -   **`entities/`**: Classes que representam as entidades do banco de dados (ex: `Produto.java`).
        -   **`handlers/`**: Classes para tratamento global de exceções (ex: `GlobalExceptionHandler.java`).
        -   **`repositories/`**: Interfaces para acesso e manipulação de dados no banco de dados, utilizando Spring Data JPA (ex: `ProdutoRepository.java`).
        -   **`services/`**: Classes que contêm a lógica de negócio da aplicação (ex: `ProdutoService.java`).
-   **`src/main/resources/`**: Contém arquivos de configuração e recursos da aplicação.
    -   **`application.properties`**: Arquivo de propriedades para configurações da aplicação, como porta, banco de dados, etc.
-   **`src/test/java/`**: Contém os testes unitários e de integração da aplicação.
-   **`docker-compose.yml`**: Arquivo de configuração do Docker Compose para orquestrar os serviços da aplicação (backend e banco de dados PostgreSQL).
-   **`HELP.md`**: Arquivo de ajuda gerado pelo Spring Boot.
-   **`mvnw` e `mvnw.cmd`**: Scripts wrapper do Maven para garantir que a versão correta do Maven seja usada.
-   **`pom.xml`**: Arquivo de configuração do projeto Maven, listando dependências e informações de build.
-   **`README.md`**: Este arquivo de documentação do projeto.




## Contribuição

Contribuições são bem-vindas! Se você deseja contribuir com este projeto, por favor, siga os passos abaixo:

1.  Faça um fork do repositório.
2.  Crie uma nova branch (`git checkout -b feature/sua-feature`).
3.  Faça suas alterações e adicione testes, se aplicável.
4.  Commit suas alterações (`git commit -m 'feat: Adiciona nova feature'`).
5.  Envie para a branch original (`git push origin feature/sua-feature`).
6.  Abra um Pull Request.




## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.


