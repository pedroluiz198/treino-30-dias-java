package semana2;

import java.util.ArrayList;
import java.util.Scanner;



public class GerenciadorTarefas {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	ArrayList<String>tarefas = new ArrayList <>();
	boolean continuar = true;
	
	
	
	while(continuar) {
		try {
			
		
		System.out.println("====== Gerenciador de tarefas =======");
		System.out.println("1 - Adicionar tarefa");
		System.out.println("2 - Listar tarefas");
		System.out.println("3 - Remover tarefa por nome");
		System.out.println("4 - sair");
		
		int opcao = Integer.parseInt(scanner.nextLine());
		
		switch(opcao) {
			case 1:					
			System.out.println("Digite uma tarefa para adicionar: ");
			String tarefa = scanner.nextLine();
			tarefas.add(tarefa);
			System.out.println("Tarefa adicionada com sucesso!");
			break;
			case 2:						
			System.out.println("======== Lista de Tarefas ==========");
			if(tarefas.isEmpty()) {
				System.out.println("Nenhuma tarefa encontrada no momento!");
			}else {
			for(int i = 0 ; i < tarefas.size(); i++) {
				
				System.out.println("Tarefa " + (i + 1) + " - " + tarefas.get(i));
				
			}
			}
			break;
			case 3: 
				
				System.out.println("Digite um nome de uma tarefa para remover: ");
				String removerTarefa = scanner.nextLine();
				boolean removido = tarefas.removeIf(t -> t.equalsIgnoreCase(removerTarefa));
				if(removido) {
					System.out.println("Tarefa removida - " + removerTarefa);
				}else {
					System.out.println("Tarefa não encontrada!");
				}
				break;
				
					
			case 4:
				System.out.println("Saindo do sistema... Até logo");
				continuar = false;
				
			default: 
				System.out.println("Opção inválida! digite um número de 1 a 4.");
				break;
			
			
			
		}
}catch(java.lang.NumberFormatException e) {
	System.out.println("Erro! Digite apenas número para acessar o menu!");
}
	}
}
}


