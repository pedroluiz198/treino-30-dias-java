package suporte;

public class Chamado {
private int id;
private String nome;
private String descricao;
private String prioridade;
private String status;

public Chamado(int id , String nome, String descricao , String prioridade) {
	this.id = id;
	this.nome = nome;
	this.descricao = descricao;
	this.prioridade = prioridade;
	this.status = "ABERTO";
	
	
}

public int getId() {
	return id;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public String getPrioridade() {
	return prioridade;
}

public void setPrioridade(String prioridade) {
	this.prioridade = prioridade;
}





}
