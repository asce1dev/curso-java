package exercicio;

import java.util.Scanner;

public class ExercicioPedido {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		Pedido pedido = new Pedido();
		
		System.out.print("Digite o codigo do pedido: ");
		pedido.codigo = scanner.nextInt();
		
		System.out.print("Digite o valor do pedido: ");
		pedido.subTotal = scanner.nextDouble();
		
		if (pedido.descontoAplicavel()) {
			System.out.println("Desconto aplicado!");
		} else {
			System.out.print("Não há desconto.");
		}
		
		pedido.imprimirTotais();
		
		scanner.close();
		
	}
}
