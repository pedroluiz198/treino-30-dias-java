package cinema;

public class Ingresso {
private String nomeCliente;
private int fileira;
private int cadeira;
private double preco;


public Ingresso(String nomeCliente, int fileira, int cadeira, double preco) {
	this.nomeCliente = nomeCliente;
    this.fileira = fileira;
    this.cadeira = cadeira;
    this.preco = preco;
}
public String getNomeCliente() {
	return nomeCliente;
}

public int getFileira() {
	return fileira;
}

public int getCadeira() {
	return cadeira;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public void exibirIngresso() {
	System.out.println("=========INGRESSO IMPRESSO=========");
	System.out.println(nomeCliente);
	System.out.println("Fileira : " + fileira + "| Cadeira: " + cadeira);
	System.out.println("Valor: R$" + preco);
	
}


}
