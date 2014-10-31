package viaturas.controller;

import java.util.ArrayList;

/**
 * Bairros de uma cidade/região.
 * @author cesar
 *
 */
public class Bairro extends Local {

	ArrayList<Logradouro> logradouros;
	
	public Bairro () {
		this.logradouros = new ArrayList<Logradouro>();
	}
	
	public Bairro (ArrayList<Logradouro> l) {
		this.logradouros = l;
	}
	
	public void setLogradouro(ArrayList<Logradouro> l) {
		this.logradouros = l;
	}
	
	public void adicionarLogradouro(Logradouro l) {
		logradouros.add(l);
	}
	
	public void removerLogradouro(int pos){
		logradouros.remove(pos);
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
