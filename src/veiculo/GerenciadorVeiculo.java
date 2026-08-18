package veiculo;

public class GerenciadorVeiculo {
public static void main(String[] args) {
	Veiculo veiculo = new Veiculo();
	veiculo.modelo = "Toyota";
	veiculo.marca = "corolla";
	veiculo.ano = 2006;
	
	Veiculo veiculo2 = new Veiculo();
	veiculo2.modelo = "civic";
	veiculo2.marca = "Honda";
	veiculo2.ano = 2010;
	
	veiculo.exibirDados();
	veiculo.buzinar();
	
	veiculo2.exibirDados();
	veiculo2.buzinar();
}
}
