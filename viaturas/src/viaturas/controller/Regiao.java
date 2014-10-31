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
	
	public Regiao() {
		bairros = new ArrayList<Bairro>();
	}
	
	public Regiao(ArrayList<Bairro> b) {
		bairros = b;
	}

	/**
	 * Adiciona um bairro à região.
	 * @param b
	 */
	public void adicionarBairro(Bairro b) {
		bairros.add(b);
	}
	
	/**
	 * Adiciona um bairro à região
	 * @param pos
	 */
	public void removerBairro(int pos){
		bairros.remove(pos);
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
