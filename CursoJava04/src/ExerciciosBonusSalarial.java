import java.util.Scanner;

public class ExerciciosBonusSalarial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//COLETA DE DAODS
		System.out.print("Digite a meta de faturamento anual: ");
		Double metaFaturamento = scanner.nextDouble();
		System.out.print("Digite o faturamento real da empresa: ");
		Double faturamentoReal = scanner.nextDouble();
		System.out.print("Digite a media salarial do funcionario: ");
		Double salarioFuncionario = scanner.nextDouble();
		//RESOLUCAO LOGICA DO PROBLEMA
		Boolean bonusDobro = faturamentoReal >= metaFaturamento;
		Double porcentagem = (metaFaturamento * 80) / 100;
		Boolean bonusOitenta = faturamentoReal >= porcentagem;
		//ESTRUTURA DE DECISAO
		if (bonusDobro) {
			System.out.println("Seu bonus sera de: " + salarioFuncionario);
			System.exit(0);
		} else if (bonusOitenta) {
			Double bonusSalario = (salarioFuncionario * 80) / 100;  
			System.out.println("Seu bonus sera de: " + bonusSalario);
		} else {
			System.out.println("Voce nao possui bonus a receber.");
		}
		scanner.close();
	}
}
