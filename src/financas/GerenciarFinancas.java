package financas;
/*
 * registrar despesa (credito ,debito ou pix ,valor)
 * registrar receita(credito , debito ou pix)
 * controle do tipo do gasto ou da receita ( alimentação, automotivo, casa, outros...)
 * Usuario ( nome , cpf) - feito
  * tipo do gasto 
 */
public class GerenciarFinancas {
public static void main(String[] args) {
	Usuario item1 = new Usuario ("Pedro Luiz", "062.547.061-30");
	
	Controle controle = new Controle("alimentacao" , 200);
	controle.adicionarReceita(item1);
	controle.exibirDados();
}
}
