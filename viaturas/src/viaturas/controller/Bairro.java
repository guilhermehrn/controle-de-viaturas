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
	
	public Bairro(int id, String desc) {
		this(id, desc, new ArrayList<Logradouro>());
	}
	
	public Bairro() {
		this(0, "", new ArrayList<Logradouro>());
	}
	
	public void setLogradouro(ArrayList<Logradouro> l) {
		this.logradouros = l;
	}
	
	public Logradouro adicionarLogradouro(int id, String tipo, String desc) {
		Logradouro l = new Logradouro(id, tipo, desc);
		
		logradouros.add(l);
		
		return l;
	}
	
	public void removerLogradouro(int pos){
		logradouros.remove(pos);
	}
	
	/**
	 * Localiza o logradouro pelo id
	 * @param id
	 * @return
	 * @throws IndexOutOfBoundsException
	 */
	public Logradouro localizarLogradouro(int id) throws IndexOutOfBoundsException {
		return logradouros.get(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		
//		Se as descrições são iguais, o bairro é igual
//		Uso para comparação em arraylists
		if(obj instanceof Bairro) {
			Bairro c = (Bairro) obj;
			return descricao.equalsIgnoreCase(c.getDescricao());
		} else {
			return false;
		}
	}
	
}
