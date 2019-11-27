package br.ufc.qxd.persist.conteudo_9_cassandra.model;

import com.datastax.oss.driver.api.core.cql.Row;

public class Projeto {

	private Integer id;
	private String nome;
	private String dataInicio;
	private String dataFim;

	public Projeto() {
		this(0, "", "", "");
	}
	
	public Projeto(String nome) {
		this(0, nome, "", "");
	}
	
	public Projeto(int id, String nome) {
		this(id, nome, "", "");
	}

	public Projeto(int id, String nome, String dataInicio, String dataFim) {
		this.id = id;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
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
	
	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}


	@Override
	public String toString() {
		return "Projeto [id=" + id + ", nome=" + nome + ", dataInicio=" + dataInicio+ ", dataFim=" + dataFim + ", "
				+  "]";
	}
	
	public static Projeto fromRow(Row row) {
		if(row == null) return null;
		Projeto projeto = new Projeto();
		
		projeto.setId(row.getInt("id"));
		projeto.setNome(row.getString("nome"));
		projeto.setDataInicio(row.getString("dataInicio"));
		projeto.setDataFim(row.getString("dataFim"));
		
		return projeto;
	}
	
}
