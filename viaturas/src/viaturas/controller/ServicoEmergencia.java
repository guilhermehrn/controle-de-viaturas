package viaturas.controller;
/**
 * Estrutura que representa um serviço de emergencia
 * @author guilherme
 *
 */
public class ServicoEmergencia {

	private String nome;
	private String telefone;
	
	/**
	 * Retorna o nome do servico
	 * @return nome do servico
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Muda o nome do servico de emergencia.
	 * @param nome novo nome.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Retorna o numero do telefone do servico. 
	 * @return numero do telefone.
	 */
	public String getTelefone() {
		return telefone;
	}
	
	/**
	 * Edita o telefone do servico.
	 * @param telefone novo teleforne
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
