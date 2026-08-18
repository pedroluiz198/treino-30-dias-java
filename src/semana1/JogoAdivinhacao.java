package semana1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
public static void main(String[] args) {
	Random gerador = new Random();
	Scanner scanner = new Scanner(System.in);
	boolean continuar = true;
	int tentativas = 0;
	
	int numeroSecreto = gerador.nextInt(100) + 1;
	
	while(continuar) {
		try {
		System.out.println("Digite um numero para tentar adivinhar(1 a 100): ");
		int valor = scanner.nextInt();
		tentativas ++;
		
		if(valor < numeroSecreto) {
			System.out.println("Dica: Número menor que o Número secreto! tente novamente...");
			
		}else if(valor > numeroSecreto) {
			System.out.println("Dica : Número maior que o numero secreto! tente novamente...");
		
		}else {
			System.out.println("parabéns , você acertou o número secreto!" + numeroSecreto);
			continuar = false;
		}
		}catch(InputMismatchException e) {
			System.out.println("Erro! Por favor digite apenas números!");
			scanner.nextLine();
		}
		
	}
	System.out.println("Número de tentativas: " + tentativas);
	scanner.close();
	
	
	
	
}
}
