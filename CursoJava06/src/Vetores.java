import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		String [] cardapio = new String[] {"Calabresa", "Frango Catupiry", "Bacon", "Quatro queijos"};
		
		System.out.println("Cardapior Pizzaria da Andreia: ");
		System.out.println(" ");
		for(int i = 0; i < cardapio.length; i++) {
			System.out.println(i + " " + cardapio[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" ");
		
		System.out.print("Digite o numero referente ao sabor desejado: ");
		Integer saborEscolhido = scanner.nextInt();
		
		System.out.println("O sabor escolhido foi: " + cardapio[saborEscolhido]);
		
		scanner.close();
	}
}
