package veiculo;



public class Veiculo {
String modelo;
String marca;
int ano;

public void exibirDados() {
	System.out.println("veiculo  " + marca + "| Modelo "  + modelo + "| ano: " + ano);
}

public void buzinar() {
	System.out.println("O " + modelo + " está buzinando.BIp Bip!");
}
}
