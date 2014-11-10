package viaturas.controller;

import java.util.ArrayList;

/**
 * Regiões de uma cidade
 * @author cesar
 *
 */
public class Regiao extends Local {
	
//	Reune os bairros contidos na regiao
	ArrayList<Bairro> bairros;
	
	/**
	 * Istancia um obijeto do tipo regiaão com seu id, nome, e conjunto de bairro.
	 * @param id = Identificador da região
	 * @param desc = nome da regiao.
	 * @param l = conjunto de bairros pertencente a regiao.
	 */
	public Regiao(int id, String desc, ArrayList<Bairro> l) {
		super(id, desc);
		bairros = l;
	}
	
	/**
	 * Istancia um obijeto do tipo regiaão com seu id e nome
	 * @param id indentificação da regiao.
	 * @param desc nome da regiao.
	 */
	public Regiao(int id, String desc) {
		this(id, desc, new ArrayList<Bairro>());
	}
	
	/**
	 * Istancia um obijeto do tipo regiao vazia.
	 */
	public Regiao() {
		this(0, "", new ArrayList<Bairro>());
	}
	

	/**
	 * Adiciona um bairro à região.
	 * @param b
	 */
	public Bairro adicionarBairro(int id, String desc) {
		Bairro b = new Bairro(id, desc);
		bairros.add(b);
		return b;
	}
	
	/**
	 * Adiciona um bairro à região
	 * @param pos
	 */
	public void removerBairro(int pos){
		bairros.remove(pos);
	}
	
	/**
	 * Localiza o bairro pelo id
	 * @param id
	 * @return
	 * @throws IndexOutOfBoundsException
	 */
	public Bairro localizarBairro(int id) throws IndexOutOfBoundsException {
		return bairros.get(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		
//		Se as descrições são iguais, a região é igual
//		Uso para comparação em arraylists
		if(obj instanceof Regiao) {
			Regiao c = (Regiao) obj;
			return descricao.equalsIgnoreCase(c.getDescricao());
		} else {
			return false;
		}
	}

	
}
