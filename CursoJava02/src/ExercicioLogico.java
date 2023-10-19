import java.util.Scanner;

public class ExercicioLogico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final Integer notaMinima = 70;
		
		// Coleta de dados
		System.out.print("Digite a sua nota: ");
		Integer nota = scanner.nextInt();
		Boolean resultado = nota >= notaMinima;
		scanner.close();
		// Resolução do problema
		if (resultado) {
			System.out.println("Parabéns você foi aprovado !!");
		} else {
			System.out.println("Que pena! Você reprovou, estude mais da próxima vez.");
		}
	}
}
