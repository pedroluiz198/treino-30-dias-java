package persistencia;

public class TestaPersistencia {
public static void main(String[] args) {
	Anotacao anotacao1 = new Anotacao(1 , "dormir", "dormir ate mais tarde");
	GerenciadorArquivos arquivos = new GerenciadorArquivos();
	
	arquivos.salvar(anotacao1);
	arquivos.lerTodas();
	
}
}
