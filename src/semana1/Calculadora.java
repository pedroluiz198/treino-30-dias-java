package semana1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean continuar = true;
	
	while(continuar) {
	
		try {
	
	System.out.println("Digite o valor pago ou (digite 0 para sair): ");
	int valor = scanner.nextInt();
	
	
	if(valor == 0) {
		System.out.println("Saindo do programa... Até mais!");
		continuar = false;
		
	}else if (valor > 100){
		int resultado = valor * 10 /100;
		int valorFinal = valor - resultado;
		System.out.println("O valor do desconto é: R$ " + resultado );
		System.out.println("O valor final a pagar : R$ " + valorFinal);
	}else {
		System.out.println("Valor abaixo de 100, não recebe desconto!");
	}
		
	}catch(InputMismatchException e ) {
		System.out.println("Erro: Por favor , digite apenas numeros inteiros!");
	scanner.nextLine();
}
}
	scanner.close();
}
}