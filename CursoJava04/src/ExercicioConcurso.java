import java.util.Scanner;

public class ExercicioConcurso {
		//DECLARACAO DE CONSTANTES
		static final String MENSAGEM_APROVADO = "Parabens! voce foi aprovado.";
		static final String MENSAGEM_REPROVADO = "Que pena, voce foi reprovado.";
		static final String MENSAGEM_REPROVADO_PORTUGUES = "Que pena, voce foi reprovado, "
				+ "sua nota de portugues foi abaixo de 60";
		static final String MENSAGEM_REPROVADO_MATEMATICA = "Que pena, voce foi reprovado,"
				+ " sua nota de matematica foi abaixo de 60";
		static final Integer NOTA_MINIMA_PORTUGUES = 60;
		static final Integer NOTA_MINIMA_MATEMATICA = 60;
		static final Integer NOTA_MINIMA_TOTAL = 150;
		//MAIN
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//NOTA PORTUGUES
		System.out.print("Digite sua nota de portugues: ");
		Integer notaPortugues = scanner.nextInt();
		if (notaPortugues < NOTA_MINIMA_PORTUGUES) {
			System.out.println(MENSAGEM_REPROVADO_PORTUGUES);
			System.exit(0);
		}
		//NOTA MATEMATICA
		System.out.print("Digite sua nota de matematica: ");
		Integer notaMatematica = scanner.nextInt();
		if (notaMatematica < NOTA_MINIMA_MATEMATICA) {
			System.out.println(MENSAGEM_REPROVADO_MATEMATICA);
			System.exit(0);
		}
		//CALCULO DA NOTA
		Boolean aprovado = notaPortugues + notaMatematica >= NOTA_MINIMA_TOTAL;
		
		if (aprovado) {
			System.out.println(MENSAGEM_APROVADO);
		} else {
			System.out.println(MENSAGEM_REPROVADO);
		}
		scanner.close();
	}
}
