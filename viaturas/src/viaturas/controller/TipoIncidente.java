package viaturas.controller;

public class TipoIncidente {

	private int id;
	
	private String descricao;
	
	
	public TipoIncidente(int i, String desc) {
		this.id = i;
		this.descricao = desc;
	}
	
	public TipoIncidente() {
		this.id = 0;
		this.descricao = ""; 
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO gerar toString do Tipo de Incidente
		return super.toString();
	}
	
	
	
}
