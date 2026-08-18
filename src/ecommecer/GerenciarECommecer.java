package ecommecer;

public class GerenciarECommecer {
public static void main(String[] args) {
	Produto item1 = new Produto("celular", "celular da motorola" , 1200);
	Produto item2 = new Produto("Nootebok", "Nootebok intel" , 2500);
	
	CarrinhoCompras compras = new CarrinhoCompras(15);
	
	compras.adicionarNoCarrinho(item1);
	
	compras.adicionarNoCarrinho(item2);
	compras.exibirfinalCompra();
	
}
}
