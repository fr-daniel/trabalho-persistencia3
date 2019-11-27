package br.ufc.qxd.persist.conteudo_9_cassandra.dao;

import java.util.List;

import br.ufc.qxd.persist.conteudo_9_cassandra.model.Projeto;

public interface ProjetoDAO {
	
	public void insert(Projeto projeto);
	
	public void update(Projeto projeto);
	
	public void delete(Projeto projeto);
	
	public void delete(Object id);
	
	public Projeto find(Object id);
	
	public List<Projeto> findAll();
	
	public void close();

}
