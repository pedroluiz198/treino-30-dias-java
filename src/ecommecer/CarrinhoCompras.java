package ecommecer;

import java.util.ArrayList;
import java.util.Scanner;

public class CarrinhoCompras {
private double desconto;

private ArrayList<Produto>itens;
Scanner scanner  = new Scanner(System.in);

public CarrinhoCompras(double desconto ) {
	this.desconto = desconto;
	this.itens = new ArrayList<>();
}


public void adicionarNoCarrinho(Produto item) {
	itens.add(item);
}

public double calcularDesconto() {
	
	double total = 0;
	for(Produto p : itens) {
		total += p.getValor();
	}
		double totalDesconto = (total * desconto) / 100;
		total -= totalDesconto;
	
	return total;
}

public void exibirfinalCompra() {
	System.out.println("====== finalizar compra ===========");
	for(Produto p : itens) {
	System.out.println("Nome do produto : " + p.getNome());
	System.out.println("Descrição: " + p.getDescricao());
	System.out.println("Valor do produto: " + p.getValor());
	System.out.println("========================= ");
	}
	System.out.println("Desconto desse produto: " + desconto + "%");
	System.out.println("Valor atualizado: " + calcularDesconto());
	System.out.println("============================ ");
	
	System.out.println("Deseja finalizar a compra? s/n");
	String opcao = scanner.nextLine();
	
	if(opcao.equalsIgnoreCase("s")) {
		System.out.println("Compra finalizada com sucesso!");
	}else {
		System.out.println("Obrigado! volte sempre...");
	}
	


}
}
