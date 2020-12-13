package xeroox.model;

public class ItemVenda {
	private Papel papel;
	private int quantidade;
	
	public ItemVenda(Papel papel, int quantidade) {
		this.papel = papel;
		this.quantidade = quantidade;
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
	
}
