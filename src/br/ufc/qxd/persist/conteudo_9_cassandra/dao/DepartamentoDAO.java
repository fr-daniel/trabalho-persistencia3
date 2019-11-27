package br.ufc.qxd.persist.conteudo_9_cassandra.dao;

import java.util.List;

import br.ufc.qxd.persist.conteudo_9_cassandra.model.Departamento;
import br.ufc.qxd.persist.conteudo_9_cassandra.model.Projeto;

public interface DepartamentoDAO {
	
	public void insert(Departamento departamento);
	
	public void update(Departamento departamento);
	
	public void delete(Departamento departamento);
	
	public void delete(Object id);
	
	public Departamento find(Object id);
	
	public List<Departamento> findAll();
	
	public void close();
	
	public void addProjeto(Departamento departamento, Projeto projeto);
}
