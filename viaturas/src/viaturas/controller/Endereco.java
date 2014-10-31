package viaturas.controller;

/**
 * Endereço, contendo logradouro, número e complemento.
 * @author cesar
 *
 */
public class Endereco {

	private Logradouro logradouro;
	
	private int numero;
	
	private int CEP;
	
	private String complemento;

	public Endereco (Logradouro l, int num, String compl) {
		this.logradouro = l;
		this.numero = num;
		this.complemento = compl;
	}
	
	public Endereco (Logradouro l, int num) {
		this(l, num, "");
	}
	
	public Endereco () {
		this(new Logradouro(), 0, "");
	}

	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}
	
	@Override
	public String toString() {
		return logradouro.toString() + ", n° " + numero + " " + complemento;
	}
	
}
