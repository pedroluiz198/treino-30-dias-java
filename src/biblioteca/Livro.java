package biblioteca;



public class Livro {
private String titulo;
private int ano;
private Autor autor;


public Livro(String titulo , int ano , Autor autor) {
	this.titulo = titulo;
	this.ano = ano;
	this.autor = autor;
}

public void exibirdados() {
	System.out.println("Titulo do livro : " + titulo + " | ano :" + ano);
	System.out.println("Autor: " + autor.getNome());
	System.out.println("Nacionalidade " + autor.getNacionalidade());
	
}
}
