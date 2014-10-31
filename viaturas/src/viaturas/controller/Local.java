package viaturas.controller;

public class Local {

	protected int id;
	
	protected String descricao;

	public Local() {
		this.descricao = "";
	}
	
	public Local(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
	public Boolean idCorresponde (int id) {
		return this.id == id;
	}
	
	public Boolean descricaoContem(String texto) {
		return this.descricao.contains(texto);
	}
	
	
}
