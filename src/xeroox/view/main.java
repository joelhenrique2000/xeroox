package xeroox.view;

import java.util.ArrayList;

import xeroox.business.EstoqueBusiness;
import xeroox.controller.EstoqueController;
import xeroox.controller.FuncionarioController;
import xeroox.controller.VendaController;
import xeroox.enums.CorPapel;
import xeroox.enums.FormatoPapel;
import xeroox.enums.GramaturaPapel;
import xeroox.enums.TipoPapel;
import xeroox.model.Cliente;
import xeroox.model.ItemEstoque;
import xeroox.model.ItemVenda;
import xeroox.model.Papel;
import xeroox.model.Venda;
import xeroox.utils.Hash;
import xeroox.utils.Input;
import xerrox.store.Store;

public class main {
	public static void main(String[] args) {

		// Única Fonte de Verdade (Single Source of Truth) similar ao Store da arquitetura Flux, com exceção do estado de imutabilidade.
		// Usei ela para facilitar o acesso do arraylist sem precisar passar ele pelos metodos
		Store.getInstance("Xeroox", "215341351");
		
		FuncionarioController funcionarioController = new FuncionarioController();
		EstoqueController estoqueController = new EstoqueController();
		VendaController vendaController = new VendaController();


		while(true) {
			
			
			System.out.println("\n\n+-------------------------------------------+");
			System.out.println(    "|  0. Sair                                  |");
			System.out.println(    "|  1. Cadastrar funcionário                 |");
			System.out.println(    "|  2. Editar funcionário                    |");
			System.out.println(    "|  3. Deletar funcionário                   |");
			System.out.println(    "|  4. Listar funcionário                    |");
			System.out.println(    "|  5. Cadastrar papel no estoque            |");
			System.out.println(    "|  6. Editar papel no estoque               |");
			System.out.println(    "|  7. Deletar papel no estoque              |");
			System.out.println(    "|  8. Listar papel no estoque               |");
			System.out.println(    "|  9. Vender                                |");
			System.out.println(    "| 10. Ver histórico                         |");
			System.out.println(    "+-------------------------------------------|\n\n");

			
			int opcao = Input.perguntarInt("\nDigite sua opção: ");
			
			if (1 == opcao) {
				String nome = Input.perguntarString("Digite seu nome: ");
				String sobrenome = Input.perguntarString("Digite seu sobrenome: ");
				funcionarioController.adicionar(nome, sobrenome);
			
			} else if (opcao == 2) {
				String id = Input.perguntarString("Digite o id: ");
				String nome = Input.perguntarString("Digite seu novo nome: ");
				String sobrenome = Input.perguntarString("Digite seu novo sobrenome: ");
				funcionarioController.atualizar(id, nome, sobrenome);
				
			} else if (opcao == 3) {
				String id = Input.perguntarString("Digite o id: ");
				funcionarioController.deletar(id);
				
			} else if (opcao == 4) {
				funcionarioController.ImprimirTodos();
				
			} else if (opcao == 5) {
				String tipoPapel = Input.perguntarString("Digite o tipo de papel: ");
				String formatoPapel = Input.perguntarString("Digite o formato do papel: ");
				String gramaturaPapel = Input.perguntarString("Digite a gramatura do papel: ");
				String corPapel = Input.perguntarString("Digite a cor do papel: ");
				Integer quantidadePapel = Input.perguntarInt("Digite a quantidade de papel com essas caracteristicas: ");
				Double valor = Input.perguntarDouble("Digite o valor do papel com essas caracteristicas: ");
				
				estoqueController.adicionar(tipoPapel, formatoPapel, gramaturaPapel, corPapel, valor, quantidadePapel);
			} else if (opcao == 6) {
				String id = Input.perguntarString("Digite o id: ");
				String tipoPapel = Input.perguntarString("Digite o tipo de papel: ");
				String formatoPapel = Input.perguntarString("Digite o formato do papel: ");
				String gramaturaPapel = Input.perguntarString("Digite a gramatura do papel: ");
				String corPapel = Input.perguntarString("Digite a cor do papel: ");
				Integer quantidadePapel = Input.perguntarInt("Digite a quantidade de papel com essas caracteristicas: ");
				Double valor = Input.perguntarDouble("Digite o valor do papel com essas caracteristicas: ");
				
				estoqueController.atualizar(id, tipoPapel, formatoPapel, gramaturaPapel, corPapel, valor, quantidadePapel);
				
			} else if (opcao == 7) {
				String id = Input.perguntarString("Digite o id: ");
				
				estoqueController.deletar(id);
				
			} else if (opcao == 8) {
				
				estoqueController.ImprimirTodos();
				
			} else if (opcao == 9) {
				
				String nome = Input.perguntarString("Digite o nome do  cliente: ");
				String sobrenome = Input.perguntarString("Digite o sobrenome do cliente: ");
				String cpf = Input.perguntarString("Digite o cpf do cliente: ");
				String idFuncionario = Input.perguntarString("Digite o id do funcionário: ");
				ArrayList<ItemVenda> itensPedidos = new ArrayList<ItemVenda>();
				
				Boolean opcaoItemVendaWhile = true;
				
				while(opcaoItemVendaWhile) {
					String idPapel = Input.perguntarString("Digite o id do papel: ");
					Integer quantidadePapel = Input.perguntarInt("Digite a quantidade de papel: ");
					
					ItemEstoque papel = estoqueController.getPapelPorId(idPapel);
					
					if (papel.getQuantidade() < quantidadePapel) {
						System.out.println("Papel insuficienteq");
					} else {
						itensPedidos.add(new ItemVenda(estoqueController.getPapelPorId(idPapel).getPapel(), quantidadePapel));
						estoqueController.atualizar(idPapel, papel.getPapel().getTipo(), papel.getPapel().getFormato(), papel.getPapel().getGramatura(), papel.getPapel().getCor(), papel.getPapel().getValor(), papel.getQuantidade() - quantidadePapel);
					}
					
 
					
					
					String opcaoItem = Input.perguntarString("\n\nVocê quer adicionar outro item (s/n): ");
					if(!opcaoItem.equalsIgnoreCase("S")) {
						opcaoItemVendaWhile = false;
					}
				}

				if (itensPedidos.size() > 0) {
					vendaController.adicionar(itensPedidos, nome, sobrenome, cpf, idFuncionario);
				} else {
					System.out.println("Nenhum pedido feito!");
				}
				
				
			} else if (opcao == 10) {
				vendaController.ImprimirTodos();
				
			} else if (opcao == 0) {
				break;
			}
		}
		
		

		
	}
}
