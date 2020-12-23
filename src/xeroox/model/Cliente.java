package xeroox.model;

public class Cliente extends Usuario {
	
	private String cpf;
	
	public Cliente(String id, String nome, String sobrenome, String cpf) {
		super(id, nome, sobrenome);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
