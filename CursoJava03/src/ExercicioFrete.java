import java.util.Scanner;

public class ExercicioFrete {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//coleta de informacao
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		//calculo frete
		Double frete = 15.00;
		Boolean verificacao = valorProduto >= 100;
		
		if(!verificacao) {
			valorProduto += frete;
			System.out.println("O valor total da sua compra e de: " + valorProduto);
		} else {
			System.out.println("O valor total da sua compra e de: " + valorProduto);
		}
		scanner.close();
	}
}
