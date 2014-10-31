package viaturas.controller;

import java.util.ArrayList;

public class Cidade extends Local{

	private String uf;
	
	ArrayList<Regiao> regioes;
	

	public Cidade() {
		super();
		
		this.uf = "";
	}

	public Cidade(int id, String descricao, String uf) {
		super(id, descricao);
		
		// Inicializa UF
		this.uf = uf;
		
		// Inicializa Lista de regiões da cidade
		regioes = new ArrayList<Regiao>();
		
	}

	public String getUf() {
		return uf;
	}
	
	public void setRegioes(ArrayList<Regiao> r) {
		this.regioes = r;
	}
	
	public void adicionarRegiao(Regiao r) {
		
		this.regioes.add(r);
	}
	
	public void removerRegiao(int pos){
		
		this.regioes.remove(pos);
	}
	
	
}
