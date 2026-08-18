package contaBancaria;



public class ContaBancaria {
private String titular;
private double saldo;

public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public double getSaldo() {
	return saldo;
}

public void depositar(double deposito) {
	
	
	if (deposito <= 0) {
		System.out.println("Não é possivel depositar esse valor!");
	}else {
		saldo += deposito;
		System.out.println("Deposito de R$" + deposito + " realizado com sucesso!");
		
		
		
	}
	
}

public void sacar(double saque) {
	
	 
	if (saque <= 0 ) {
		System.out.println("Valor de saque inválido!");
	}
	if (saque > this.saldo) {
		System.out.println("Valor do saque maior que o que tem na conta!");
		
	}else {
		saldo -= saque;
		System.out.println("saque de R$" + saque + " realizado com sucesso!");
		
	}
	
}

}
