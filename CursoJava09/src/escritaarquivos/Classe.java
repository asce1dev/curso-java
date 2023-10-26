package escritaarquivos;

import java.util.ArrayList;
import java.util.Scanner;

public class Classe {

	static void adicionarTarefas(ArrayList<String> lista,Scanner scanner) {
		int i = 0;
	
	
		while (true) {
		System.out.print("Atividade " + (i + 1) + ": ");
		String tarefas = scanner.nextLine();
		
		if("x".equalsIgnoreCase(tarefas)) {
			break;
		}
		
		lista.add(tarefas);
		i++;
		}	
	}
}
