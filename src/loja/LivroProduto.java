package loja;

public class LivroProduto extends Produto {
private String autor;
	
	public LivroProduto(String nome , double preco , String autor) {
		super(nome,preco);
		this.autor = autor;
	}
	
	@Override
	public void aplicarDesconto() {
		double desconto = this.preco * 0.20;
		this.preco = this.preco * 0.80;
		System.out.println("Desconto de R$" + desconto 
	            + " aplicado. Novo preço: R$" + this.preco + 
	             "| Autor :" + autor);
	}
	
	public String getAutor() {
		return autor;
	}
}
