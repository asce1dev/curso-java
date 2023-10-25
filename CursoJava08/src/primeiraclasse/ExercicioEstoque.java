package primeiraclasse;

public class ExercicioEstoque {

	String nome;
	
	Integer quantidadeEstoque;
	
	Integer quantidadeMinimaEstoque = 10;
	
	Boolean verificarQuantidadeEstoque() {
//		Boolean verificaEstoque = quantidadeEstoque >= 10;
		
		if(quantidadeEstoque <= quantidadeMinimaEstoque ) {
			System.out.println("Quantidade abaixo de 10 itens, voce deve repor o estoque!");
			return false;
		} else {
			System.out.println("Nao ha a necessidade de repor o estoque!");
			return true;
		}
	
	}
}