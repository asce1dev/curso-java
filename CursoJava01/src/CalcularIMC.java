import java.util.Scanner;

public class CalcularIMC {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Calcule seu Indice de Massa Corporal");
			
			System.out.print("Digite o seu peso: ");
			Double peso = scanner.nextDouble();
			
			System.out.print("Digite a sua altura em metros: ");
			Double altura = scanner.nextDouble();
			
			scanner.close();
			
			Double imc = peso / (altura * altura);
			System.out.println("Seu imc e igual a: " + imc);		
		}
}
