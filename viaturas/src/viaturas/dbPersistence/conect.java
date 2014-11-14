package viaturas.dbPersistence;
import java.sql.ResultSet;
import java.sql.SQLException;

import viaturas.controller.Incidente;
import viaturas.dbPersistence.Dbadim;
public class conect {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	
	//descosiderar essa classe.
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Dbadim db = new Dbadim();
		Incidente a = new Incidente();
		Incidente b =  new Incidente();
		db.SQLite("/home/bruno/gdrive/ufmg/7Semestre/Engenharia de Software/tp/controle-de-viaturas/banco.db");
		
		//a.setNumero(6);
		//db.modificarIncididente(a);
		b = db.buscarIncidente(1);
		//System.out.println(b.toString() );
		//System.out.println(b.getNumero() + "   " + b.getBairro().toString());
		//db.mudarStatusViatura(3,3);
		//ResultSet res = db.buscarViaturasDisponiveis();
	
		//db.imprimirBusca(res);
	}

}
