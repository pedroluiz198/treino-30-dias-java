package loja;

public  class Eletronico extends Produto {
private int garantiaMeses;

public Eletronico(String nome , double preco , int garantiaMeses) {
	super(nome,preco);
	this.garantiaMeses = garantiaMeses;
	
}

@Override
public void aplicarDesconto() {
	  double desconto = this.preco * 0.10;
	    this.preco = this.preco * 0.90;

	    System.out.println("Desconto de R$" + desconto 
	            + " aplicado. Novo preço: R$" + this.preco
	            + " com " + this.garantiaMeses + " meses de garantia!");
}

}
