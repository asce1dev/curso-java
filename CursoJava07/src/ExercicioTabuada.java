import java.util.Scanner;

public class ExercicioTabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimir("TABUADA");
		Integer numero = receberMultiplicando("Digite um numero:", scanner);
		Integer[] tabuada = new Integer[] {0,1,2,3,4,5,6,7,8,9,10};
		
		iterarEImprimirTabuada (numero, tabuada);
		
		scanner.close();
	}
	
	static Integer receberMultiplicando (String texto,Scanner scanner) {
		imprimirNaMesmaLinha("Digite um numero qualquer: ");
		Integer numero = scanner.nextInt();
		return numero;
	}
	
	static void iterarEImprimirTabuada (Integer multiplicando, Integer[] multiplicador) {
		iterarEImprimirTabuada(multiplicando, multiplicador, 0);
	}
	
	static void iterarEImprimirTabuada (Integer multiplicando, Integer[] multiplicador, Integer i) {
		System.out.println(multiplicando + " X " + multiplicador[i] + " = " + (multiplicando * multiplicador[i]));
		
		if (++i < multiplicador.length) {
			iterarEImprimirTabuada(multiplicando, multiplicador, i);
		}
	}
	
	static void imprimir (String texto) {
		System.out.println(texto);
	}
	
	static void imprimirNaMesmaLinha (String texto) {
		System.out.print(texto);
	}
}
