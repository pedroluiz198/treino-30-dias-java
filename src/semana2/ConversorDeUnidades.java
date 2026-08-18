package semana2;

import java.util.Scanner;


public class ConversorDeUnidades {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean continuar = true;
	
	while(continuar) {
		try {
		System.out.println("==========Conversor de unidades e validador==========");
		System.out.println("1 - Celcius para Fahrenheit");
		System.out.println("2 - Fahrenheit para Celcius");
		System.out.println("3 - Quilometros para Milhas");
		System.out.println("4 - sair");
		
		System.out.println("Escolha uma opção");
		int opcao = scanner.nextInt();
		
		if(!validarOperacao(opcao)) {
			System.out.println("Opção inválida! Escolha de 1 a 4");
		}else if(opcao == 4) {
			System.out.println("saindo do programa...Até logo");
			continuar = false;
		}else {
		switch(opcao) {
		
		case 1:
			System.out.println("Digite a temperatura em celcius: ");
			double c = scanner.nextDouble();
			
			System.out.println(celciusFahrenheit(c));
			break;
			
		case 2:
			System.out.println("Digite a temperatura em fahrenheit: ");
			double f = scanner.nextDouble();
			
			System.out.println(fahrenheitCelcius(f));
			break;
		case 3: 
			System.out.println("Digite a distancia em Quilometros: ");
			double d = scanner.nextDouble();
			
			System.out.printf("%.4f" ,quilometrosMilhas(d));
			System.out.println();
			break;
		}
	}
		}catch(java.util.InputMismatchException e) {
			System.out.println("Erro! Digite apenas números.");
			scanner.nextLine();
		}
	}
	
	scanner.close();
	
}

public static double celciusFahrenheit(double c) {
	
	return (c * 1.8) + 32;
}

public static double fahrenheitCelcius(double f) {
	return (f - 32) / 1.8;
}
public static double quilometrosMilhas(double d ) {
	return d / 1.609;
}
public static boolean validarOperacao(int opcao) {
	if (opcao >=1 && opcao <= 4) {
		return true;
	}else {
		return false;
	}
}
}
