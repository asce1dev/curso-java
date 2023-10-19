import java.util.Scanner;

public class VariavelVariando {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite 1 para pagamento a vista ou 2 para pagamento a prazo: ");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		// Decisao do programa
		if (!pagamentoAVista) {
			juros = 10.00;
		}
		// Calculo do acrescimo
		Double acrescimo = valorProduto * juros /100; 
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor Total: " + valorTotal);
		scanner.close();
	}
}
