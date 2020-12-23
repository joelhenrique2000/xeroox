package xeroox.model;

public class Papel {
	private String id;
	private String tipo;
	private String formato;
	private String gramatura;
	private String cor;
	private double valor;
	
	public Papel (String id, String tipo, String formato, String gramatura, String cor, double valor) {
		this.id = id;
		this.tipo = tipo;
		this.formato = formato;
		this.gramatura = gramatura;
		this.cor = cor;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getGramatura() {
		return gramatura;
	}

	public void setGramatura(String gramatura) {
		this.gramatura = gramatura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
