package semana1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class AnalisadorDeNumeros {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean continuar = true;
	int pares = 0;
	int impares = 0;
	int maior = 0;
	int menor = 0;
	boolean primeiroNumero = true;
	
	
	while(continuar) {
		try {
		System.out.println("digite o número: (ou digite 0 para sair!) ");
		int valor = scanner.nextInt();
		if(valor == 0) {
			System.out.println("Fechando o programa...");
			continuar = false;
		}else {
			if (valor % 2== 0  ) {
				System.out.println("numero par!");
				pares++;
			}else {
				System.out.println("numero ímpar");
				impares++;
		}
		
		if (primeiroNumero) {
			maior = valor;
			menor = valor;
			primeiroNumero = false;
			
		}else {
			
		if(valor>maior) {
			maior = valor;
		}
		if (valor < menor) {
			menor = valor;
		}
		}
		}
			
		
		
		
		
		}catch(InputMismatchException e) {
			System.out.println("ERRO! digite apenas números inteiros!");
			scanner.nextLine();
		}
		
	}
	if(!primeiroNumero) {
	System.out.println("foram digitados :" + pares + " números pares!");
	System.out.println("foram digitados :" + impares + " números ímpares!");
	System.out.println("numero maior : " + maior);
	System.out.println("Numero menor: " + menor);
	}else {
		System.out.println("Nenhum número digitado!");
	}
}
}
