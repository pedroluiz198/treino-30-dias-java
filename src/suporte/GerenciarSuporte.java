package suporte;


public class GerenciarSuporte {
public static void main(String[] args) {
	Chamado chamado1 = new Chamado(1,"Pedro Luiz" , "Suporte para impressora", "media" );
	Chamado chamado2 = new Chamado(2, "Laila oliveira", "suporte para notebool" , "baixa");
	SistemaSuporte suporte = new SistemaSuporte();
	
	suporte.adicionarChamado(chamado1);
	suporte.adicionarChamado(chamado2);
	
		
	suporte.RelatorioChamado();
	
	System.out.println("---- Atualizando o chamado ID 1 --------");
	suporte.atualizarStatusChamado(1, "EM ANDAMENTO");
	
	suporte.RelatorioChamado();
	
	
	
	
	
	
	
	
}
}
