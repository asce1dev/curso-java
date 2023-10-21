
public class EstruturasDeDecisão {

	public static void main(String[] args) {
		Boolean movimentaPleoMenosMetadeDoValor = true;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		Boolean liberarEmprestimo = movimentaPleoMenosMetadeDoValor 
				&& aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
		
		if (liberarEmprestimo) {
			System.out.println("Sim! Pode liberar emprestimo.");
		}
	}
}
