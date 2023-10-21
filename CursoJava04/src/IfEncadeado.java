import java.util.Scanner;

public class IfEncadeado {
	static final Integer PESO_LEVE = 60;
	static final Integer PESO_MEDIO = 90;
	static final Integer PESO_MINIMO = 1;
	static final Integer PESO_MAXIMO = 150;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		Double peso = scanner.nextDouble();
		
		Boolean pesoLeve = (peso <= PESO_LEVE) && (peso > PESO_MINIMO);
		Boolean pesoMedio = (peso > PESO_LEVE) && (peso <= PESO_MEDIO);
		Boolean pesoPesado = (peso > PESO_MEDIO) && (peso < PESO_MAXIMO);
		
		if (pesoLeve) {
			System.out.println("O lutador e peso leve.");
			System.exit(0);
		} else if (pesoMedio) {
			System.out.println("O lutador e peso medio");
			System.exit(0);
		} else if (pesoPesado) {
			System.out.println("O lutador e peso pesado.");
			System.exit(0);
		} else {
			System.out.println("O lutador nao se encaixa nas categorias.");
		}
		scanner.close();
	}
}
