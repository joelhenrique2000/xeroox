package xeroox.model;

import java.util.ArrayList;

public class Estoque {
	ArrayList<ItemEstoque> intensEstoque = new ArrayList<>();
	
	public Estoque() {
		
	}
	
	public Estoque(ArrayList<ItemEstoque> intensEstoque) {
		this.intensEstoque = intensEstoque;
	}

	public ArrayList<ItemEstoque> getItensEstoque() {
		return intensEstoque;
	}

	public void setItensEstoque(ArrayList<ItemEstoque> intensEstoque) {
		this.intensEstoque = intensEstoque;
	}
}
