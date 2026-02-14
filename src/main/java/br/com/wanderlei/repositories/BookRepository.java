package br.com.wanderlei.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wanderlei.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}