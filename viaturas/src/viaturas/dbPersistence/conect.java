package viaturas.dbPersistence;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import viaturas.controller.Incidente;
import viaturas.dbPersistence.Dbadim;
public class conect {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws ParseException 
	 */
	
	//descosiderar essa classe.
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException{
		Dbadim db = new Dbadim();
		Incidente a = new Incidente();
		Incidente b =  new Incidente();
		db.SQLite(args[0]);
		//System.out.println(args[0]);
		//a.setNumero(6);
		//db.modificarIncididente(a);
		b = db.buscarIncidente(1);
		//System.out.println(b.toString() );
		//System.out.println(b.getNumero() + "   " + b.getBairro().toString());
		//db.mudarStatusViatura(3,3);
		//ResultSet res = db.buscarViaturasDisponiveis();
	//System.out.println(b.getData());
		//db.imprimirBusca(res);
	}

}
