package viaturas.controller;

import java.util.ArrayList;

/**
 * Classe que define uma viatura no programa.
 * @author guilherme
 *
 */
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
	
	/**
	 * construtor padrão. Istancia um objeto do tipo viatura.
	 */
	public Viatura() {
		this(0,"", "", "", 0, "", new Regiao(), new ArrayList<Policial>());
	}
	
	/**
	 * Instacia um objeto do tipo viatura com sua placa e modelo
	 * @param placa numero da placa
	 * @param modelo nome do modelo do carro.
	 */
	public Viatura(String placa, String modelo) {
		this(0,"", placa, modelo, 0, "", new Regiao(), new ArrayList<Policial>());
	}

	/**
	 * Retorna o identificador do carro.
	 * @return Id do carro.
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Edita o ID da viatura.
	 * @param numero novo Id.
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * Retorna a renavam da viatura.
	 * @return renavam.
	 */
	public String getRenavam() {
		return renavam;
	}

	/**
	 * Edita o renavam da viatura.
	 * @param renavam novo renavam.
	 */
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	/**
	 * Retorna a placa da viatura.
	 * @return placa da viatua.
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * Edita a placa da viatura.
	 * @param placa nova placa.
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * Retorna o modelo da viatura.
	 * @return modelo da viatura.
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Edita o modelo da viatura. 
	 * @param modelo novo modelo da viatura.
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Retorna o ano da viatura.
	 * @return ano da viatura.
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Edita o ano da viatura.
	 * @param ano novo ano.
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * Retorna a cor da Viatura.
	 * @return cor da viatura.
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * Edita a cor da viatura.
	 * @param cor nova cor.
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * Retorna o fabricante.
	 * @return fabricante.
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * Retorna o Fabricante da viatura.
	 * @param fabricante
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/**
	 * Retorna a regia atual da viatura(localização)
	 * @return retorna a localização.
	 */
	public Regiao getRegiaoAtual() {
		return regiaoAtual;
	}

	/**
	 * Edita a região atual da viatura.
	 * @param regiaoAtual nova região.
	 */
	public void setRegiaoAtual(Regiao regiaoAtual) {
		this.regiaoAtual = regiaoAtual;
	}
	
	/**
	 * Adiciona um policial a viatura.
	 * @param p o policial a ser adicioando.
	 */
	public void adicionarPolicial(Policial p) {
		policiais.add(p);
	}
	
	/**
	 * remove um policial da viatura
	 * @param pos indice do plicial na viatura.
	 */
	public void removerPolicial(int pos) {
		policiais.remove(pos);
	}	
}
