package br.ufc.qxd.persist.conteudo_9_cassandra.dao;

import java.util.List;

import br.ufc.qxd.persist.conteudo_9_cassandra.model.Dependente;

public interface DependenteDAO {
	
public void insert(Dependente dependente);
	
	public void update(Dependente dependente);
	
	public void delete(Dependente dependente);
	
	public void delete(Object id);
	
	public Dependente find(Object id);
	
	public List<Dependente> findAll();
	
	public void close();

}
