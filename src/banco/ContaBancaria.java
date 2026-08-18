package banco;

public class ContaBancaria {
private int numeroConta;
private String titular;
private double saldo;

public ContaBancaria(int numeroConta , String titular , double saldo) {
	this.numeroConta = numeroConta;
	this.titular = titular;
	this.saldo = saldo;
}

public int getNumeroConta() {
	return numeroConta;
}

public void setNumeroConta(int numeroConta) {
	this.numeroConta = numeroConta;
}

public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public void sacar (double valor)throws SaqueMaiorException {
	if(valor > saldo) {
		throw new SaqueMaiorException("Saque maior que o valor na conta");
	}
	
	saldo -= valor;
}

public void deposito(double valor)throws DepositoInvalidoException{
	if(valor <= 0) {
		throw new DepositoInvalidoException("Depósito inválido , tente novamente!");
	}
	
	saldo += valor;
}
}
