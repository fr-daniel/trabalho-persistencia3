package br.ufc.qxd.persist.conteudo_9_cassandra.model;

import com.datastax.oss.driver.api.core.cql.Row;

public class Pesquisa {

	private Integer id;
	private Integer cargaHoraria;
	
	public Pesquisa() {
		this(0, 0);
	}
	
	public Pesquisa(int id) {
		this(id, 0);
	}

	public Pesquisa(int id, int cargaHoraria) {
		this.id = id;
		this.cargaHoraria = cargaHoraria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	

	@Override
	public String toString() {
		return "Pesquisa [id=" + id + ", cargaHoraria=" + cargaHoraria+ "]";
	}
	
	public static Pesquisa fromRow(Row row) {
		if(row == null) return null;
		Pesquisa pesquisa = new Pesquisa();
		
		pesquisa.setId(row.getInt("id"));
		pesquisa.setCargaHoraria(row.getInt("carga_horaria"));
		
		return pesquisa;
	}

	
}
