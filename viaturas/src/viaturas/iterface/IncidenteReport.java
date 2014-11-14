package viaturas.iterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import viaturas.dbPersistence.Dbadim;

/**
 * Classe que possibilita o usuario informar o que relato do policial
 * @author guilherme
 *
 */
public class IncidenteReport {
	private String banco="/home/bruno/gdrive/ufmg/7Semestre/Engenharia de Software/tp/controle-de-viaturas/banco.db";
	
	public void relatarDadosInterface() throws ClassNotFoundException, SQLException{
		String op="", relato="";
		int id=0;
		System.out.println("<<Digite o número correspondente ao incidente que deseja relatar>>");
		mostrarIncidetes();
		
		@SuppressWarnings("resource")
		Scanner scanIn = new Scanner(System.in);
		op = scanIn.nextLine();
		id = Integer.parseInt(op);
		
		System.out.println("Digite o relato do incidente:");
		relato = scanIn.nextLine();
		
		relatarDados(relato, id);
	}
	
	/**
	 * Mostra todos os incidentes no sistema.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void mostrarIncidetes () throws ClassNotFoundException, SQLException{
		String sql;
		Dbadim db = new Dbadim();
		ResultSet resultado = null;
		
		sql = "SELECT * FROM incidente;";
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
