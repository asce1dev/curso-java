package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ExercicioLeitura {

	public static void main(String[] args) throws IOException {
		
		
		List<String> linhas = lerArquivo("C:\\Users\\Alan\\Desktop\\Lista de Tarefas.txt");
		
		for (int i = 0; i < linhas.size(); i++) {
			String tarefas = linhas.get(i);
			
			System.out.println("Atividade " + (i+1) + ": " + tarefas);
		}
	}
	
	static List<String> lerArquivo(String arquivo) throws IOException {
		Path path = Paths.get(arquivo);
		return Files.readAllLines(path);
		
	}
	
}
