package loja;

public class TestaLoja {
public static void main(String[] args) {
	Eletronico eletronico = new Eletronico("Celular", 1200 , 12);
	System.out.println(eletronico.getNome());
	System.out.println(eletronico.getPreco());
	eletronico.aplicarDesconto();
	
	LivroProduto produto = new LivroProduto("Java", 200 , "joao marcelo");
	System.out.println(produto.getNome() +  "|"  + produto.getAutor() );
	
	produto.aplicarDesconto();
	
}
}
