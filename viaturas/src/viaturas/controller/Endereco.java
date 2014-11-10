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

	/**
	 * istancia um objeto do tipo endereco com logradouro, numero, e um complemento (casa, apartemento, fazenda...).
	 * @param l : O logradouro a qual o endereco pertence.
	 * @param num : numero do endereço
	 * @param compl numero do complemento
	 */
	public Endereco (Logradouro l, int num, String compl) {
		this.logradouro = l;
		this.numero = num;
		this.complemento = compl;
	}
	
	/**
	 * istancia um objeto do tipo endereco com logradouro e numero. 
	 * @param l : O logradouro a qual o endereco pertence
	 * @param num : numero do endereço ou do imovel.
	 */
	public Endereco (Logradouro l, int num) {
		this(l, num, "");
	}
	
	/**
	 * Istancia um objeto do tipo endereco, construtor padrão.
	 */
	public Endereco () {
		this(new Logradouro(), 0, "");
	}

	/**
	 * Retorna o logradouro do objeto do tipo Endereço.
	 * @return : logradouro do endereco.
	 */
	public Logradouro getLogradouro() {
		return logradouro;
	}

	/**
	 * Modifica o logradouro do objeto do tipo Endereco
	 * @param logradouro : Novo logradouro.
	 */
	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}
	
	/**
	 * Retorna o número do endeço.
	 * @return : número do endeço.
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * Muda o numero do objeto do tipo endereço.
	 * @param numero : novo numero do objeto do tipo endeço.
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Retorn o complento do objeto do tipo endereço.
	 * @return : complento do endereço.
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * Munda o complento do objeto do tipo endereço.
	 * @param complemento  : complento do endereco.
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	/**
	 * Retorna o cep do endereco.
	 * @return : CEP
	 */
	public int getCEP() {
		return CEP;
	}

	/**
	 * Modifica o cep do objeto do tipo endereço.
	 * @param cEP : novo CEP.
	 */
	public void setCEP(int cEP) {
		CEP = cEP;
	}
	
	@Override
	public String toString() {
		return logradouro.toString() + ", n° " + numero + " " + complemento;
	}
	
}
