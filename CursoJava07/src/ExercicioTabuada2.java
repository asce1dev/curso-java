import java.util.Scanner;

public class ExercicioTabuada2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimir("TABUADA");
		Integer numero = receberMultiplicandoDoUsuario("Digite um numero : ", scanner);
		
		imprimirTabuada(numero, 0);
		
		scanner.close();
	}

	static void imprimirTabuada (Integer multiplicando, Integer i) {
		Integer resultado = (multiplicando * i);
		imprimir(multiplicando + " X " + i + " = " + resultado);
		
		if (++i < 10) {
			imprimirTabuada(multiplicando, i);
		}
	}
	
	static Integer receberMultiplicandoDoUsuario(String texto, Scanner scanner) {
		imprimirNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		return numero;
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
}
