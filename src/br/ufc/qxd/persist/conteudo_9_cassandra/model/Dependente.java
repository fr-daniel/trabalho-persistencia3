package br.ufc.qxd.persist.conteudo_9_cassandra.model;

import com.datastax.oss.driver.api.core.cql.Row;

public class Dependente {

	private Integer id;
	private String nome;
	private String sexo;
	private String dataNascimento;
	private String grauParentesco;
		
	public Dependente() {
		this(0, "", "", "", "");
	}
	
	public Dependente(String nome) {
		this(0, nome, "", "", "");
	}
	
	public Dependente(int id, String nome) {
		this(id, nome, "", "", "");
	}

	public Dependente(int id, String nome, String sexo, String dataNascimento, String grauParentesco) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.grauParentesco = grauParentesco;
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
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getgrauParentesco() {
		return dataNascimento;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}
	

	@Override
	public String toString() {
		return "Projeto [id=" + id + ", nome=" + nome + ", sexo=" + sexo+ ", dataNascimento=" + dataNascimento + ", "
				+ "grauParentesco=" + grauParentesco+ "]";
	}
	
	public static Dependente fromRow(Row row) {
		if(row == null) return null;
		Dependente dependente = new Dependente();
		
		dependente.setId(row.getInt("id"));
		dependente.setNome(row.getString("nome"));
		dependente.setSexo(row.getString("sexo"));
		dependente.setDataNascimento(row.getString("data_nascimento"));
		dependente.setGrauParentesco(row.getString("grau_parentesco"));
		
		return dependente;
	}
}
