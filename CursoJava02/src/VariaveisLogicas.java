import java.util.Scanner;

public class VariaveisLogicas {

	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;
		
		if (podeTirarCarteira) {
			System.out.println("Sim, esta apto a tirar carteira");
		}
		else {
			System.out.println("Nao esta apto a tirar carteira");
		}
		
		scanner.close();
	}
}
