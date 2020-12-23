package xeroox.controller;

import java.util.ArrayList;

import xeroox.business.FuncionarioBusiness;
import xeroox.business.VenderBusiness;
import xeroox.model.Cliente;
import xeroox.model.ItemEstoque;
import xeroox.model.ItemVenda;
import xeroox.model.Venda;
import xeroox.utils.Hash;
import xerrox.store.Store;

public class VendaController {
	private VenderBusiness business = new VenderBusiness();
	private FuncionarioBusiness funcionarioBusiness = new FuncionarioBusiness();
	
	public ArrayList<Venda> listarTodos() {
		return Store.sistema.getHistorico().getVendas();
	}
	
	public void ImprimirTodos() {
		for(Venda funci : business.listarTodos()) {
			System.out.println("\n+--------------");
			System.out.println("| Id do Cliente: " + funci.getCliente().getId());
			System.out.println("| Cpf do cliente: " + funci.getCliente().getCpf());
			System.out.println("| Nome do cliente: " + funci.getCliente().getNome());
			System.out.println("| Sobrenome do cliente: " + funci.getCliente().getSobrenome());
			
			System.out.println("| id do funcionario: " + funci.getFuncionario().getId());
			System.out.println("| Nome do funcionario: " + funci.getFuncionario().getNome());
			System.out.println("| Sobrenome do funcionario: " + funci.getFuncionario().getSobrenome());
			
			System.out.println("\n|PRODUTOS \n");
			
			double valoTotal = 0;
			
			for(ItemVenda fasunci : funci.getItensPedidos()) {
				
				System.out.println("| Id papel: " + fasunci.getPapel().getId());
				System.out.println("| Quantidade: " + fasunci.getQuantidade());
				System.out.println("| Papel: " + fasunci.getPapel().getCor() + ", " + fasunci.getPapel().getFormato() + ", " + fasunci.getPapel().getGramatura() + ", " + fasunci.getPapel().getTipo());
				System.out.println("| Preço: " + fasunci.getPapel().getValor());
				valoTotal += (fasunci.getPapel().getValor()) * fasunci.getQuantidade();
				System.out.println("| ");
			}
			
			System.out.println("\n|Valor total \n");
			System.out.println("| Valor total: " + valoTotal);
			System.out.println("\n+--------------");
		}
	}

	public void adicionar(ArrayList<ItemVenda> itensPedidos, String nome, String sobrenome, String cpf,
			String idFuncionario) {
		Venda venda = new Venda(itensPedidos, new Cliente(Hash.gerarHash(), nome, sobrenome, cpf), funcionarioBusiness.listarPorId(idFuncionario));
		
		Store.sistema.getHistorico().getVendas().add(venda);
		
	}
}
