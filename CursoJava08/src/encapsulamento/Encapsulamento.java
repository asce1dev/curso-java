package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		 
		cliente.setNome("Alan Delon");
		cliente.setTelefone("94981818181");
		
		System.out.println("Nome cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.primeiroNome);
		System.out.println("Ultimo nome: " + cliente.ultimoNome);
		System.out.println("Telefone: " + cliente.telefone);
		
	}
}
