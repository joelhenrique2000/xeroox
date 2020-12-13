package xeroox.model;

import xeroox.model.interfaces.Comissao;
import xeroox.model.interfaces.Venda;

public class Funcionario extends Usuario implements Comissao, Venda {
	
	public Funcionario(String nome, String sobrenome, double salario, double comissao) {
		super(nome, sobrenome);
		this.salario = salario;
		this.comissao = comissao;
	}

	private double salario;
	private double comissao;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public int quantidadeVendas() {
		return 0;
	}
	
	
	@Override
	public double calcularSalarioComComissao() {
		return 0;
	}


}
