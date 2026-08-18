package contaBancaria;

public class TestaConta {
public static void main(String[] args) {
	ContaBancaria conta = new ContaBancaria();
	
	conta.setTitular("pedro");
	conta.depositar(100);
	conta.sacar(50);
	System.out.println(conta.getSaldo());
}
}
