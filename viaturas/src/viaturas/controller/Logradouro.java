package viaturas.controller;

/**
 * Logradouros de um bairro
 * @author cesar
 *
 */
public class Logradouro extends Local {

//	Avenida, rua, alameda, etc.
	protected String tipo;
	
	
//	"nome" da rua
	public Logradouro() {
		super();
		this.tipo = "";
	}
	
	public Logradouro(int id, String tipo, String descricao) {
		super(id, descricao);
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	@Override
	public String toString() {
		return this.tipo + " " + super.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		
//		Se as descrições são iguais, o logradouro é igual
//		Uso para comparação em arraylists
		if(obj instanceof Logradouro) {
			Logradouro c = (Logradouro) obj;
			return descricao.equalsIgnoreCase(c.getDescricao());
		} else {
			return false;
		}
	}
}
