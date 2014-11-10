package viaturas.controller;

/**
 * Clase que define um local geral da ocorrecia (Bairro, cidade, estado , ect...).
 * @author guilherme
 *
 */
public class Local {

	protected int id;
	
	protected String descricao;

	/**
	 * Istancia um objeto do tipo Local (padrão). 
	 */
	public Local() {
		this.descricao = "";
	}
	
	/**
	 * Istancia um objento do tipo Local com sua ID e nome.
	 * @param id : Identificador do local.
	 * @param descricao Nome do local.
	 */
	public Local(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	/**
	 * Retorna a Identificação do local.
	 * @return ID do local
	 */
	public int getId() {
		return id;
	}

	/**
	 * Edita a ID do local
	 * @param id nova ID.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Retorna o nome do local
	 * @return nome do local
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Edita o nome do local
	 * @param descricao novo nome do local.
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
	/**
	 *  return verdadeiro se ID passado como parametro é igual ao ID do objeto instaciado. Falso caso contrario
	 * @param id : ID a aser comaparado
	 * @return  true se forem iguais , false caso contrario.
	 */
	public Boolean idCorresponde (int id) {
		return this.id == id;
	}
	
	/**
	 * TEsta se no nome tem ou não o texto passado como parametro
	 * @param texto
	 * @return true se tiver o texto dentro do nome, false para caso contrario.
	 */
	public Boolean descricaoContem(String texto) {
		return this.descricao.contains(texto);
	}
	
}
