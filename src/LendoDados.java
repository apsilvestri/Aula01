import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exibe mensagem na tela
		System.out.println("Programa Educado");
		System.out.println("Por favor digite o seu nome: ");
		
		// Define scanner para ler dados
		Scanner leitor = new Scanner(System.in);
		String nome;
		nome = leitor.next();
		
		// Exibe a mensagem Boa noite + nome que foi digitado 
		System.out.println("Boa noite, " + nome);
		leitor.close();
	}

}
