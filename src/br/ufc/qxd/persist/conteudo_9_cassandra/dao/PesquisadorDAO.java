package br.ufc.qxd.persist.conteudo_9_cassandra.dao;

import java.util.List;

public interface PesquisadorDAO {
	
	public void update(PesquisadorDAO pesquisador);
	
	public void delete(PesquisadorDAO pesquisador);
	
	public void delete(Object id);
	
	public PesquisadorDAO find(Object id);
	
	public List<PesquisadorDAO> findAll();
	
	public void close();

}
