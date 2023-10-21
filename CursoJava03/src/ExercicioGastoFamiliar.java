import java.util.Scanner;

public class ExercicioGastoFamiliar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double totalMes = 0.0;
		
		System.out.println("Digite o valor da conta de luz: ");
		totalMes += scanner.nextDouble();
		System.out.println("Digite o valor da conta de agua: ");
		totalMes += scanner.nextDouble();
		System.out.println("Digite o valor da conta de telefone: ");
		totalMes += scanner.nextDouble();
		System.out.println("Digite o valor da mensalidade da escola: ");
		totalMes += scanner.nextDouble();
		System.out.println("Digite o valor da fatura do cartao: ");
		totalMes += scanner.nextDouble();
		System.out.println("Digite o valor gasto com supermercado: ");
		totalMes += scanner.nextDouble();
		
		System.out.println("O gasto total do mes foi de: " + totalMes);
		
		
		scanner.close();
	}
}
