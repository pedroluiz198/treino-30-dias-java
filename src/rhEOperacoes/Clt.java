package rhEOperacoes;

public class Clt extends Funcionario {
private double bonus;

public Clt( int id, String nome,String cargo, double salario, double bonus ) {
	super(id,nome,cargo,salario);
	this.bonus = bonus;
}

@Override
public double adicional() {
	double bonusAnual = bonus / 12;
	double valorTotal = getSalario() + bonusAnual;
	return valorTotal;
}
}
