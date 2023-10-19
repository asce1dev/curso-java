import java.util.Scanner;

public class VariaveisTexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Ola " + nome + "!");
		
		scanner.close();
		
		Character variavelChar = 'A';
		System.out.println(variavelChar);
	}
}
