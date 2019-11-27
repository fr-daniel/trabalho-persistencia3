package br.ufc.qxd.persist.conteudo_9_cassandra.model;

import java.time.LocalDate;

import com.datastax.oss.driver.api.core.cql.Row;

public abstract class Funcionario {
	
	private Integer id;
	private String nome;
	private String endereco;
	private Double salario;
	private LocalDate dataNascimento;
	
	public Funcionario() {
		this(0, "", "", 0.0, LocalDate.now());
	}
	
	public Funcionario(String nome) {
		this(0, nome, "", 0.0, LocalDate.now());
	}
	
	public Funcionario(int id, String nome) {
		this(id, nome, "", 0.0,  LocalDate.now());
	}

	public Funcionario(int id, String nome, String endereco, Double salario, LocalDate dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.salario = salario;
		this.dataNascimento = dataNascimento;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public static Funcionario fromRow(Row row) {
		if(row == null) return null;
		Funcionario funcionario = new Pesquisador();
		
		funcionario.setId(row.getInt("id"));
		funcionario.setNome(row.getString("nome"));
		funcionario.setEndereco(row.getString("endereco"));
		funcionario.setSalario(row.getDouble("salario"));
		funcionario.setDataNascimento(LocalDate.parse(row.getString("data_nascimento")));
		
		return funcionario;
	}

}
