import java.util.Scanner;

public class ExercicioAposentadoria {
	
	static final Integer IDADE_MINIMA = 55;
	static final Integer TEMPO_CONTRIBUICAO = 25;
	static final String MENSAGEM_APOSENTAR = "Parabens, voce pode se aposentar";
	static final String MENSAGEM_NAO_APOSENTAR = "Que pena, voce ainda nao pode se aposentar";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		Integer idade = scanner.nextInt();
		if (idade < IDADE_MINIMA) {
			System.out.println(MENSAGEM_NAO_APOSENTAR);
			System.exit(0);
		}
		System.out.println("Digite seu tempo de contribuicao: ");
		Integer tempoContribuicao = scanner.nextInt();
		if (tempoContribuicao < TEMPO_CONTRIBUICAO) {
			System.out.println(MENSAGEM_NAO_APOSENTAR);
			System.exit(0);
		}
		System.out.println(MENSAGEM_APOSENTAR);
		scanner.close();
	}
}
