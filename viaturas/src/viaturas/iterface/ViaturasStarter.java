package viaturas.iterface;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;


public class ViaturasStarter {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String op="0";
		
		while (true){
			System.out.println("<<Bem vindo ao controle de viaturas 1.0>>\n");
			System.out.println("Selecione a opção que você deseja:");
			System.out.println("(1)--> Registrar incidente");
			System.out.println("(2)--> Relatar dados do incidente");
			System.out.println("(3)--> Sair do programa");
			
			IncidenteCreator incidente = new IncidenteCreator();
			IncidenteReport relatar_dados = new IncidenteReport();
			
			@SuppressWarnings("resource")
			Scanner scanIn = new Scanner(System.in);
			op = scanIn.nextLine();
			
			if (op.equals("1")){
				incidente.inserirIncidente();
			}
			else if (op.equals("2")){
				relatar_dados.relatarDadosInterface();
			}
			else if (op.equals("3")){
				System.out.println("Programa finalizado");
				break;
			}
			else {
				System.out.println("Opção inválida");
			}
			
		}
		

	}

}
