
# Cadastro de clientes
Este projeto é um formulário de cadastro de clientes desenvolvido em Java com framework Spring Boot (back-end) e React (front-end). A API roda na porta **8080** e requer configuração do banco de dados no arquivo `application.yaml`. O front-end roda na porta **3000**.

## Tecnologias Utilizadas
- Java 21
- Spring Boot 3.4.2
- Spring Data JPA
- Banco de Dados PostgreSQL
- Maven
- React 18
- Node
- Docker
  
## Como Executar
1. Primeiro, clone o repositório e entre no diretório.
 ```sh
 git clone https://github.com/rafaellaranjeiras/rafael-eteg.git
 cd .\rafael-eteg
 ```
 2. Antes de conttinuar, configure o acesso ao banco de dados no arquivo
`docker-compose.yml`:

```yaml
- SPRING_DATASOURCE_URL=jdbc:postgresql://host.docker.internal:5432/{BANCO}
- SPRING_DATASOURCE_USERNAME={USUARIO}
- SPRING_DATASOURCE_PASSWORD={SENHA}
```

 3. Entre no diretório do back-end e faça o build.
 ```sh
 cd .\back-end\rafael-eteg\
 mvn clean package
 ```
 4. Retorne à raiz e componha os containeres.
 ``` sh
 cd ..
 cd ..
 docker-compose up --build
 ```
A API estará acessível em `http://localhost:8080`.
A documentação da API estará disponível em `http://localhost:8080/swagger-ui.html`
A aplicação estará disponível em `http://localhost:3000/`.

Após a primeira execução, para persistência dos dados, recomenda-se alterar o `ddl-auto` do back-end para `update` ou `none` no aquivo `back-end\rafael-eteg\src\main\resources\application.yaml`:

```yaml
spring:
  ...
  jpa:
    ...
    hibernate:
      ddl-auto: update
```


## Autor
Desenvolvido por Rafael Laranjeiras.

