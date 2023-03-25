package com.bruno.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bruno.bookstore.entities.Livro;


@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
