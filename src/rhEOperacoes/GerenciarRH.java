package rhEOperacoes;

public class GerenciarRH {
public static void main(String[] args) {
	Funcionario funcionario1 = new Funcionario(1 , "pedro", "gerente", 2000);
	
	Clt clt = new Clt(1 , "pedro", "gerente", 2000, 6000);
	Clt clt2 = new Clt(3 , "carlos", "chefe", 5000, 10000);
	Estagiario estagio = new Estagiario(2 , "laila", "balconista", 600 , 200);
	
	
	clt.adicional();
	estagio.adicional();
	relatorio(clt,clt2,estagio);
	
	
	
}
public static double folhaPagamento(Funcionario... funcionarios) {
	double total = 0;
	for(Funcionario f : funcionarios) {
		total += f.adicional();
	}
	return total;
}

public static void relatorio(Funcionario ... funcionarios) {
	 System.out.println("===== RELATÓRIO DE PAGAMENTO =====");

	    for (Funcionario f : funcionarios) {
	        System.out.println(
	            "Id: " + f.getId() +
	            " - Nome: " + f.getNome()
	        );

	        System.out.printf(
	            "Cargo: %s - Pagamento: R$ %.2f%n", 
	            f.getCargo(), f.adicional()
	        );

	        System.out.println("-----------------------------------");
	    }

	    System.out.println("===== FOLHA DE PAGAMENTO =====");
	    System.out.printf(
	        "Valor total: R$ %.2f%n ", 
	        folhaPagamento(funcionarios)
	    );
	}
}


