package semana2;

import java.util.ArrayList;
import java.util.Scanner;



public class NotasAlunos {
	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
ArrayList<Double>notas = new ArrayList<>();

double soma = 0;


	for(int i = 0 ; i <=4  ; i++) {
		System.out.println("Digite a nota do " + (i + 1) +  " aluno: "  );
		double notaAluno = scanner.nextDouble();
		
		if(notaAluno >= 0 && notaAluno<= 10) {
		notas.add(notaAluno);
			
		
		}else {
			System.out.println("Nota errada! por favor digite novamente uma nota entre 0 a 10!");
			i--;
		}
	}
	
	System.out.println("Notas dos alunos");
		for(int i = 0 ; i < notas.size() ; i++) {
		System.out.println("Aluno " +( i + 1) + " : " + notas.get(i));
		soma += notas.get(i);
			
 	}
		double media = soma/notas.size();
		
		int acimaDaMedia = 0;
		for(int i = 0 ; i<notas.size(); i++) {
			if(notas.get(i) >= media) {
				acimaDaMedia++;
			}
		}
	
		System.out.println("\n=== ESTATÍSTICAS DA TURMA ===");
        System.out.println("Soma total das notas: " + soma);
        System.out.println("Média da turma: " + media);
        System.out.println("Quantidade de alunos acima da média: " + acimaDaMedia);
	
	
	
	
	
	
	
	


	scanner.close();	



}
}
