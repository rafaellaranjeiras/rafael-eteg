
# API com Spring Boot

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

## Configuração do Banco de Dados
Antes de iniciar a aplicação, configure o acesso ao banco de dados no arquivo
`back-end/rafael-eteg/src/main/resources/application.yaml`:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/eteg
    username: postgres
    password: 12345678
  jpa:
    hibernate:
      ddl-auto: create #Após primeira execução, alterar para update
```

## Como Executar
1. Primeiro, clone o repositório.
 ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
   2. Entre no diretório do back-end e faça o build.
   ```sh
   cd rafael-eteg\back-end\rafael-eteg\
   mvn clean package
   ```
   3. Retorne à raiz e componha os containeres.
   ``` sh
   cd ..
   cd ..
   docker-compose up --build
   ```
A API estará acessível em `http://localhost:8080`.
A documentação da API estará disponível em `http://localhost:8080/swagger-ui.html`
A aplicação estará disponível em `http://localhost:3000/`.

## Autor
Desenvolvido por Rafael Laranjeiras.

