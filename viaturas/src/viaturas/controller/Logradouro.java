package viaturas.controller;

public class Logradouro extends Local {

	protected String tipo;
	
	public Logradouro() {
		super();
		this.tipo = "";
	}
	
	public Logradouro(int id, String tipo, String descricao) {
		super(id, descricao);
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
}
