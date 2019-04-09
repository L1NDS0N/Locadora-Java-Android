package br.senai.rn.locadora.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.senai.rn.locadora.models.AuditedEntity;
import br.senai.rn.locadora.repositories.GenericRepository;

public abstract class GenericService<T extends AuditedEntity>{

	@Autowired
	private GenericRepository<T> repository;
	public void salvar(T entity) {
		repository.save(entity);
		
	}
	public void remover(T entity) {
		repository.delete(entity);
	}
	public void remover(Long id) {
		repository.deleteById(id);
	}
	
	public T obter(Long id) {
		//outra forma de escrever
		T entity = repository.findById(id).get();
		return entity;
	}
	public List<T> obterTodos(){
		return repository.findAll();
	}
}
