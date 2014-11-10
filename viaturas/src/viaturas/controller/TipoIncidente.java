package viaturas.controller;

/**
 * Estrutura que representa um tipo de incidente
 * @author guilherme
 *
 */
public class TipoIncidente {

	private int id;
	
	private String descricao;
	
	/**
	 * instancia um objeto do tipo TipoIncidente com sua ID e nome
	 * @param i identificador do objeto
	 * @param desc nome do objeto
	 */
	public TipoIncidente(int i, String desc) {
		this.id = i;
		this.descricao = desc;
	}
	
	/**
	 * Construto que istacia um tipo de incidente
	 */
	public TipoIncidente() {
		this.id = 0;
		this.descricao = ""; 
	}

	/**
	 * Retorna a descrição de um Tipo de incidente.
	 * @return descrição do incidente
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Edita a descrição de um incidente.
	 * @param descricao :  nova descricão
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Retorna a Id do Tipo de incidente
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO gerar toString do Tipo de Incidente
		return super.toString();
	}
	
	/**
	 * Edita a id do incidente.
	 * @param id
	 */
	public void setId(int id){
		this.id = id;
	}
	
}
