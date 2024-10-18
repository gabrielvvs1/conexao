package br.com.gabriel.conexao;

public class Main {

	public static void main(String[] args) {
		Conexao conexao1 = Conexao.getInstance();
		conexao1.acao();
		
		Conexao conexao2 = Conexao.getInstance();
		conexao2 = Conexao.getInstance();
		
		System.out.println(conexao1==conexao2);
	}

}
