package restaurante;

import java.util.ArrayList;

public class Pedido {
private int numeroMesa;
private ArrayList<ItemCardapio> itens;
private String status;

public Pedido(int numeroMesa) {
this.numeroMesa = numeroMesa;
this.itens = new ArrayList<>();
this.status = "em preparo";
}

public void adicionarItem(ItemCardapio item) {
	itens.add(item);
}

public double calcularTotal() {
	 double total = 0;
	 for(ItemCardapio item : itens) {
		 total += item.getPreco();
	 }
	 total = total * 1.10;
	 return total;
}

public void atualizarStatus(String novoStatus) {
	status = novoStatus;
}

public void exibirComanda() {
	
	System.out.println("=========COMANDA CONSUMO========");
	System.out.println("MESA :" + numeroMesa +  "| STATUS: " + status.toUpperCase());
	System.out.println("----------------------------------------");
    System.out.println("ITENS CONSUMIDOS:");
    for(ItemCardapio item : itens) {
	System.out.println("- " + item.getNome() + " : R$ " + item.getPreco());
    }
    System.out.println("----------------------------------------");
    System.out.printf("Total (com 10%% de taxa): R$ %.2f\n", calcularTotal());
    System.out.println("========================================\n");
   
	}
}






