package br.ufc.qxd.persist.conteudo_9_cassandra.dao;

import java.util.List;

import br.ufc.qxd.persist.conteudo_9_cassandra.model.Pesquisa;

public interface PesquisaDAO {
	
	public void update(Pesquisa pesquisa);
	
	public void delete(Pesquisa pesquisa);
	
	public void delete(Object id);
	
	public Pesquisa find(Object id);
	
	public List<Pesquisa> findAll();
	
	public void close();

}
