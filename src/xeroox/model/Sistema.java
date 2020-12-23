package xeroox.model;
import java.util.ArrayList;
import java.util.Scanner;

import xeroox.model.interfaces.PontoVenda;
import xeroox.model.interfaces.Venda;

public class Sistema implements PontoVenda {
	private String nome;
	private ArrayList<Funcionario> funcionarios;
	private String cnpj;
	private Estoque estoque;
	private Historico historico;
	private Scanner input;
	
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
		try {
			
			/// Variavel para quando for false para de rodar o sistema
			Boolean loopMenu = true;
			input = new Scanner(System.in);
			
			// loop do menu
			while (loopMenu) {
				
				// Apresentação do menu
				System.out.print("+------------------------------------------+\n"
						       + "|                 MENU XEROOX              |\n"
						       + "+------------------------------------------+\n"
						       + "| 0. Sair                                  |\n"
						       + "| 1. Vender                                |\n"
						       + "| 2. Cadastrar produto no estoque          |\n"
						       + "| 3. Alterar Informações                   |\n"
						       + "|                                          |\n"
						       + "|                                          |\n"
						       + "|                                          |\n"
						       + "|                                          |\n"
						       + "|                                          |\n"
						       + "+------------------------------------------+\n");
				
				// Condição de parada
				Integer nome = input.nextInt();
				if (nome == 0) {
					loopMenu = false;
				}
			}
			
			return true;
		} catch (Exception ex) {
			return false;
		}
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
