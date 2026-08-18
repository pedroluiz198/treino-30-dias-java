package rh;

public class TestaFuncionario {
public static void main(String[] args) {
	
Funcionario f1 = new Funcionario("pedro" , "professor" , 1900);
Funcionario f2 = new Funcionario("laila" , "coordenadora" , 2800);

 

f1.exibirFicha();
f1.aumentarSalario(5);

f2.exibirFicha();
f2.aumentarSalario(50);



	
	
	
	
	
}
}


