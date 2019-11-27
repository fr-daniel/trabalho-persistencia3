package br.ufc.qxd.persist.conteudo_9_cassandra;

import java.time.LocalDateTime;
import java.util.List;

import com.datastax.oss.driver.api.core.CqlSession;

import br.ufc.qxd.persist.conteudo_9_cassandra.cassandra.SimpleClient;
import br.ufc.qxd.persist.conteudo_9_cassandra.dao.UserDAO;
import br.ufc.qxd.persist.conteudo_9_cassandra.dao.cassandra.UserCassadraDAO;
import br.ufc.qxd.persist.conteudo_9_cassandra.model.User;

public class Principal {

	public static void main(String[] args) {
		
		// exemplo01SimpleClient();
		TesteDAODepartamento.test();
		
		System.out.println("Bye, Cassandra");
	}
	
	public static void testesComDao() {
		UserDAO dao = new UserCassadraDAO();
		
//		 exemplo02InsertDAO(dao);
		// exemplo03UpdateDAO(dao);
		// exemplo04DeleteByIdDAO(dao);
		// exemplo05DeleteByUserDAO(dao);
		// exemplo06findByIdDAO(dao);
		exemplo07findAllDAO(dao);
		
		dao.close();
	}
	
	public static void exemplo07findAllDAO(UserDAO dao) {
		List<User> users = dao.findAll();
		for(User user : users) {
			System.out.println(user);
		}
	}
	
	public static void exemplo06findByIdDAO(UserDAO dao) {
		User user = dao.find(2);
		System.out.println(user);
	}
	
	public static void exemplo05DeleteByUserDAO(UserDAO dao) {
		User u1 = new User(4, "Anderson"); // buscado do banco
		dao.delete(u1);
	}
	
	public static void exemplo04DeleteByIdDAO(UserDAO dao) {
		dao.delete(3);
	}
	
	public static void exemplo03UpdateDAO(UserDAO dao) {
		User u1 = new User(2, "Anderson");
		u1.addEmail("a@gmail.com");
		u1.addEmail("a@ufc.br");
		u1.addEmail("a@ufc.br");
		u1.addTopPlace("UFC");
		u1.addTopPlace("Quixadá");
		u1.addCoisaAFazer(LocalDateTime.now(), "dar aula de persistencia");
		u1.addCoisaAFazer(LocalDateTime.of(2020, 1, 7, 23, 55), "dormir");
		
		u1.setNome("Anderson Lemos");
		u1.addEmail("a@ufmg.br");
		u1.getTopPlaces().remove("UFC");
		u1.addCoisaAFazer(LocalDateTime.of(2020, 1, 7, 23, 55), "assistir televisão");
	
		dao.update(u1);
	}
	
	public static void exemplo02InsertDAO(UserDAO dao) {
		
		User u1 = new User(2, "Anderson");
		u1.addEmail("a@gmail.com");
		u1.addEmail("a@ufc.br");
		u1.addEmail("a@ufc.br");
		u1.addTopPlace("UFC");
		u1.addTopPlace("Quixadá");
		u1.addCoisaAFazer(LocalDateTime.now(), "dar aula de persistencia");
		u1.addCoisaAFazer(LocalDateTime.of(2020, 1, 7, 23, 55), "dormir");
		
		dao.insert(u1);
		
	}
	
	public static void exemplo01SimpleClient() {
		SimpleClient sc = new SimpleClient();
		
		CqlSession session = sc.getSession();
		
		System.out.println(session);
		
		sc.closeSession();
	}
}
