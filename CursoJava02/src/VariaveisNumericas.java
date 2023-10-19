import java.util.Scanner;

public class VariaveisNumericas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calcular o quadrado de um numero");
		System.out.print("Digite um numero inteiro:" );
		Integer numero = scanner.nextInt();
		scanner.close();
		
		Integer quadrado = numero*numero;
		System.out.println("O quadrado de " + numero + " e igual a: " + quadrado);		
	}
}
