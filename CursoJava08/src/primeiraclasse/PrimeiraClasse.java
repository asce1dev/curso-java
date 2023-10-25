package primeiraclasse;

public class PrimeiraClasse {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Smartphone";
		produto.precoUnitario = 500.0;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstoque(produto);
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		imprimir("Quantidade em estoque do produto: " + produto.nome + " e de: " + produto.quantidade + " unidade(s).");
	}
}
