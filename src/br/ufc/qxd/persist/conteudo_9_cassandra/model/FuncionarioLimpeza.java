package br.ufc.qxd.persist.conteudo_9_cassandra.model;

import java.time.LocalDate;

import com.datastax.oss.driver.api.core.cql.Row;

public class FuncionarioLimpeza extends Funcionario{
	
	private String jornadaTrabalho;
	private String cargo;
		
	public FuncionarioLimpeza() {
		this(0, "", "", 0.0, LocalDate.now(), "", "");
	}
	
	public FuncionarioLimpeza(String nome) {
		this(0, nome, "", 0.0, LocalDate.now(), "", "");
	}
	
	public FuncionarioLimpeza(int id,String nome) {
		this(id, nome, "", 0.0, LocalDate.now(), "", "");
	}
	
	public FuncionarioLimpeza(int id, String nome, String endereco, Double salario, LocalDate dataNascimento, String jornadaTrabalho, String cargo) {
			super(id, nome, endereco, salario, dataNascimento);
			this.jornadaTrabalho = jornadaTrabalho;
			this.cargo = cargo;
		}


	public String getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(String jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Projeto [jornadaTrabalho=" + jornadaTrabalho + ", cargo=" + cargo + "]";
	}
	
	public static FuncionarioLimpeza fromRow(Row row) {
		if(row == null) return null;
		FuncionarioLimpeza funcionarioLimpeza = new FuncionarioLimpeza();
		
		funcionarioLimpeza.setId(row.getInt("id"));
		funcionarioLimpeza.setNome(row.getString("nome"));
		funcionarioLimpeza.setEndereco(row.getString("endereco"));
		funcionarioLimpeza.setSalario(row.getDouble("salario"));
		funcionarioLimpeza.setDataNascimento(LocalDate.parse(row.getString("data_nascimento")));
		funcionarioLimpeza.setJornadaTrabalho(row.getString("jornada_trabalho"));
		funcionarioLimpeza.setCargo(row.getString("cargo"));
		
		return funcionarioLimpeza;
	}
	
}
