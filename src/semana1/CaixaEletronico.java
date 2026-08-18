package semana1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CaixaEletronico {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean continuar = true;
	double saldo = 1000;
	
	
	while(continuar) {
		try {
	System.out.println("======== Caixa eletrônico =========");
	System.out.println("1 - consultar saldo");
	System.out.println("2 - realizar depósito ");
	System.out.println("3 - realizar saque");
	System.out.println("4 - sair");
	
	System.out.println("escolha uma opção: ");
	String opcao = scanner.nextLine();
	
	
	
	if(opcao.equals("4")) {
		System.out.println("Saindo do programa...");
		continuar = false;
	}
	else if (opcao.equals("1")) {
		System.out.println("Seu saldo é de R$ " + saldo);
	}else if(opcao.equals("2")){
		System.out.println("Qual o valor que deseja depositar? ");
		double deposito = scanner.nextDouble();
		scanner.nextLine();
		
		if (deposito <= 0 ) {
			System.out.println("Depósito não autorizado! O valor deve ser maior que zero.");
		}else {
		
		double depositar = saldo + deposito;
		System.out.println("deposito de R$ " + deposito + " realizado com sucesso! saldo atual de R$ " + depositar);
		saldo = depositar;
		}
	}else if(opcao.equals("3")) {
		System.out.println("Qual o valor que deseja sacar? ");
		double saque = scanner.nextDouble();
		scanner.nextLine();
		
		if (saque <= 0 || saque > saldo) {
			System.out.println("Transação não autorizada!");
		}else {
	
		double sacar = saldo - saque;
		System.out.println("Saque de R$ " + sacar + " realizado com sucesso!");
		saldo = sacar;
		}
	}else {
		System.out.println("Opção escolhida incorreta! tente novamente...");
	}
		}catch(InputMismatchException e)  {
			System.out.println("Erro! Digite apenas números.");
			scanner.nextLine();
			
		}
}
	scanner.close();
}
}