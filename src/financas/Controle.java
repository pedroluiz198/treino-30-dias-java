package financas;

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
private double valor;
private String status;
private String tipo;

private ArrayList<Usuario>transacao;

Scanner scanner = new Scanner(System.in);

public Controle(String tipo , double valor) {
	this.status = "receita";
	this.tipo = tipo;
	this.valor = valor; 
	this.transacao = new ArrayList<>();
}


public void adicionarReceita(Usuario item) {
	transacao.add(item);
	
}
public double calcularReceita() {
	double total = 0;
		total += valor;
		
		return total;
	
}

public double calcularDespesa() {
	double totalDespesa = 0;
	if (valor == 0) {
		System.out.println("valor não válido para operação!");
	}
	
	totalDespesa -= valor;
	return totalDespesa;
}


public void exibirDados() {
	
	System.out.println("Escolha a opção: receita ou despesa");
	String opcao = scanner.nextLine();
	
	if (opcao.equalsIgnoreCase("receita")) {
	for(Usuario item : transacao) {
		System.out.println("nome : "  + item.getNome());
		System.out.println("Cpf : " + item.getCpf());
	}
	System.out.println("total receita: " + calcularReceita());
	System.out.println("tipo da receita: " + tipo);
		}
	if(opcao.equalsIgnoreCase("despesa")) {
		for(Usuario item : transacao) {
			System.out.println("nome : "  + item.getNome());
			System.out.println("Cpf : " + item.getCpf());
		}
		System.out.println("total despesa: " + calcularDespesa());
		System.out.println("tipo da despesa: " + tipo);
		
	}
	
}



}
