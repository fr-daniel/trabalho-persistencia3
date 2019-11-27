package br.ufc.qxd.persist.conteudo_9_cassandra.dao;

import java.util.List;

import br.ufc.qxd.persist.conteudo_9_cassandra.model.FuncionarioLimpeza;

public interface FuncionarioLimpezaDAO {
	
	public void insert(FuncionarioLimpeza funcionarioLimpeza);
	
	public void update(FuncionarioLimpeza funcionarioLimpeza);
	
	public void delete(FuncionarioLimpeza funcionarioLimpeza);
	
	public void delete(Object id);
	
	public FuncionarioLimpeza find(Object id);
	
	public List<FuncionarioLimpeza> findAll();
	
	public void close();

}
