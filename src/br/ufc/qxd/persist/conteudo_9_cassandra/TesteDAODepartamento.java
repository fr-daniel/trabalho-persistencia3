package br.ufc.qxd.persist.conteudo_9_cassandra;

import java.util.List;

import br.ufc.qxd.persist.conteudo_9_cassandra.dao.DepartamentoDAO;
import br.ufc.qxd.persist.conteudo_9_cassandra.dao.cassandra.DepartamentoCassadraDAO;
import br.ufc.qxd.persist.conteudo_9_cassandra.model.Departamento;

public class TesteDAODepartamento {

	public static void test() {
		DepartamentoDAO dao = new DepartamentoCassadraDAO();
		
		insertDAO(dao);
		findAllDAO(dao);
		
		dao.close();
	}
	
	private static void insertDAO(DepartamentoDAO dao) {
		Departamento departamento = new Departamento();
		departamento.setId(1);
		departamento.setNome("Computação");
		
		dao.insert(departamento);
	}
	
	private static void findAllDAO(DepartamentoDAO dao) {
		List<Departamento> departamentos = dao.findAll();
		for(Departamento departamento : departamentos) {
			System.out.println(departamento);
		}
	}
	
}
