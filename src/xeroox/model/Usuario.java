package xeroox.model;

public abstract class Usuario {
	private String nome;
	private String sobrenome;
		
	public Usuario(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String nomeCompleto() {
		return nome + " " + sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
