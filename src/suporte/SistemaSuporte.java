package suporte;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaSuporte {
private ArrayList<Chamado>suporte;
Scanner scanner = new Scanner(System.in);

public SistemaSuporte() {
	this.suporte = new ArrayList<>();
}

public void adicionarChamado(Chamado chamados) {
	suporte.add(chamados);
}

public boolean atualizarStatusChamado(int id , String novoStaus) {
	for (Chamado c : suporte) {
		if(c.getId() == id) {
			c.setStatus(novoStaus);
			return true;
		}
	}
	return false;
}



public void RelatorioChamado(){
	System.out.println("\n ========== CHAMADOS ABERTOS ============");
	boolean encontrou = false;
	
	for (Chamado c : suporte) {
	if(c.getStatus().equalsIgnoreCase("Aberto")) {
		exibirChamado(c);
		encontrou = true;
	}
}
	if(!encontrou) {
		System.out.println("Nenhum chamado aberto");
	}
	System.out.println("===========================\n");
}

/*
public void resolverChamado() {
	System.out.println("Atualize o chamado : ABERTO / EM ANDAMENTO / FINALIZADO");
	String statusNovo = scanner.nextLine();
	
	for (Chamado c : suporte) {
	if(statusNovo.equalsIgnoreCase("ABERTO")) {
		
	
	}else if(statusNovo.equalsIgnoreCase("em andamento")) {
		c.setStatus("EM ANDAMENTO");
		
	}else if(statusNovo.equalsIgnoreCase("finalizado")) {
		c.setStatus("FINALIZADO");
	}else {
		System.out.println("Atualização incorreta. tente novamente...");
	}
	}
	}
*/

public void exibirChamado(Chamado c) {
	System.out.println("========CHAMADO SUPORTE TÉCNICO =========");
	
	
	System.out.println("ID: " + c.getId() + " | Funcionário: " + c.getNome());
    System.out.println("Descrição: " + c.getDescricao());
    System.out.println("Prioridade: " + c.getPrioridade() + " | Status: " + c.getStatus());
    System.out.println("--------------------------------------");

	
}
}
