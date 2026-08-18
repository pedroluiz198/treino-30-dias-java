package processadorDePagamento;

public class TestePagamento {
public static void main(String[] args) {
	
Pagamento p1  = new Pagamento(0);
Pix pix =  new Pix(10 , "123456");
pix.processar();

CartaoDeCredito cartao = new CartaoDeCredito(100 , "1022", 12);
cartao.processar();

	}
}
