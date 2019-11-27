package br.ufc.qxd.persist.conteudo_9_cassandra.dao.cassandra;

import java.util.ArrayList;
import java.util.List;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.BoundStatement;
import com.datastax.oss.driver.api.core.cql.PreparedStatement;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;

import br.ufc.qxd.persist.conteudo_9_cassandra.cassandra.CassandraUtil;
import br.ufc.qxd.persist.conteudo_9_cassandra.dao.DepartamentoDAO;
import br.ufc.qxd.persist.conteudo_9_cassandra.model.Departamento;
import br.ufc.qxd.persist.conteudo_9_cassandra.model.Projeto;
import br.ufc.qxd.persist.conteudo_9_cassandra.model.User;

public class DepartamentoCassadraDAO implements DepartamentoDAO {

	private CqlSession session;

	public DepartamentoCassadraDAO() {
		this.session = CassandraUtil.getSession();
	}

	@Override
	public void insert(Departamento departamento) {
		PreparedStatement stmt = session.prepare(""
				+ "INSERT INTO departamentos "
				+ "(id, nome, funcionarios, projetos) "
				+ "VALUES (?, ?);");
		BoundStatement bound = stmt.bind(departamento.getId(), departamento.getNome());
		session.execute(bound);
	}

	@Override
	public void update(Departamento departamento) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void addProjeto(Departamento departamento, Projeto projeto) {
		PreparedStatement stmt = session.prepare(""
				+ "UPDATE departamento_projeto SET "
				+ "departamento_id=?, departamento_nome=?, projeto_id=?, projeto_nome=?");
		BoundStatement bound = stmt.bind(departamento.getId(),
				departamento.getNome(), projeto.getId(), projeto.getNome());
		session.execute(bound);
	}

//	@Override
//	public void addProjeto(Departamento departamento, Projeto projeto) {
//		PreparedStatement stmt = session.prepare(""
//				+ "UPDATE users SET "
//				+ "nome=?, emails=?, top_places=?, coisas_a_fazer=? "
//				+ "WHERE id=?;");
//		BoundStatement bound = stmt.bind(user.getNome(),
//				user.getEmails(), user.getTopPlaces(), 
//				user.getCoisasAFazer(), user.getId());
//		session.execute(bound);
//	}

	@Override
	public void delete(Departamento departamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Departamento find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departamento> findAll() {
		List<Departamento> departamentos = new ArrayList<Departamento>();
		String cql = "SELECT * FROM departamentos;";
		ResultSet rs = session.execute(cql);
		List<Row> rows = rs.all();
		for(Row row : rows) {
			departamentos.add(Departamento.fromRow(row));
		}
		return departamentos;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
