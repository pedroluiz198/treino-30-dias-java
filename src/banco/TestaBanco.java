package banco;

public class TestaBanco {
public static void main(String[] args) {
	ContaBancaria conta1 = new ContaBancaria(1226 , "pedro", 10);
		
	try {
		conta1.deposito(10);
		System.out.println("deposito realizado com sucesso!");
	}catch(DepositoInvalidoException e) {
		System.out.println(e.getMessage());
	}
	try {
		conta1.sacar(25);
		System.out.println("saque realizado com sucesso!");
	}catch(SaqueMaiorException e) {
		System.out.println(e.getMessage());
	}
}
}
