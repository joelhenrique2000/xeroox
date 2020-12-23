package xeroox.model;

public class ItemEstoque {
	private String id;
	private Papel papel;
	private int quantidade;
	
	public ItemEstoque(String id, Papel papel, int quantidade) {
		this.papel = papel;
		this.quantidade = quantidade;
		this.id = id;
	}

	public Papel getPapel() {
		return papel;
	}

	public void setPapel(Papel papel) {
		this.papel = papel;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
