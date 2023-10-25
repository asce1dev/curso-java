package primeiraclasse;

import java.util.Scanner;

public class ExercicioEstoque2 {

	public static void main(String[] args) {
		//DECLARACAO DE FUNCOES
		Scanner scanner = new Scanner (System.in);
		ExercicioEstoque produto = new ExercicioEstoque();
		//RECEBENDO INFORMACOES DO USUARIO
		produto.nome = receberNomeProduto("Digite o nome do produto: ", scanner);
		produto.quantidadeEstoque =	receberQuantidadeEmEstoque("Digite a quantidade em estoque: ", scanner);
		//RESOLUCAO DO EXERCICIO
		produto.verificarQuantidadeEstoque();
		
		scanner.close();
	}
	//MODULO IMPRIMIR
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	//MODULO IMPRIMIR NA MESMA LINHA
	static void imprimirNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
	//MODULO RECEBER QUANTIDADE EM ESTOQUE
	static Integer receberQuantidadeEmEstoque (String texto,Scanner scanner) {
		imprimirNaMesmaLinha(texto);
		Integer quantidadeEstoque = scanner.nextInt();
		return quantidadeEstoque;
	}
	//MODULO RECEBER NOME DO PRODUTO
	static String receberNomeProduto (String texto, Scanner scanner) {
		imprimirNaMesmaLinha(texto);
		String nome = scanner.next();
		return nome;
	}
}
