package semana2;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleDeEstoque {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean continuar = true;
	
	ArrayList<String>produtoEstoque = new ArrayList<>();
	ArrayList<Integer>quantidadeEstoque = new ArrayList<>();
	
	while(continuar) {
		System.out.println("======= controle de estoque ==========");
		System.out.println("1 - Adicionar produto ");
		System.out.println("2 - listar estoque");
		System.out.println("3-  Atualizar quantidade");
		System.out.println("4- sair");
		
		System.out.println("Escolha uma opcao: ");
		int opcao = scanner.nextInt();		
		scanner.nextLine();
		
		switch(opcao) {
		case 1 :
			System.out.println("Digite o nome do produto: ");
			String produto = scanner.nextLine();
			
			System.out.println("Digite a quantidade: ");
			int quant = scanner.nextInt();
			scanner.nextLine();
			
			adicionarProduto(produtoEstoque ,quantidadeEstoque, produto , quant);
			System.out.println("Produto cadastrado com sucesso!");
			break;
			
		case 2: 
			
			listarEstoque( produtoEstoque ,  quantidadeEstoque); 
			break;
		
			
		case 3:
			
			System.out.println("Digite o nome do produto para buscar: ");
			String buscaNome = scanner.nextLine();
			
			System.out.println("Digite a nova quantidade a ser atualizada: ");
			int novaQuant = scanner.nextInt();
			scanner.nextLine();
			
			boolean atualizado = buscarEAtualizar(produtoEstoque, quantidadeEstoque, buscaNome, novaQuant);
			
			if(atualizado) { 
				System.out.println("-> Quantidade atualizada com sucesso!");
            } else {
                System.out.println("-> Produto não localizado no estoque.");
            }
            break;
            
        	
		case 4:
            System.out.println("Saindo do sistema... Até logo!");
            continuar = false;
            break;

        default:
            System.out.println("Opção inválida! Escolha de 1 a 4.");
            break;
			}
			
			
		}
		
	
	}
	

public static void adicionarProduto(ArrayList<String>prod , ArrayList<Integer> quant , String nome , int quantidade) {
	
	prod.add(nome);
	quant.add(quantidade);
	
}
public static void listarEstoque(ArrayList<String>prod , ArrayList<Integer> quant) {
	
	if(prod.isEmpty()) {
		System.out.println("Estoque vazio!");
	}else {
		System.out.println("==== itens no estoque ====");
		for(int i = 0; i< prod.size(); i++) {
			System.out.println((i + 1) + ". " + prod.get(i) + " - " + quant.get(i) + " unidades");
		}
	}
	
	
}

public static boolean buscarEAtualizar(ArrayList<String>prod , ArrayList<Integer> quant, String nome , int novaQuantidade) {
	for(int i = 0 ; i < prod.size(); i++ ) {
		if(prod.get(i).equalsIgnoreCase(nome)) {
			quant.set(i, novaQuantidade);
			return true;
}
		
	}
	return false;
	
}

}

