package viaturas.iterface;

import java.sql.ResultSet;
import java.sql.SQLException;

import viaturas.dbPersistence.Dbadim;

/**
 * Classe que possibilita o usuario informar o que relato do policial
 * @author guilherme
 *
 */
public class NewRelatarDados {
	private String banco;
	
	/**
	 * Mostra todos os incidentes no sistema.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void mostrarIncidetes () throws ClassNotFoundException, SQLException{
		String sql;
		Dbadim db = new Dbadim();
		ResultSet resultado = null;
		
		sql = "SELECT * FRON incidente";
		db.SQLite(banco);
		resultado = db.consultar(sql);
		db.imprimirBusca(resultado);
	}
	
	/**
	 * Relata os dado obitidos a partir do relatorio do policial responsavel pela ocorrecia.
	 * @param relato Relato do policial
	 * @param id Identificador do incidente a ser relatado.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void relatarDados(String relato, int id) throws ClassNotFoundException, SQLException{
		
		String sql;
		Dbadim db = new Dbadim();
		db.SQLite(banco);
		sql = "UPDATE incidente SET observacao = " + "'" + relato + "'" + "WHERE numero = " + id  ;
		db.modificaLinhabanco(sql);
		//System.out.println("<<Relatar dados dos incidentes>>");
	}
}
