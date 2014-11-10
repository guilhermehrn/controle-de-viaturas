package viaturas.controller;

import java.util.ArrayList;

/**
 * Bairros de uma cidade/região.
 * @author cesar
 *
 */
public class Bairro extends Local {

	ArrayList<Logradouro> logradouros; 
	
	public Bairro(int id, String desc, ArrayList<Logradouro> l) {
		super(id, desc);
		logradouros = l;
	}
	
	/**
	 * Istancia um objeto Bairro
	 * @param id: Identificador do Bairro
	 * @param desc
	 */
	public Bairro(int id, String desc) {
		this(id, desc, new ArrayList<Logradouro>());
	}
	
	/**
	 * Istancia um objeto Bairro.
	 */
	public Bairro() {
		this(0, "", new ArrayList<Logradouro>());
	}
	
	/**
	 * Isere uma cojunto de logradouros em bairro
	 * @param l : array contendo todos os logradouros a serem iseridos.
	 */
	public void setLogradouro(ArrayList<Logradouro> l) {
		this.logradouros = l;
	}
	
	/**
	 * Adicioana um logradouro no conjunto de logradouros pertencetes a um objeto do tipo Bairro.
	 * @param id : Identificador do logradouro
	 * @param tipo : tipo de logradouro
	 * @param desc : Nome do novo logradouro.
	 * @return retorna o objeto do tipo Logradouro que foi inserido.
	 */
	public Logradouro adicionarLogradouro(int id, String tipo, String desc) {
		Logradouro l = new Logradouro(id, tipo, desc);
		
		logradouros.add(l);
		
		return l;
	}
	
	/**
	 * Remove um logradouro do conjunto de logradrouros presente no objeto do tipo Bairro.
	 * @param pos : posição do elemento dentro do array a ser retirado.
	 */
	public void removerLogradouro(int pos){
		logradouros.remove(pos);
	}
	
	/**
	 * Localiza o logradouro pelo id
	 * @param id :  Identificador do logradouro a ser buscado
	 * @return o logradoro que foi localizado.
	 * @throws IndexOutOfBoundsException
	 */
	public Logradouro localizarLogradouro(int id) throws IndexOutOfBoundsException {
		return logradouros.get(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		
//		Se s descrições são iguais, o bairro é igual
//		Uso para comparação em arraylists
		if(obj instanceof Bairro) {
			Bairro c = (Bairro) obj;
			return descricao.equalsIgnoreCase(c.getDescricao());
		} else {
			return false;
		}
	}
	
}
