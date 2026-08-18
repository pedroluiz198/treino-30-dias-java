package processadorDePagamento;

public class Pix extends Pagamento{
private String chavePix;

	public Pix(double valor, String chavePix) {
		super(valor);
		this.chavePix = chavePix;
	}
	
	@Override
	public void processar() {
		System.out.println("O valor de R$ " + valor + " foi enviado para a chave pix (" + chavePix + ")" );
	}
	
}
