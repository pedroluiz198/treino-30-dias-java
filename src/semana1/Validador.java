package semana1;

import java.util.Scanner;



public class Validador {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean continuar = true;
	boolean temMaiuscula = false;
	boolean temNumero = false;
	
	
	while(continuar) {
		temMaiuscula = false;
		temNumero = false;
		System.out.println("Digite uma senha forte: (com 8 caracteres) ");
		String senha = scanner.nextLine();
		 				
		for (int i = 0; i < senha.length(); i++) {
			char letra = senha.charAt(i);
			if(Character.isUpperCase(letra)  ) {
				temMaiuscula = true ;
			}
			
			if (Character.isDigit(letra)){
				temNumero = true;
			}
		}
		if (senha.length() >= 8 && temMaiuscula && temNumero) {
			System.out.println("Senha cadastrada com sucesso!");
			continuar = false;
		}else {
			System.out.println("Senha inválida, verifique os erros!");
			
			if (senha.length() < 8) {
				System.out.println("Senha precisa ter pelo menos 8 caracteres!");
			}
			
			if(!temMaiuscula) {
				System.out.println("Senha precisa ter pelo menos uma letra maiúscula!");
					}
			
			if (!temNumero) {
				System.out.println("Senha precisa ter pelo menos um número!");
			}
		}
		
		
		
		
	}
	
	scanner.close();
}
}
