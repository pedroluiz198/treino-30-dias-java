package barbearia;

public class Agendamento {
private Cliente cliente;
private Servico servico;
private String horario;

public Agendamento(Cliente cliente , Servico servico , String horario) {
	this.cliente = cliente;
	this.servico = servico;
	this.horario = horario;
}

public void exibirAgendamento() {
	System.out.println("Agendamento da barbearia");
	System.out.println("Nome: " + cliente.getNome() + "|Telefone" + cliente.getTelefone());
	System.out.println("Servico: " + servico.getNomeServico() + "| Valor: R$ " + servico.getPreco());
	System.out.println("horario: " + horario);
	System.out.println("--------------------------------");
	
		
}	
public Servico getServico() {
    return servico;
}
}
