package xeroox.model;

public class Cliente extends Usuario {
	
	public Cliente(String nome, String sobrenome, String cpf, String telefone) {
		super(nome, sobrenome);
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	private String cpf;
	private String telefone;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
