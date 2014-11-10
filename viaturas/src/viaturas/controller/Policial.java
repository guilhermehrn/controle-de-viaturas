package viaturas.controller;

/**
 * Estrutura que representa um policial
 * @author cesar
 *
 */
public class Policial {

	private String patente;
	private String nome;
	private String nomeDeGuerra;
	
	public Policial(String p, String n, String ng) {
		this.patente = p;
		this.nome = n;
		this.nomeDeGuerra = ng;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return patente = " " + nome;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeDeGuerra() {
		return nomeDeGuerra;
	}

	public void setNomeDeGuerra(String nomeDeGuerra) {
		this.nomeDeGuerra = nomeDeGuerra;
	}
	
	public void relatarIncidente(Incidente i, String mensagem) {
		i.setRelatorioIncidente(mensagem);
		i.setRelator(this);
	}
}
