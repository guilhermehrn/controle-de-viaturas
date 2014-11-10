package viaturas.iterface;



import java.sql.SQLException;
import java.util.Date;

import viaturas.controller.Bairro;
import viaturas.controller.Cidade;
import viaturas.controller.Endereco;
import viaturas.controller.Incidente;
import viaturas.controller.Logradouro;
import viaturas.controller.Regiao;
import viaturas.controller.TipoIncidente;
import viaturas.dbPersistence.Dbadim;

/**
 * Classe responsavel por permiti ao usuario informa um novo incidente
 * @author guilherme
 *
 */
public class NewIncidente {
	
	
	
	public void alocarViaturas(){
	//TODO	
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
