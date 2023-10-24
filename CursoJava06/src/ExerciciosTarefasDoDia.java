import java.util.Scanner;

public class ExerciciosTarefasDoDia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		
		for (int i = 0; i < tarefas.length; i++) {
			System.out.print("Digite a tarefa numero " + (i+1) + " do seu dia: ");
			tarefas[i] = scanner.nextLine();
		}
		
		System.out.println("--------------------------");
		System.out.println("Tarefas do dia: ");
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println((i+1) + "- " + tarefas[i]);
		}

		
		scanner.close();
	}
}
