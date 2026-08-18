package semana2;

import java.util.Scanner;

public class CalculadoraMetodos {
	
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean continuar = true;


while(continuar) {	
	try {
System.out.println("===== Calculadora ======");
System.out.println("1 - somar");
System.out.println("2 - subtrair");
System.out.println("3 - multiplicar");
System.out.println("4 - dividir");
System.out.println("5 - sair");

int opcao = scanner.nextInt();

if(opcao == 5) {
	System.out.println("Saindo do programa ... Até logo");
	continuar = false;
}else if ( opcao >=1 && opcao <=5) {
	System.out.println("Digite o primeiro número");
	double a = scanner.nextDouble();

	System.out.println("Digite o segundo número: ");
	double b = scanner.nextDouble();



switch(opcao) {
case 1:
	double resultado = somar(a,b);
	System.out.println("O resultado da soma é : " + resultado );
	break;
case 2:
	double resultadoSubtrair = subtrair(a,b);
	System.out.println("O resultado da subtração é: " + resultadoSubtrair);
	break;
	
case 3: 
	double resultadoMultiplicar = multiplicar(a,b);
	System.out.println("O resultado da multiplicação é: " + resultadoMultiplicar);
	break;
	
case 4: 
	double resultadoDividir = dividir(a,b);
	if(b != 0) {
	System.out.println("O resultado da divisão é : " + resultadoDividir);
	}
	break;
	
}
}else {
	System.out.println("Opção inválida! Escolha de 1 a 5.");
}



}catch(java.util.InputMismatchException e) {
	System.out.println("Erro digite apenas números!");
	scanner.nextLine();
}



}
}

public static double somar(double a , double b) {
	return a + b;
}

public static double subtrair(double a, double b) {
	return a - b;
}
public static double multiplicar(double a , double b) {
	return a * b;
}
public static double dividir(double a , double b) {
	if(b == 0) {
		System.out.println("ERRO! Não é possivel dividir por 0!");
		return 0;
	}
	return a / b;
}
}
