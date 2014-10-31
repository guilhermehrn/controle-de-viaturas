package viaturas.controller;

import java.util.ArrayList;

public class Bairro {

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
	
}
