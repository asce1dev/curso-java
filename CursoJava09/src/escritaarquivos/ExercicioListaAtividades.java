package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioListaAtividades {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> lista = new ArrayList<String>();
		
		Classe.adicionarTarefas(lista, scanner);
		
		Path arquivo = Paths.get("C:\\Users\\Alan\\Desktop\\Lista de Atividades.txt");
		Files.write(arquivo, lista);
		
		
		scanner.close();
	}
}
