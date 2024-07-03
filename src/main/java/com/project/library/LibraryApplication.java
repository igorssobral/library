package com.project.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {

	private final LibraryFacade libraryFacade;

	@Autowired
	public LibraryApplication(LibraryFacade libraryFacade) {
		this.libraryFacade = libraryFacade;
	}

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		libraryFacade.addBook("1984", "George Orwell", "123456789");
		libraryFacade.addBook("Estruturas de Dados", "Thiago Leite e Carvalho", "987654321");

		System.out.println("Todos os Livros da Biblioteca:");
		for (Book book : libraryFacade.getAllBooks()) {
			System.out.println(book);
		}

		System.out.println("Buscando o Livro pelo isbn: 123456789:");
		System.out.println(libraryFacade.findBookByIsbn("123456789"));

		// Verifica se a mesma instância de DatabaseConnection é usada
		DatabaseConnection db1 = DatabaseConnection.getInstance();
		DatabaseConnection db2 = DatabaseConnection.getInstance();
		System.out.println("Verificando se são a mesma instância? " + (db1 == db2));
		System.out.println(db1);
		System.out.println(db2);
	}
}
