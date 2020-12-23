package xeroox.business;

import java.util.ArrayList;

import xeroox.model.Venda;
import xerrox.store.Store;

public class VenderBusiness {
	public Boolean adicionar(Venda venda) {
		return Store.sistema.getHistorico().getVendas().add(venda);
	}
	
	public ArrayList<Venda> listarTodos() {
		return Store.sistema.getHistorico().getVendas();
	}
}
 