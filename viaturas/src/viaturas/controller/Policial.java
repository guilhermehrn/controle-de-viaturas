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
	 * Retorna a patente de um policial.
	 * @return
	 */
	public String getPatente() {
		return patente;
	}

	/**
	 * Muda a patente de um policial.
	 * @param patente nova patente.
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}

	/**
	 * Retorna o nome do policial.
	 * @return nome.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Munda o nome do plicial.
	 * @param nome novo nome.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retona o nome de gerra.
	 * @return nome de gerra do policial.
	 */
	public String getNomeDeGuerra() {
		return nomeDeGuerra;
	}

	/**
	 * Edita o nome de gerra do policial
	 * @param nomeDeGuerra noco nome de gerra.
	 */
	public void setNomeDeGuerra(String nomeDeGuerra) {
		this.nomeDeGuerra = nomeDeGuerra;
	}
	
	/**
	 * gera o relatorio do incidente.
	 * @param i O incidente atendido
	 * @param mensagem o que foi obiservado.
	 */
	public void relatarIncidente(Incidente i, String mensagem) {
		i.setRelatorioIncidente(mensagem);
		i.setRelator(this);
	}
}
