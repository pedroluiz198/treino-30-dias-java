package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GerenciadorArquivos {

	public void salvar(Anotacao a) {
		System.out.println(new java.io.File("dados.txt").getAbsolutePath());
		
		try (BufferedWriter arquivo = new BufferedWriter (new FileWriter("dados.txt",true))){
			String linha = a.getId() + ";" + a.getTitulo() + ";" + a.getConteudo();
			arquivo.write(linha);
			arquivo.newLine();
			System.out.println("Anotação ID " + a.getId() + " salva com sucesso");
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void lerTodas() {
		System.out.println("===========HISTÓRICO DE ANOTAÇÕES============");
		try(BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))){
			String linha;
			while((linha = reader.readLine()) != null) {
				String[] dados = linha.split(";");
				System.out.println("ID: " + dados[0] + " | Título: " + dados[1]);
                System.out.println("Conteúdo: " + dados[2]);
                System.out.println("--------------------------------------------");
			}
		}catch(IOException e) {
			System.out.println("Erro ao ler o arquivo (ou arquivo ainda não existe): " + e.getMessage());
		}
	}
}
