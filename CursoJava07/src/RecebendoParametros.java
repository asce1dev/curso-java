import java.util.Scanner;

public class RecebendoParametros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		imprimir("Escolha dentre os cursos abaixo: ");

		iterarEExibirPosicoesDoVetorString(cursos);

		imprimirNaMesmaLinha("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", scanner);

		validarCondicao(cursos, posicaoCursoEscolhido);

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cartão", "Boleto" };

		imprimir("Escolha dentre as formas de pagamento abaixo: ");

		iterarEExibirPosicoesDoVetorString(formasPagamento);

		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", scanner);

		validarCondicao(formasPagamento, posicaoFormaPagamentoEscolhida);

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();

		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

		scanner.close();
	}
	
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimirNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		return numero;
	}

	static void imprimirNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

	static void imprimir(String texto) {
		System.out.println(texto);
	}

	static void validarCondicao(String[] lista, Integer posicaoEscolhida) {
		Boolean posicaoValida = posicaoEscolhida >= 0 && posicaoEscolhida < lista.length;
		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
	}

	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			imprimir("[" + i + "] " + vetor[i]);
		}
	}

	static void imprimirTraco() {
		imprimir("----------------------------------------------");
	}

	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}
}