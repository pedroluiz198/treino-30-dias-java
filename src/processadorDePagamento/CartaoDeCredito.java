package processadorDePagamento;

public class CartaoDeCredito extends Pagamento {
	private String numeroCartao;
	private int parcelas;
	
	public CartaoDeCredito(double valor, String numeroCartao, int parcelas) {
		super(valor);
		this.numeroCartao = numeroCartao;
		this.parcelas = parcelas;
	}
	
	@Override
	public void processar() {
		System.out.println("O valor de " + valor + " foi aprovado para o cartão numero " + numeroCartao + " em " + parcelas + " parcelas");
	}

}
