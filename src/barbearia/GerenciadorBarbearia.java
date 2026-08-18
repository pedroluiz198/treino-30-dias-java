package barbearia;

import java.util.ArrayList;
import java.util.Scanner;



public class GerenciadorBarbearia {
public static void main(String[] args) {
	ArrayList<Agendamento> agendamentos = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	boolean continuar = true;
	
	while(continuar) {
		System.out.println("=== SISTEMA DE GESTÃO - BARBEARIA ===");
		System.out.println("1. Agendar Serviço");
		System.out.println("2. Listar Agendamentos");
		System.out.println("3. Calcular Faturamento Total");
		System.out.println("4. Sair");
		
		System.out.println("Escolha uma opção: ");
		int opcao = scanner.nextInt();
		scanner.nextLine();
		
		
		switch(opcao) {
		
			case 1:
				System.out.println("\n--- NOVO AGENDAMENTO ---");
			    
			    
			    System.out.print("Digite o nome do cliente: ");
			    String nomeCliente = scanner.nextLine();
			    
			    System.out.print("Digite o telefone do cliente: ");
			    String telefoneCliente = scanner.nextLine();
			    
			    
			    System.out.print("Digite o nome do serviço (ex: Corte, Barba): ");
			    String nomeServico = scanner.nextLine();
			    
			    System.out.print("Digite o valor do serviço: R$ ");
			    double precoServico = scanner.nextDouble();
			    scanner.nextLine(); 
			    
			    
			    System.out.print("Digite o horário (ex: 14:30): ");
			    String horario = scanner.nextLine();
			    
			    
			    Cliente cliente = new Cliente(nomeCliente, telefoneCliente);
			    Servico servico = new Servico(nomeServico, precoServico);
			    Agendamento agendamento = new Agendamento(cliente, servico, horario);
			    
			   
			    agendamentos.add(agendamento);
			    System.out.println("-> Agendamento realizado com sucesso!\n");
			    break;
			case 2:
				for(Agendamento a : agendamentos) {
					a.exibirAgendamento();
				}
				break;
			case 3: 
				double total = 0;
				for(Agendamento a : agendamentos) {
					total += a.getServico().getPreco();
				}
				System.out.println("Total: R$ " + total);
				break;
			case 4:
				System.out.println("saindo do programa... até logo");
				continuar = false;
				break;
				
		
		
		
		
		}
		
	}
	
	scanner.close();
}
}
