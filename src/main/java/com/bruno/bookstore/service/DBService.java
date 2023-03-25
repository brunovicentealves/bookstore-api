package com.bruno.bookstore.service;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bruno.bookstore.entities.Categoria;
import com.bruno.bookstore.entities.Livro;
import com.bruno.bookstore.repository.CategoriaRepository;
import com.bruno.bookstore.repository.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	
	public void instanciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null,"Tecnologia","Livros Didaticos");
		Categoria cat2 = new Categoria(null,"Ficção Cientifica","Ficção Cientifica");
		Categoria cat3 = new Categoria(null,"Biografica","Livros biografia");
		
		
		
		Livro l1 = new Livro(null,"Clean Code","Robert Martin","Loren ipsum", cat1);
		Livro l2 = new Livro(null,"Engenharia de software","Louis v","Loren ipsum", cat1);
		Livro l3 = new Livro(null,"The Time machine","H.G.Wells","Loren ipsum", cat1);
		Livro l4 = new Livro(null,"The War od the words","H.G.Wells","Loren ipsum", cat1);
		Livro l5 = new Livro(null,"I,Robot","Isaac Asimov","Loren ipsum", cat1);
		
		cat1.getLivros().addAll(Arrays.asList(l1,l2));
		cat2.getLivros().addAll(Arrays.asList(l3,l4,l5));
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5));
		
		
	}

}
