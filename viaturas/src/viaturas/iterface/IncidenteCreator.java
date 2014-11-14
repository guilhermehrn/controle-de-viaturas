package viaturas.iterface;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCreation;

import viaturas.controller.Bairro;
import viaturas.controller.Cidade;
import viaturas.controller.Endereco;
import viaturas.controller.Incidente;
import viaturas.controller.Logradouro;
import viaturas.controller.Regiao;
import viaturas.controller.TipoIncidente;
import viaturas.controller.Viatura;
import viaturas.dbPersistence.Dbadim;

/**
 * Classe responsavel por permiti ao usuario informa um novo incidente
 * @author guilherme
 *
 */
public class IncidenteCreator {
	private String banco="db/banco.db";
	
	
	public void inserirIncidente() throws ClassNotFoundException, SQLException{
		int tipo, num_rua, id;
		Date data = new Date();
		String rua, bairro, observ="", cidade, estado, regiao, comple;
		
		System.out.println("<<Registrar incidente>>\n");
		System.out.println("Digite o codigo do tipo de incidente a ser inserido\n");
		mostrarTiposIncidentes();
		@SuppressWarnings("resource")
		Scanner scanIn = new Scanner(System.in);
		tipo = Integer.parseInt(scanIn.nextLine());
		
		System.out.println("Digite a rua:");
		rua = scanIn.nextLine();
		
		System.out.println("Digite o numero do endereco:");
		num_rua = Integer.parseInt(scanIn.nextLine());
		
		System.out.println("Digite o complemento:");
		comple = scanIn.nextLine();
		
		System.out.println("Digite o bairro:");
		bairro = scanIn.nextLine();
		
		System.out.println("Digite a cidade:");
		cidade = scanIn.nextLine();
		
		System.out.println("Digite o estado:");
		estado = scanIn.nextLine();
		
		System.out.println("Digite a região:");
		regiao = scanIn.nextLine();
		
		id = pegarMaiorIDIncidente()+1;
		System.out.println(id);
		
		Incidente incid = new Incidente();
		incid = registrarIncidente(tipo, rua, num_rua, bairro, observ, cidade, estado, regiao, data, id, comple);
		
		salvarIncidente(incid, banco);
		
	}
	
	/**
	 * Aloca uma viatura para o incidente.
	 * @return :  retorna uma viatura para o caso. Se não tiver viaturas disponivel retorn uma viatura vazia
	 */
	public Viatura alocarViaturas(){
		Dbadim db = new Dbadim();
		ResultSet resultado = null;
		
		Viatura viatura;
		Viatura viatura2 = new Viatura();
		int numero;
		String renavam;
		String placa;
		int ano;
		String modelo;
		//int status;
		String fabricante;
		
		resultado = db.buscarViaturasDisponiveis();
		try {
			numero = resultado.getInt("numero");
			renavam =  resultado.getString("renavam");
			placa = resultado.getString("placa");
			ano = resultado.getInt("ano");
			modelo = resultado.getString("modelo");
			//status = resultado.getInt("status");
			fabricante = resultado.getString("fabricante");
			viatura = new Viatura(numero,renavam, placa, modelo,ano,fabricante,null,null);
			db.mudarStatusViatura(numero, 4);
			return viatura;
			
		} catch (SQLException e) {
			return viatura2;
		}
	}
	
	
	public void acionarServicosEmergencia(){
		System.out.println("Servicos de emergencia acionados");
	}
	
	public void mostrarTiposIncidentes () throws ClassNotFoundException, SQLException{
		String sql;
		Dbadim db = new Dbadim();
		ResultSet resultado = null;
		
		sql = "select * from tipo_incidente;";
		db.SQLite(banco);
		resultado = db.consultar(sql);
		db.imprimirBusca(resultado);
	}
	
	public int pegarMaiorIDIncidente () throws ClassNotFoundException, SQLException{
		String sql;
		Dbadim db = new Dbadim();
		ResultSet resultado = null;
		
		sql = "select max(numero) from incidente;";
		db.SQLite(banco);
		resultado = db.consultar(sql);
		return resultado.getInt(1);
		//db.imprimirBusca(resultado);
		
	}
	
	/**
	 * Cria um novo incidente a nivel de interface.
	 * @param tipo : tipo de incidente.
	 * @param rua : Rua onde ocorreu o incidente.
	 * @param num_rua : Numero do imoveu onde ocorreu o incidete
	 * @param bairro : bairro onde ocorreu o incidente.
	 * @param observ : o que foi obicesvado no incidente.
	 * @param cidade : Cidade onde ocorreu.
	 * @param regiao : região da cidade onde ocorreu o incidente.
	 * @param data :  data que ocorreu o incidente.
	 * @param id : Indentificado do incidente
	 * @param comple : tipo de imovel onde ocorreu o incidente
	 * @return retorna o novo incidente formado
	 */
	public Incidente registrarIncidente(int tipo, String rua, int num_rua, String bairro, String observ, String cidade,String estado, String regiao, Date data, int id, String comple){
		Incidente incid;
		Logradouro log = new Logradouro();
		Bairro bar = new Bairro();
		Cidade cid = new Cidade();
		Regiao reg = new Regiao();
		TipoIncidente tincid = new TipoIncidente();
		Endereco end;
		
		log.setDescricao(rua);
		bar.setDescricao(bairro);
		cid.setDescricao(cidade);
		cid.setUf(estado);
		reg.setDescricao(regiao);
		
		tincid.setId(tipo);
		end = new Endereco(log, num_rua, comple);
		
		incid = new Incidente(tincid,end,bar,reg,cid,null,id);
		
		
		return incid;
		
	}
	/**
	 * Salva um novo incidente criado.
	 * @param incid no incidendente a ser salvo.
	 * @param dbCaminho canho do banco no disco.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	void salvarIncidente(Incidente incid, String dbCaminho) throws ClassNotFoundException, SQLException{
		Dbadim db = new Dbadim();
		db.SQLite(dbCaminho);
		db.inserIncidente(incid);
	}
}
