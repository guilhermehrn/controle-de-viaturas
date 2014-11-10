package viaturas.iterface;

import java.io.IOException;
import java.util.Scanner;


public class NewViaturas {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String op="0";
		
		System.out.println("<<Bem vindo ao controle de viaturas 1.0>>\n");
		System.out.println("Selecione a opção que você deseja:");
		System.out.println("(1)--> Registrar incidente");
		System.out.println("(2)--> Relatar dados do incidente");
		
		NewIncidente incidente = new NewIncidente();
		NewRelatarDados relatar_dados = new NewRelatarDados();
		
		@SuppressWarnings("resource")
		Scanner scanIn = new Scanner(System.in);
		op = scanIn.nextLine();
		
		if (op.equals("1")){
			//incidente.registrarIncidente();
		}
		else if (op.equals("2")){
			//relatar_dados.relatarDados();
		}
		else {
			System.out.println("Opção inválida");
		}
		

	}

}
