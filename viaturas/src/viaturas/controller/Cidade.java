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
	 * @param id : identificador da cidade
	 * @param descricao : nome da cidade
	 * @param uf : estado ao qual a cidade pertence.
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
	 * @param r : array contedendo a regiões.
	 */
	public void setRegioes(ArrayList<Regiao> r) {
		this.regioes = r;
	}
	
	/**
	 * Adiciona uma cidade à lista de regiões da cidade
	 * @param id : identificador da cidade
	 * @param s : Nome da região
	 * @return :  retorna um obijeto do tipo região.
	 */
	public Regiao adicionarRegiao(int id, String s) {
		Regiao r = new Regiao(id, s);
		
		this.regioes.add(r);
		
		return r;
	}
	
	/**
	 * Exclui a região que ocupa a posição "pos" na lista de regiões da cidade.
	 * @param pos : posiçaõ do elemento a ser removido do array de regioes.
	 */
	public void removerRegiao(int pos){
		
		this.regioes.remove(pos);
	}
	
	/**
	 * Localiza a região pelo id
	 * @param id : identificador da Região
	 * @return :  retorna uma obijeto que representa a região encontrada.
	 * @throws IndexOutOfBoundsException
	 */
	public Regiao localizarRegiao(int id) throws IndexOutOfBoundsException {
		return regioes.get(id);
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
