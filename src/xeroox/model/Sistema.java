package xeroox.model;
import java.util.ArrayList;

import xeroox.model.interfaces.PontoVenda;
import xeroox.model.interfaces.Venda;

public class Sistema implements PontoVenda {
	private String nome;
	private ArrayList<Funcionario> funcionarios;
	private String cnpj;
	private Estoque estoque;
	private Historico historico;
	
	public Sistema(String nome, ArrayList<Funcionario> funcionarios, String cnpj, Estoque estoque, Historico historico) {
		this.nome = nome;
		this.funcionarios = funcionarios;
		this.cnpj = cnpj;
		this.estoque = estoque;
		this.historico = historico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios; 
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public Historico getHistorico() {
		return historico;
	}

	public void setHistorico(Historico historico) {
		this.historico = historico;
	}

	@Override
	public boolean abrirPDV() {
		return false;
	}

	@Override
	public boolean fecharPDV() {
		return false;
	}

	@Override
	public boolean vender(Venda venda) {
		return false;
	}

	@Override
	public void imprimirHistorico() {
	}

	@Override
	public boolean adicionarEstoque(ItemEstoque item) {
		return false;
	}

	@Override
	public boolean adicionarFuncionario(Funcionario funcionario) {
		return false;
	}
	
}
