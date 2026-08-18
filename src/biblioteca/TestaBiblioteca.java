package biblioteca;

public class TestaBiblioteca {
public static void main(String[] args) {
	Autor a1 = new Autor("machado de assis" , "brasileiro");
	
	Livro l1 = new Livro("Brincando com bola" , 2010 , a1);
	l1.exibirdados();
}
}
