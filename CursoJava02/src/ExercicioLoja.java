import console.Interacao;

public class ExercicioLoja {

	public static void main(String[] args) {
		Interacao interacao = new Interacao();
		
		
		
		// leitura de dados 
		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");
		
		Integer quantidadeProduto = interacao.lerNumero("Digite quantas unidades do produto você deseja: ");
		// calculo do subtotal
		Double subtotal = valorProduto * quantidadeProduto;
		Boolean desconto = quantidadeProduto >= 10;
		Double valorDesconto = 0.0;
		// estrutura de decisao
		if (desconto) {
			valorDesconto = 10.00;
		}
		// calculo do desconto
		Double porcentagem = subtotal * valorDesconto / 100;
		Double valorTotal = subtotal - porcentagem;
		// impressao de informacoes
		interacao.imprimir("O valor total do seu produto  é de: " + valorTotal);
		
	}
}
