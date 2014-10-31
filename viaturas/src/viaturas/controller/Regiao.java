package viaturas.controller;

import java.util.ArrayList;

public class Regiao extends Local {

	ArrayList<Bairro> bairros;
	
	public Regiao() {
		bairros = new ArrayList<Bairro>();
	}
	
	public Regiao(ArrayList<Bairro> b) {
		bairros = b;
	}
	
	public void adicionarBairro(Bairro b) {
		bairros.add(b);
	}
	
	public void removerBairro(int pos){
		bairros.remove(pos);
	}
	
}
