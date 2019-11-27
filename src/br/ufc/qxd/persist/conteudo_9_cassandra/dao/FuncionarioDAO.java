package br.ufc.qxd.persist.conteudo_9_cassandra.dao;

import java.util.List;

import br.ufc.qxd.persist.conteudo_9_cassandra.model.Funcionario;

public interface FuncionarioDAO {
	
	public void insert(Funcionario funcionario);
	
	public void update(Funcionario funcionario);
	
	public void delete(Funcionario funcionario);
	
	public void delete(Object id);
	
	public Funcionario find(Object id);
	
	public List<Funcionario> findAll();
	
	public void close();

}
