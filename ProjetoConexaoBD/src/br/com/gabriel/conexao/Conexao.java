package br.com.gabriel.conexao;

public class Conexao { //singletons
	
	private static Conexao conexao; // atributo estatico 
	
	private Conexao() {
	
		System.out.println("Banco conectado");
	}
	
	public static Conexao getInstance(){ // pega a instancia do banco -- conexao com o banco
		
		if (conexao == null) { // se o objetao nao existe ainda, vai ser criado
			
			conexao = new Conexao();
	}
	
		return conexao;
  }
  public void acao() {
	  System.out.println("Fazendo consulta");
  }

	
}
