package semana2;


import java.util.Scanner;

public class AnalisadorDesempenho {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Digite o nome do aluno: ");
	String aluno = scanner.nextLine();
	
	
	
	double n1 = lerNotaValida(scanner, "Digite a primeira nota: ");
    double n2 = lerNotaValida(scanner, "Digite a segunda nota: ");
	double n3 = lerNotaValida(scanner, "Digite a terceira nota: ");
	
	imprimirBoletim(aluno,n1, n2, n3);
}	
	
public static double calcularMedia(double n1 , double n2 , double n3) {
	/*double somar = n1 + n2 + n3;
	double media = 0;
	for (int i = 1 ; i <= 3 ; i++ ) {
	 media = somar/ i;
	}
	return media;*/
	return (n1 + n2 + n3) / 3.0;
}

public static String verificarStatus(double media) {
	if(media >= 7) {
		return "Aprovado.";
	}else if(media >= 5 && media <= 6.9) {
		return "em Recuperação.";
	}else {
		return "Reprovado.";
	}
}

public static double acharMaiorNota(double n1 , double n2 , double n3) {
	double [ ] notas = {n1,n2,n3};
	
	double maiorNota = 0;
	
	for (double nota : notas) {
		if(nota > maiorNota) {
			maiorNota = nota;
		}
	}
	
	return maiorNota;
	
}

public static double lerNotaValida(Scanner scanner , String mensagem) {
	double nota;
	while(true) {
		System.out.println(mensagem);
		nota = scanner.nextDouble();
		
		if(nota >= 0.0 && nota <= 10.0) {
			return nota;
		}else {
			System.out.println("nota inválida! Digite um valor entre 0 e 10!");
		}
		
	}
	
	
}
public static void imprimirBoletim(String aluno,double n1, double n2, double n3) {
	

	double resultado = calcularMedia(n1,n2,n3);
	String resultadoMedia = verificarStatus(calcularMedia(n1,n2,n3));
	double maiorN = acharMaiorNota(n1,n2,n3);
	
	System.out.println("======== Analise de desempenho do " + aluno + " ======== ");
	System.out.println("A media do aluno foi: " + resultado);
	System.out.println("O aluno está " + resultadoMedia);
	System.out.println("A maior nota do aluno foi: " + maiorN);
}
}
