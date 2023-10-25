import java.util.Scanner;

public class ExercicioCalculadora2 {
	//DECLARACAO DE CONSTANTES
	private static final int ADICAO = 1;
	private static final int SUBTRACAO = 2;
	private static final int MULTIPLICACAO = 3;
	private static final int DIVISAO = 4;
	//MAIN
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//RECEBE OS NUMEROS
		Double numero1 = receberNumeroDoUsuario(scanner);
		Double numero2 = receberNumeroDoUsuario(scanner);
		
		imprimirTraco();
		//SELECIONA OPERACAO
		Integer operacao = selecioneOperacao(scanner);
		
		imprimirTraco();
		//REALZIA A OPERACAO ESCOLHIDA
		Double resultado = realizarOperacao(operacao, numero1, numero2);
		//IMPRIME O RESULTADO
		imprimir("O resultado da operacao e: " + resultado);
		
		scanner.close();
		//FIM DO MAIN
	}	
	//MODULO DA OPERACAO
	static Integer selecioneOperacao(Scanner scanner) {
		imprimir("Escolha a operacao: ");
		String[] operacoes = new String[] {"Adicao", "Subtracao", "Multiplicacao","Divisao"};
		
		for (int i = 0; i < operacoes.length; i++) {
			imprimir((i+1) + "- " + operacoes[i]);
		}
		return scanner.nextInt();
	}
	//MODULO TRACO
	static void imprimirTraco() {
		imprimir("---------------------------");
	}
	//MODULO DE RECEBER O NUMERO
	static Double receberNumeroDoUsuario (Scanner scanner) {
		imprimirNaMesmaLinha("Digite o valor: ");
		 return scanner.nextDouble();
	}
	//MODULO DE IMPRIMIR NA MESMA LINHA
	static void imprimirNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
	//MODULO DE IMPRIMIR COM QUEBRA DE LINHA
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	//MODULO DAS OPERACOES COM SWITCH
	static Double realizarOperacao(Integer operacao, Double numero1, Double numero2) {
		
		Double resultado = 0.0;
		switch (operacao) {
		case ADICAO: 
			resultado = numero1 + numero2;
			break;
		case SUBTRACAO: 
			resultado = numero1 - numero2;
			break;
		case MULTIPLICACAO: 
			resultado = numero1 * numero2;
			break;
		case DIVISAO: 
			resultado = numero1 / numero2;
			break;
		default: 
			System.err.println("Selecione uma operacao valida !");
			System.exit(1);			
		}
		return resultado;
	}
}
