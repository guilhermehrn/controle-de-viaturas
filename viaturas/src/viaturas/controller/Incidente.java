package viaturas.controller;

import java.util.Date;

/**
 * Registro de incidentes, bem como relatório de solução, policial responsável e viatura
 * @author cesar
 *
 */
public class Incidente {

	private TipoIncidente tipo;
	
	private String descricaoOcorrencia;
	
	private Endereco endereco;
	
	private Bairro bairro;
	
	private Regiao regiao;
	
	private Cidade cidade;
	
	private Date data;
	
	private Boolean solucionado;
	
	private String relatorioIncidente;
	
	private Policial relator;
	
	private Viatura viaturaDirecionada;
	
	public Viatura getViaturaDirecionada() {
		return viaturaDirecionada;
	}
	
	public String getDescricaoOcorrencia() {
		return descricaoOcorrencia;
	}
	
	public void setDescricaoOcorrencia(String descricaoOcorrencia) {
		this.descricaoOcorrencia = descricaoOcorrencia;
	}

	public void setViaturaDirecionada(Viatura viaturaDirecionada) {
		this.viaturaDirecionada = viaturaDirecionada;
	}

	public Policial getRelator() {
		return relator;
	}

	public void setRelator(Policial relator) {
		this.relator = relator;
	}

	public String getRelatorioIncidente() {
		return relatorioIncidente;
	}

	public void setRelatorioIncidente(String relatorioIncidente) {
		this.relatorioIncidente = relatorioIncidente;
	}

	public Boolean getSolucionado() {
		return solucionado;
	}

	public void setSolucionado(Boolean solucionado) {
		this.solucionado = solucionado;
	}

	public Incidente(TipoIncidente t, Endereco e, Bairro b, Regiao r, Cidade c, Date d) {
		this.tipo = t;
		this.endereco = e;
		this.bairro = b;
		this.regiao = r;
		this.cidade = c;
		this.data = d;
	}
	
	public Incidente() {
		this.tipo = new TipoIncidente();
		this.endereco = new Endereco();
		this.bairro = new Bairro();
		this.regiao = new Regiao();
		this.cidade = new Cidade();
		this.data = new Date();
		
	}

	public TipoIncidente getTipo() {
		return tipo;
	}

	public void setTipo(TipoIncidente tipo) {
		this.tipo = tipo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
