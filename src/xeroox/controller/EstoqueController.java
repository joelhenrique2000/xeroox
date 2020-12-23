package xeroox.controller;

import xeroox.business.EstoqueBusiness;
import xeroox.model.ItemEstoque;
import xeroox.model.Papel;
import xeroox.utils.Hash;

public class EstoqueController {

	private EstoqueBusiness business = new EstoqueBusiness();
	
	public Boolean adicionar(String tipoPapel, String formatoPapel, String gramaturaPapel, String corPapel, Double valor, Integer quantidade) {
		Papel papel = new Papel(Hash.gerarHash(), tipoPapel, formatoPapel, gramaturaPapel, corPapel, valor);
		ItemEstoque itemEstoque = new ItemEstoque(Hash.gerarHash(), papel, quantidade);
		return business.adicionar(itemEstoque);
	}

	public void atualizar(String id, String tipoPapel, String formatoPapel, String gramaturaPapel, String corPapel, Double valor, Integer quantidade) {
		Papel papel = new Papel(id, tipoPapel, formatoPapel, gramaturaPapel, corPapel, valor);
		ItemEstoque itemEstoque = new ItemEstoque(id, papel, quantidade);
		
		business.atualizar(itemEstoque);
	}

	public Boolean deletar(String id) {
		return business.deletar(new ItemEstoque(id, null, 0));
	}
	 
	public ItemEstoque getPapelPorId(String id) {
		return business.listarPorId(id);
	}

	public void ImprimirTodos() {
		for(ItemEstoque funci : business.listarTodos()) {
			System.out.println("\n+--------------");
			System.out.println("| Id: " + funci.getId());
			System.out.println("| Quantidade: " + funci.getQuantidade());
			System.out.println("| Preço: " + funci.getPapel().getValor());
			System.out.println("| Cor: " + funci.getPapel().getCor());
			System.out.println("| Formato: " + funci.getPapel().getFormato());
			System.out.println("| Gramatura: " + funci.getPapel().getGramatura());
			System.out.println("| Tipo: " + funci.getPapel().getTipo());
			System.out.println("\n+--------------");
		}
	}
}
