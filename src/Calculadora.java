import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa calculadora");
		Scanner leitor = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int soma;
		int subtracao;
		int multiplicacao;
		double divisao;
		
		System.out.println("Por favor, digite o primeiro numero");
		valor1 = leitor.nextInt();
		System.out.println("Por favor, digite o segundo número");
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;	
		divisao = valor1 / (double)valor2;
		
		System.out.println("O resultado da soma é: " + soma);
		System.out.println("O resultado da sub é:" + subtracao);
		System.out.println("O resultado da mult é:" + multiplicacao);
		System.out.println("O resultado da div é: " + divisao);
	
		leitor.close();
	}

}
