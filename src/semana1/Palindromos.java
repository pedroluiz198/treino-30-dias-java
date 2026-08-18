package semana1;

import java.util.Scanner;


public class Palindromos {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean continuar = true;
	
	
	while(continuar) {
	
		System.out.println("Digite o seu palindromo para conferencia: ");
		String palavra = scanner.nextLine();
		
		String textoInvertido = "";
		String novaPalavra = palavra.replace(" ", "").toLowerCase();
		
		for (int i = novaPalavra.length() - 1 ; i>= 0 ; i-- ) {
			textoInvertido += novaPalavra.charAt(i);
		}
			
			if ( textoInvertido.equals(novaPalavra)) {
				
				System.out.println("parabéns a palavra " + palavra + " é um palindromo ");
			}else {
				System.out.println("A palavra " + palavra + " não é um palindromo!");
			}
			
		
		
		System.out.println("Deseja continuar? (s/n) ");
		String resposta = scanner.nextLine();
		
		if (resposta.equalsIgnoreCase("N")) {
			System.out.println("Encerrando o verificador... Até mais!");
			continuar = false;
		}
		
		
			
	}
	scanner.close();
	
}
}
