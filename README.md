# Cadastro de Clientes — Java

Projeto de estudo para praticar conceitos de **Java, orientação a objetos, CRUD, SQL e testes unitários**.

## Funcionalidades
- Cadastro de clientes
- Listagem
- Remoção por ID
- Validação de nome e e-mail
- Script SQL para estrutura e consulta
- Testes unitários com JUnit

## Tecnologias
- Java 17
- Maven
- JUnit 5
- SQL

## Estrutura
- `Cliente.java` — modelo e validações
- `ClienteRepository.java` — operações de cadastro
- `App.java` — execução de exemplo
- `ClienteTest.java` — testes
- `database.sql` — estrutura e consultas SQL

## Como executar
Com Java 17 e Maven instalados:

```bash
mvn test
mvn package
```

## O que pratiquei
- Orientação a objetos
- Records
- Coleções
- Validação de dados
- CRUD em memória
- SQL
- Testes unitários
- Maven

> Projeto de estudo. Uma evolução natural seria conectar o Repository a PostgreSQL usando JDBC e criar uma interface desktop/web.
