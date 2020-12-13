package xeroox.model;

import java.util.ArrayList;

public class Venda {
	private ArrayList<ItemVenda> itensPedidos;
	private Cliente cliente;
	private Funcionario funcionario;
	
	public Venda (ArrayList<ItemVenda> itensPedidos, Cliente cliente, Funcionario funcionario) {
		this.itensPedidos = itensPedidos;
		this.cliente = cliente;
		this.funcionario = funcionario;
	}

	public ArrayList<ItemVenda> getItensPedidos() {
		return itensPedidos;
	}

	public void setItensPedidos(ArrayList<ItemVenda> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
