package xeroox.model;

import java.util.ArrayList;

public class Historico {
	private ArrayList<Venda> vendas = new ArrayList<Venda>();
	
	public Historico() {
		
	}
	
	public Historico(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}

	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}
}
