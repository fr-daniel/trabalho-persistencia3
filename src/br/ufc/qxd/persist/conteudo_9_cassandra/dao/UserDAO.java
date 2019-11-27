package br.ufc.qxd.persist.conteudo_9_cassandra.dao;

import java.util.List;

import br.ufc.qxd.persist.conteudo_9_cassandra.model.User;

public interface UserDAO {

	public void insert(User user);
	
	public void update(User user);
	
	public void delete(User user);
	
	public void delete(Object id);
	
	public User find(Object id);
	
	public List<User> findAll();
	
	public void close();
}
