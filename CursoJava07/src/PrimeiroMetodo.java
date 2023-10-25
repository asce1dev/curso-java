import java.util.Scanner;

public class PrimeiroMetodo {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  
		  imprimirTraco();
		  
		  String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avancado"};
		  
		  System.out.println("Escolha um dos cursos abaixo: ");
		  
		  for (int i = 0; i < cursos.length; i++) {
			  System.out.println("[" + i + "]" + cursos[i]);
		  }
		  
		  imprimirTraco();
		  System.out.print("O curso que voce deseja e o: ");
		  Integer posicaoCursoEscolhido = scanner.nextInt();
		  
		  Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length; 
			
		  if (!posicaoValida) {
			  finalizarPrograma();
		  }
		  		imprimirTraco();
		  
		  String[] formasPagamento = new String[] {"Cartao", "Boleto"};
		  
		  System.out.println("Formas de pagamento: ");
		  
		  for (int i = 0; i < formasPagamento.length; i++) {
			  System.out.println("[" + i + "]" + formasPagamento[i]);
		  }
		  
		  imprimirTraco();
		  System.out.print("Digite o numero referente a forma de pagamento: ");
		  Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		  
		  posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;
		  if (!posicaoValida) {
			  finalizarPrograma();
		  }
		  
		  String cursoEscolhido = cursos[posicaoCursoEscolhido];
		  String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		  
		  imprimirTraco();
		  
		  System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento e " + formaPagamentoEscolhida);
		  
		  scanner.close();
		  
	}
	static void imprimirTraco() {
		System.out.println("---------------------------------------------------");
	}
	static void finalizarPrograma() {
		  System.err.println("Posicao Invalida !");
		  System.exit(1);
	}
}
