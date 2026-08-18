package rh;

public class Funcionario {
private String nome;
private String cargo;
private double salario;

public Funcionario (String nome, String cargo,double salario) {
	this.nome = nome;
	this.cargo = cargo;
	this.salario = salario;
}

public String getNome(){
	return nome;
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public double getSalario() {
	return salario;
}

public void aumentarSalario(double percentual) {
	double resultado = 0;
	resultado = (salario * percentual) / 100;
	this.salario = salario + resultado;
	System.out.println("Aumento de " + percentual + "% | " + "Salário atual: " + salario);
	
}

public void exibirFicha() {
	System.out.println("========== ficha do funcionário===========");
	System.out.println("Nome : " + nome );
	System.out.println("cargo: " + cargo);
	System.out.println("Salário: " + salario);
	
	
	
}

}

