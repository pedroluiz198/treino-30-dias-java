package cinema;

import java.util.Scanner;

public class GerenciarCinema {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean continuar = true;
	boolean[][] assentos = new boolean[4][4];
	
	while(continuar) {
		try {
		System.out.println("========  SISTEMA DE RESERVA DE CINEMA ==========");
		System.out.println("1. Exibir Mapa de Assentos");
		System.out.println("2. Reservar Ingresso");
		System.out.println("3. Sair");
		
		System.out.println("Escolha uma opção: ");
		int opcao = scanner.nextInt();
		scanner.nextLine();
		
		switch(opcao) {
		case 1:
			for (int i = 0; i < assentos.length; i++) {

			    for (int j = 0; j < assentos[i].length; j++) {

			        if (!assentos[i][j]) {
			            System.out.print("L - Livre | ");
			        } else {
			            System.out.print("X - Ocupado | ");
			        }
			    }

			    System.out.println();
			}
			break;
			
		case 2:
			System.out.println("Digite o seu nome: ");
			String nome = scanner.nextLine();
			
			if(nome.trim().isEmpty()) {
				System.out.println("Erro! Nome inválido.");
			}
			
			System.out.println("Digite o numero da fileira: 0 a 3");
			int fileira = scanner.nextInt();
			
			System.out.println("Digite o numero da cadeira: 0 a 3 ");
			int cadeira = scanner.nextInt();
			
			System.out.println("Digite o valor do ingresso: ");
			double valor = scanner.nextDouble();
			scanner.nextLine();
			
			
			
			if(assentos[fileira][cadeira] == false) {
				Ingresso ingresso = new Ingresso(nome, fileira, cadeira,valor);
				ingresso.exibirIngresso();
				assentos[fileira][cadeira] = true;
			}else {
				System.out.println("Assento já ocupado! , por favor escolher outro.");
			
			
			}
			break;
		case 3:
			System.out.println("Saindo do programa ... Até logo!");
			continuar = false;
			break;
			
		default :
			System.out.println("Opção inválida! Escolha de 1 a 3. \n");
		
			
			
		}
	}catch(java.lang.ArrayIndexOutOfBoundsException e){
		System.out.println("Você tentou acessar uma posição inexistente!");
		scanner.nextLine();
	}catch(java.util.InputMismatchException e) {
		System.out.println("Digite apenas números!");
		scanner.nextLine();
	}
	}

	scanner.close();
}
}
