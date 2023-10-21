import java.util.Scanner;

public class ExercicioSemana {
	//CONSTANTES	
	static final String SEGUNDA = "Segunda"; 
	static final String TERCA = "Terca"; 
	static final String QUARTA = "Quarta"; 
	static final String QUINTA = "Quinta"; 
	static final String SEXTA = "Sexta"; 
	static final String SABADO = "Sabado"; 
	static final String DOMINGO = "Domingo";  
	//MAIN
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//RECEBE DIA
		System.out.print("Digite um numero referente ao dia da semana: ");
		Integer numero = scanner.nextInt();
		String dia = "";
		
		switch (numero) {
		case 1: dia = DOMINGO;
			break;
		case 2: dia = SEGUNDA;
			break;
		case 3: dia = TERCA;
			break;
		case 4: dia = QUARTA;
			break;
		case 5: dia = QUINTA;
			break;
		case 6: dia = SEXTA;
			break;
		case 7: dia = SABADO;
			break;
		default: 
			System.err.println("Digite um mes valido !");
			System.exit(1);
		}
		
		System.out.println("Hoje e " + dia);
		scanner.close();
	}
}

