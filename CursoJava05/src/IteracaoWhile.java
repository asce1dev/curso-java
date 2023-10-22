
public class IteracaoWhile {

	static final Integer divisor = 3;
	
	public static void main(String[] args) {
	
		Integer[] numeros = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1,17,18,19,20};
		
		int i = 0;
		
		while (i < numeros.length) {
			if (numeros[i] % divisor == 0) {
				System.out.println("O numero " + numeros[i] + " e divisivel por 3");
			}
			i++;
		}
	}
}
