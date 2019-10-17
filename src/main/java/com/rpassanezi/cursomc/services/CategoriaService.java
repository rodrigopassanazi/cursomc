/*
 * Classe para representar a Camada de Serviço que oferece consulta em Categorias
 */
package com.rpassanezi.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpassanezi.cursomc.domain.Categoria;
import com.rpassanezi.cursomc.repositories.CategoriaRepository;


@Service
public class CategoriaService {
	
	/*
	 * declaração de dependencia de um objeto do tipo CategoriaRepository
	 * A dependencia vai ser automaticamente instanciada pelo Spring injeçao de dependencia ou inversao de controle
	 */
	@Autowired
	private CategoriaRepository repo;
	
	/*
	 * 
	 */
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}

}
