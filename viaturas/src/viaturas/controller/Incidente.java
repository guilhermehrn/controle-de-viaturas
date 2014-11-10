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
	
	private ServicoEmergencia emergencia;
	
	private int numero;
	
	/**
	 * Retorna a viatura que foi direcioanda ao incidente
	 * @return : Obejo que representa a viatura.
	 */
	public Viatura getViaturaDirecionada() {
		return viaturaDirecionada;
	}
	
	/**
	 * Retorna a descrição da ocorrencia.
	 * @return : descrição da ocorrecia.
	 */
	public String getDescricaoOcorrencia() {
		return descricaoOcorrencia;
	}
	
	/**
	 * Muda a descrição da ocorrencia
	 * @param descricaoOcorrencia :  nova descrição
	 */
	public void setDescricaoOcorrencia(String descricaoOcorrencia) {
		this.descricaoOcorrencia = descricaoOcorrencia;
	}

	/**
	 * Muda a viatura a ser direcioanda para o local da ocorrencia. 
	 * @param viaturaDirecionada : Nova viatura a ser direcionada.
	 */
	public void setViaturaDirecionada(Viatura viaturaDirecionada) {
		this.viaturaDirecionada = viaturaDirecionada;
	}

	/**
	 * Retorna o policial responsavel pelo caso
	 * @return : novo o policial, o bijeto.
	 */
	public Policial getRelator() {
		return relator;
	}

	/**
	 *  Muda o policial responsavel pela ocorrecia
	 * @param relator : novo policial.
	 */
	public void setRelator(Policial relator) {
		this.relator = relator;
	}

	/**
	 * Retorna o relatorio do incidente
	 * @return : relatorio do incidente
	 */
	public String getRelatorioIncidente() {
		return relatorioIncidente;
	}

	/**
	 * Edita o relatorio do inicidente
	 * @param relatorioIncidente :  Novo relatorio do incidente.
	 */
	public void setRelatorioIncidente(String relatorioIncidente) {
		this.relatorioIncidente = relatorioIncidente;
	}

	/**
	 * Retona verdadeiro se o incidente foi solucionado. Falso caso contrario.
	 * @return : True/false
	 */
	public Boolean getSolucionado() {
		return solucionado;
	}

	/**
	 * Muda o estatus de solucionado ou não para o incidente.
	 * @param solucionado
	 */
	public void setSolucionado(Boolean solucionado) {
		this.solucionado = solucionado;
	}

	/**
	 * Cria um obijeto do tipo incidente com o : tipo, endenreco, bairro, redião, cidade, data de ocorrido e um ID.
	 * @param t o Tipo de incidente (assalto, afogamento e etc...)
	 * @param e Endereço do incidente
	 * @param b Bairro onde ocorreu o incidente.
	 * @param r Região onde ocorreu o incidente.
	 * @param c Cidade onde ocorreu o incidente.
	 * @param d Data do inicidente ocorrido.
	 * @param numero Identificador do incidente.
	 */
	public Incidente(TipoIncidente t, Endereco e, Bairro b, Regiao r, Cidade c, Date d, int numero) {
		this.tipo = t;
		this.endereco = e;
		this.bairro = b;
		this.regiao = r;
		this.cidade = c;
		this.data = d;
		this.numero = numero;
	}
	
	/**
	 * Cria um objento do tipo Inicidente construtor padrão.
	 */
	public Incidente() {
		this.tipo = new TipoIncidente();
		this.endereco = new Endereco();
		this.bairro = new Bairro();
		this.regiao = new Regiao();
		this.cidade = new Cidade();
		this.data = new Date();
		
	}

	/**
	 * Retorna o tipo do incidente
	 * @return tipo do inicidente.
	 */
	public TipoIncidente getTipo() {
		return tipo;
	}

	/**
	 * Modifica o tipo do incidente
	 * @param tipo novo tipo de incidente.
	 */
	public void setTipo(TipoIncidente tipo) {
		this.tipo = tipo;
	}

	/**
	 * Retorna o endereco do Incidente
	 * @return Ojeteo que representa o endereco.
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * Muda o edereco do incidente.
	 * @param endereco Novo endereço.
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**
	 * Retorna o bairro onde o incidente ocorreu.
	 * @return Objeto que representa o bairro.
	 */
	public Bairro getBairro() {
		return bairro;
	}

	/**
	 * Edita o bairro onde ocorreu o incidente.
	 * @param bairro novo bairro.
	 */
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	/**
	 * Retona a região onde ocorreu o incidente
	 * @return região do incidente
	 */
	public Regiao getRegiao() {
		return regiao;
	}

	/**
	 * Edita a região onde ocorreu o icidente.
	 * @param regiao : nova região.
	 */
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	/**
	 * Retorna a cidade onde ocorreu o incidente.
	 * @return Objeto representa a cidade do incidente. 
	 */
	public Cidade getCidade() {
		return cidade;
	}

	/**
	 * Edita a cidade onde ocorreu o incidente
	 * @param cidade nova cidade.
	 */
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	/**
	 * Retorna a data do incidente ocorrido
	 * @return data do incidente
	 */
	public Date getData() {
		return data;
	}

	/**
	 * Edita a data do incidente ocorrido.
	 * @param data : nova data.
	 */
	public void setData(Date data) {
		this.data = data;
	}
	
	/**
	 * Direciona uma viatura para um incidente
	 * @param v Viatura a ser direcionada
	 */
	public void direcionarViatura(Viatura v) {
		this.setViaturaDirecionada(v);
	}

	/**
	 * Rertorna uma serviço de emergecia.
	 * @return serviso de emergencia.
	 */
	public ServicoEmergencia getEmergencia() {
		return emergencia;
	}

	/**
	 * Aciona um dado servico de emergencia.
	 * @param emergencia serviso a ser acionado.
	 */
	public void acionarEmergencia(ServicoEmergencia emergencia) {
		this.emergencia = emergencia;
	}

	/**
	 * Retona o Identificador no Incidente.
	 * @return ID do incidente
	 */
	public int getNumero() {
		return this.numero;
	}
	
	/**
	 * Edita o identificador do incidente.
	 * @param numero novo ID do incidente.
	 */
	public void setNumero (int numero){
		this.numero = numero;
	}

}
