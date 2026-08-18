package restaurante;

public class GerenciadorRestaurante {
public static void main(String[] args) {
	ItemCardapio item1 = new ItemCardapio("Hamburguer Artesanal", 35.00);
	ItemCardapio item2 = new ItemCardapio("batata frita", 18.00);
	ItemCardapio item3 = new ItemCardapio("Refrigerante lata", 7.00);
	
	Pedido pedido = new Pedido(5);
	
	pedido.adicionarItem(item1);
	pedido.adicionarItem(item2);
	pedido.adicionarItem(item3);
	
	pedido.exibirComanda();
	
	System.out.println("-> Cliente realizando pagamento...");
	pedido.atualizarStatus("PAGO");
	pedido.exibirComanda();
}
}
