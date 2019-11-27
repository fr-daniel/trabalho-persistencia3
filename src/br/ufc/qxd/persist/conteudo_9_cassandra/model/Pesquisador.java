package br.ufc.qxd.persist.conteudo_9_cassandra.model;

import java.time.LocalDate;

import com.datastax.oss.driver.api.core.cql.Row;

public class Pesquisador extends Funcionario{
	
	private String areaAtuacao;
		
	public Pesquisador() {
		this(0, "", "",0.0, LocalDate.now(), "");
	}
	
	public Pesquisador(String areaAtuacao) {
		this(0, "", "",0.0, LocalDate.now(), areaAtuacao);
	}

	public Pesquisador(int id, String nome, String endereco, Double salario, LocalDate dataNascimento, String areaAtuacao) {
			super(id, nome, endereco, salario, dataNascimento);
			this.areaAtuacao = areaAtuacao;
	}


	public String getAreaAtuacao() {
		return areaAtuacao;
	}
	
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	@Override
	public String toString() {
		return "Projeto [areaAtuacao=" + areaAtuacao  + "]";
	}
	
	
	public static Pesquisador fromRow(Row row) {
		if(row == null) return null;
		Pesquisador pesquisador = new Pesquisador();
		
		pesquisador.setId(row.getInt("id"));
		pesquisador.setNome(row.getString("nome"));
		pesquisador.setEndereco(row.getString("endereco"));
		pesquisador.setSalario(row.getDouble("salario"));
		pesquisador.setDataNascimento(LocalDate.parse(row.getString("data_nascimento")));
		pesquisador.setAreaAtuacao(row.getString("area_atuacao"));
		
		return pesquisador;
	}

}
