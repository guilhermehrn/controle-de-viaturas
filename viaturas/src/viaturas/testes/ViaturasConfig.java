package viaturas.testes;

//import java.lang.reflect.Array;
//import java.util.ArrayList;

import viaturas.controller.Bairro;
import viaturas.controller.Cidade;
import viaturas.controller.Regiao;

public class ViaturasConfig {
	
	private int totalRegioes;
	
	private int bairrosPorRegiao;
	
	private int ruasPorBairro;
	
	private Cidade cid;
	

	public int getBairrosPorRegiao() {
		return bairrosPorRegiao;
	}

	public void setBairrosPorRegiao(int bairrosPorRegiao) {
		this.bairrosPorRegiao = bairrosPorRegiao;
	}

	public int getRuasPorBairro() {
		return ruasPorBairro;
	}

	public void setRuasPorBairro(int ruasPorBairro) {
		this.ruasPorBairro = ruasPorBairro;
	}

	public Cidade getCid() {
		return cid;
	}

	public void setCid(Cidade cid) {
		this.cid = cid;
	}

	public int getTotalRegioes() {
		return totalRegioes;
	}

	public void setTotalRegioes(int totalRegioes) {
		this.totalRegioes = totalRegioes;
	}

	/**
	 * Cria cidades e regiões
	 */
	public Cidade criarCidadeRegioes() {
		cid = new Cidade(1, "Belo Horizonte", "MG");
		
//		Criando regiões
		cid.adicionarRegiao(1, "Norte");
		cid.adicionarRegiao(2, "Noroeste");
		cid.adicionarRegiao(3, "Sul");
		cid.adicionarRegiao(4, "Sudeste");
		cid.adicionarRegiao(5, "Central");
		
		this.totalRegioes = 5;
		
		return cid;
	}
	
	/**
	 * Cria bairros nas regiões
	 */
	public void criarBairros(Cidade cid) {
		this.bairrosPorRegiao = 2;
		this.ruasPorBairro = 4;
		Regiao r;
		Bairro b;
		
		for(int i = 0; i < this.totalRegioes; i++) {
			try {
				r = cid.localizarRegiao(i+1);
				
				for (int j = 0; j < this.bairrosPorRegiao; j++) {
					b = r.adicionarBairro(i+j, "Bairro " + (i+j));
					criarRuas(b, ruasPorBairro);
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Erro: índice" + i+1 + " não existe na lista de regiões");
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * Cria ruas no bairro b.
	 * @param b
	 * @param totalRuas
	 */
	public void criarRuas(Bairro b, int totalRuas) {
		for(int i = 0; i < this.bairrosPorRegiao * totalRegioes; i++) {
			b.adicionarLogradouro(totalRuas, "Rua", "Papa Joao " + (Math.random() % 24));
		}
	}
	
	/**
	 * Cria estrutura de endereços
	 */
	public void criarEndereços() {
		this.criarCidadeRegioes();
		this.criarBairros(cid);
	}
	
	
	public void criarPoliciais(){
		// TODO: criar policiais
		
	}
	
	public void criarViaturas() {
		// TODO: criar viaturas
	}
	
	

}
