package xeroox.business;

import java.util.ArrayList;

import xeroox.business.interfaces.BaseBusiness;
import xeroox.model.ItemEstoque;
import xerrox.store.Store;

public class EstoqueBusiness implements BaseBusiness<ItemEstoque> {
	@Override
	public Boolean adicionar(ItemEstoque object) {
		Store.sistema.getEstoque().getItensEstoque().add((ItemEstoque) object);
		return true;
	}

	@Override
	public ArrayList<ItemEstoque> listarTodos() {
		return Store.sistema.getEstoque().getItensEstoque();
	}

	@Override
	public ItemEstoque listarPorId(String id) {
		
		Integer posicaoList = -1;
		
		for(int i = 0; i < Store.sistema.getEstoque().getItensEstoque().size(); i++) {
		    if (Store.sistema.getEstoque().getItensEstoque().get(i).getId().equalsIgnoreCase(id)) {
		    	posicaoList = i;
			}
		}
		
		return Store.sistema.getEstoque().getItensEstoque().get(posicaoList);
	}

	@Override
	public void atualizar(ItemEstoque object) {
		Store.sistema.getEstoque().getItensEstoque().replaceAll(item -> {
			if (item.getId().equalsIgnoreCase(((ItemEstoque)object).getId())) {
				return (ItemEstoque) object;
			}
			
			return (ItemEstoque) item;
		});
	}

	@Override
	public Boolean deletar(ItemEstoque object) {
		return Store.sistema.getEstoque().getItensEstoque().removeIf(filter -> filter.getId().equalsIgnoreCase(((ItemEstoque) object).getId()));
	}

}
