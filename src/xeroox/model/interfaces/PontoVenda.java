package xeroox.model.interfaces;

import xeroox.model.Funcionario;
import xeroox.model.ItemEstoque;

public interface PontoVenda {
	public boolean abrirPDV();
	public boolean fecharPDV();
	public boolean vender(Venda venda);
	public void imprimirHistorico();
	public boolean adicionarEstoque(ItemEstoque item);
	public boolean adicionarFuncionario(Funcionario funcionario);
}
