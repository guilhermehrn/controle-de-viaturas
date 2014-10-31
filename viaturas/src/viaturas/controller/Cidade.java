package viaturas.controller;

import java.util.ArrayList;

/**
 * Representa uma cidade.
 * @author cesar
 *
 */
public class Cidade extends Local{

//	ou "estado" à qual a cidade pertence
	private String uf;
	
//	Contém as regiões da cidade
	ArrayList<Regiao> regioes;
	

	/**
	 * Construtor vazio de cidade
	 */
	public Cidade() {
		super();
		
		this.uf = "";
	}

	/**
	 * Construtor não vazio de cidade
	 * @param id
	 * @param descricao
	 * @param uf
	 */
	public Cidade(int id, String descricao, String uf) {
		super(id, descricao);
		
		this.uf = uf;
		
		regioes = new ArrayList<Regiao>();
		
	}

	/**
	 * Retorna o estado
	 * @return O nome do estado
	 */
	public String getUf() {
		return uf;
	}
	
	/**
	 * Inicializa a lista de regiões da cidade a partir de uma lista de regiões existente.
	 * @param r
	 */
	public void setRegioes(ArrayList<Regiao> r) {
		this.regioes = r;
	}
	
	/**
	 * Adiciona uma cidade à lista de regiões da cidade
	 * @param r
	 */
	public void adicionarRegiao(Regiao r) {
		
		this.regioes.add(r);
	}
	
	/**
	 * Exclui a região que ocupa a posição "pos" na lista de regiões da cidade.
	 * @param pos
	 */
	public void removerRegiao(int pos){
		
		this.regioes.remove(pos);
	}
	

	@Override
	public boolean equals(Object obj) {
		
//		Se as descrições são iguais, a cidade é igual
//		Uso para comparação em arraylists
		if(obj instanceof Cidade) {
			Cidade c = (Cidade) obj;
			return descricao.equalsIgnoreCase(c.getDescricao());
		} else {
			return false;
		}
	}
}
