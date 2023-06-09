package com.bruno.bookstore.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bruno.bookstore.entities.Categoria;
import com.bruno.bookstore.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	
	@Autowired
	private CategoriaRepository repository;
	
	
	public Categoria findById(Integer id ) {
		
		  Optional<Categoria> categoria =  repository.findById(id);
		  
		  
		  return categoria.orElse(null);
		
	}

}
