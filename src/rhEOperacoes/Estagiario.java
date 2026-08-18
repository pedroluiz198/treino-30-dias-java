package rhEOperacoes;

public class Estagiario extends Funcionario {
private double auxilioTransporte;


public Estagiario(int id ,String nome, String cargo, double salario, double auxilioTransporte) {
	super(id,nome,cargo,salario);
	this.auxilioTransporte = auxilioTransporte;
}

@Override
public double adicional() {
	double novoAuxilio = getSalario() + auxilioTransporte;
	return novoAuxilio;
}

}
