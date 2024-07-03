# Sistema de Gerenciamento de Biblioteca
Este é um projeto de desafio do bootcamp back-end java dio. Um sistema de gerenciamento de biblioteca desenvolvido em Java com Spring Boot . O projeto utiliza padrões de projeto para melhorar a organização e manutenção do código.

## Padrões de Projeto Utilizados

### Singleton
O padrão Singleton é utilizado na classe DatabaseConnection para garantir que apenas uma instância da conexão com o banco de dados seja criada e compartilhada por toda a aplicação. Isso melhora a eficiência e centraliza o controle da conexão.

### Strategy/Repository
O padrão Strategy é aplicado na interface BookRepository, que define um conjunto de operações para manipulação de livros. A classe InMemoryBookRepository implementa essas operações em memória, permitindo fácil troca ou extensão de implementações sem afetar o cliente (LibraryFacade).

### Facade
O padrão Facade é utilizado na classe LibraryFacade, que fornece uma interface simplificada para as operações complexas do sistema de gerenciamento de biblioteca. Isso oculta a complexidade do acesso direto ao repositório de livros e à conexão com o banco de dados, facilitando o uso por outras partes da aplicação.

Estrutura do Projeto

          src
          └── main
              ├── java
              │   └── com
              │       └── project
              │           └── library
              │               ├── LibraryApplication.java
              │               ├── DatabaseConnection.java
              │               ├── Book.java
              │               ├── BookRepository.java
              │               ├── InMemoryBookRepository.java
              │               └── LibraryFacade.java
              └── resources
                  └── application.properties
            
## Pré-requisitos
- Java 8 ou superior
- Maven 3.3+ (para compilação e execução)
  
## Como Executar
1. Clone o repositório: `git clone https://github.com/igorssobral/library.git`
2. Navegue até o diretório do projeto: `cd library`
3. Compile o projeto: `mvn clean install`
4. Execute a aplicação: `mvn spring-boot:run`
