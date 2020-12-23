package xeroox.controller;

import java.util.ArrayList;

import xeroox.business.FuncionarioBusiness;
import xeroox.model.Funcionario;
import xeroox.utils.Hash;

public class FuncionarioController {

	private FuncionarioBusiness business = new FuncionarioBusiness();
	
	public Boolean adicionar(String nome, String sobrenome) {
		Funcionario funcionario = new Funcionario(Hash.gerarHash(), nome, sobrenome, 950.0, 3.0);
		return business.adicionar(funcionario);
	}

	public void atualizar(String id, String nome, String sobrenome) {
		Funcionario funcionario = new Funcionario(id, nome, sobrenome, 950.0, 3.0);
		
		business.atualizar(funcionario);
	}

	public Boolean deletar(String id) {
		return business.deletar(new Funcionario(id, "", "", 0, 0));
	}

	public void ImprimirTodos() {
		for(Funcionario funci : business.listarTodos()) {
			System.out.println("\n+--------------");
			System.out.println("| Id: " + funci.getId());
			System.out.println("| Nome: " + funci.getNome());
			System.out.println("| Sobrenome: " + funci.getSobrenome());
			System.out.println("| Salario: " + funci.getSalario());
			System.out.println("| Salario com comissão: " + funci.calcularSalarioComComissao());
			System.out.println("| Quantidade de vendas: " + funci.quantidadeVendas());
			System.out.println("\n+--------------");
		}
	}
	
}
