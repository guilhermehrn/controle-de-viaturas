package viaturas.controller;

import java.util.ArrayList;

public class Viatura {
	private int numero;
	private String renavam;
	private String placa;
	private String modelo;
	private int ano;
	private String cor;
	private String fabricante;
	private Regiao regiaoAtual;
	
	private ArrayList<Policial> policiais;
	
	public Viatura(int numero, String ren, String placa, String modelo, int ano, String fabr, Regiao regiao, ArrayList<Policial> pol) {
		this.setNumero(numero);
		this.renavam = ren;
		this.placa = placa;
		this.ano = ano;
		this.fabricante = fabr;
		this.regiaoAtual = regiao;
		this.policiais = pol;
	}
	
	public Viatura() {
		this(0,"", "", "", 0, "", new Regiao(), new ArrayList<Policial>());
	}
	
	public Viatura(String placa, String modelo) {
		this(0,"", placa, modelo, 0, "", new Regiao(), new ArrayList<Policial>());
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Regiao getRegiaoAtual() {
		return regiaoAtual;
	}

	public void setRegiaoAtual(Regiao regiaoAtual) {
		this.regiaoAtual = regiaoAtual;
	}
	
	public void adicionarPolicial(Policial p) {
		policiais.add(p);
	}
	
	public void removerPolicial(int pos) {
		policiais.remove(pos);
	}	
}
