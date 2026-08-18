package semana1;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Media {
public static void main(String[] args) {
	Scanner scanner =  new Scanner(System.in);
	boolean continuar = true;
	double soma = 0;
	int quantidade = 0;
	
	while(continuar ) {
		
		try {
		System.out.println("Digite a  nota: (ou digite -1 para sair) ");
		double nota = scanner.nextDouble();
		
		
	if(nota == -1) {
		System.out.println("Fechando o programa...");
		continuar = false;
	}else if(nota >= 0 && nota <= 10) {
		soma = soma + nota;
		quantidade++;
		
	}else {
		System.out.println("Nota inválida! Digite um número entre 0 e 10.");
	}
		
			
	}catch(InputMismatchException e){
		System.out.println("Erro! por favor digite apenas números!");
		scanner.nextLine();
		
	}
	}
	if (quantidade > 0 ) {
		double media = soma + quantidade;
		System.out.println("Foram inseridas " + quantidade + " notas.");
        System.out.println("A média das notas é: " + media);
    } else {
        System.out.println("Nenhuma nota válida foi inserida.");
    }
	
	
	scanner.close();
	
}
}
