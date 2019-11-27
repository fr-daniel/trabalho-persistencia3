package br.ufc.qxd.persist.conteudo_9_cassandra.model;

import com.datastax.oss.driver.api.core.cql.Row;

public class Departamento {
	
	private Integer id;
	private String nome;
	
	public Departamento() {
		this(0, "");
	}
	
	public Departamento(String nome) {
		this(0, nome);
	}
	
	public Departamento(int id, String nome) {
		this.id = id;
		this.nome = nome;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nome=" + nome + "]";
		
	}
	

	public static Departamento fromRow(Row row) {
		if(row == null) return null;
		Departamento departamento = new Departamento();
		
		departamento.setId(row.getInt("id"));
		departamento.setNome(row.getString("nome"));
		
		return departamento;
	}
	
}
