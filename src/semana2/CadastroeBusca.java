package semana2;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroeBusca {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	ArrayList<String>cadastro  = new ArrayList<>();
	boolean encontrado = false;
	
	
	for(int i = 0 ; i < 5 ; i++) {
		System.out.println("Digite o nome do " + (i + 1) + " cliente");
		String cliente = scanner.nextLine();
		cadastro.add(cliente);
		
	}
	
	System.out.println("Digite um nome para buscar: ");
	String buscaCliente = scanner.nextLine();
	for(String c : cadastro) {
			
		
		if( c.equalsIgnoreCase(buscaCliente)) {
			encontrado = true;
			break;
		}	
	}
	
	if(encontrado) {
		System.out.println("Cliente cadastrado no sistema!");
	}else {
		System.out.println("Cliente não localizado!");
	}
		
scanner.close();	
	
}
}
