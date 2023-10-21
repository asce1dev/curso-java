import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//primeiro numero
		System.out.println("CALCULADORA");
		System.out.print("Digite um numero: ");
		Double primeiroNumero = scanner.nextDouble();
		//operacao
		System.out.print("Digite a operacao desejada: ");
		System.out.print("[1 para adicao]");
		System.out.print("[2 para subtracao]");
		System.out.print("[3 para multiplicacao]");
		System.out.print("[4 para divisao]");
		Double operacaoLogica = scanner.nextDouble();
		//segundo numero
		System.out.print("Digite o segundo numero: ");
		Double segundoNumero = scanner.nextDouble();
		//escolha da operacao
		Double resultado = 0.0;
		
		if (operacaoLogica == 1) {
			resultado = primeiroNumero + segundoNumero;
		} else if (operacaoLogica == 2) {
			resultado = primeiroNumero - segundoNumero;
		} else if (operacaoLogica == 3) {
			resultado = primeiroNumero * segundoNumero;
		} else if (operacaoLogica == 4) {
			resultado = primeiroNumero / segundoNumero;
		}
		
		System.out.println("O resultado e: " + resultado);
		scanner.close();
	}
}
