package xeroox.business;

import java.util.ArrayList;

import xeroox.business.interfaces.BaseBusiness;
import xeroox.model.Funcionario;
import xerrox.store.Store;

public class FuncionarioBusiness implements BaseBusiness<Funcionario> {

	@Override
	public Boolean adicionar(Funcionario object) {
		return Store.sistema.getFuncionarios().add((Funcionario) object);
	}

	@Override
	public ArrayList<Funcionario> listarTodos() {
		return Store.sistema.getFuncionarios();
	}

	@Override 
	public Funcionario listarPorId(String id) {

		Integer posicaoList = -1;
		
		for(int i = 0; i < Store.sistema.getFuncionarios().size(); i++) {
		    if (Store.sistema.getFuncionarios().get(i).getId().equalsIgnoreCase(id)) {
		    	posicaoList = i;
			}
		}
		
		Funcionario funcionario = Store.sistema.getFuncionarios().get(posicaoList);
		System.out.println(">>>>>>>" + funcionario.getNome());
		return funcionario;
	}

	@Override
	public void atualizar(Funcionario object) {
		Store.sistema.getFuncionarios().replaceAll(funcionario -> {
			if (funcionario.getId().equalsIgnoreCase(((Funcionario)object).getId())) {
				return (Funcionario) object;
			}
			
			return (Funcionario) object;
		});
	}

	@Override
	public Boolean deletar(Funcionario object) {
		return Store.sistema.getFuncionarios().removeIf(filter -> filter.getId().equalsIgnoreCase(((Funcionario) object).getId()));
	}

}


/*
 package xeroox.business;

import java.util.ArrayList;

import xeroox.business.interfaces.BaseBusiness;
import xeroox.model.Funcionario;
import xeroox.model.ItemEstoque;
import xeroox.model.Venda;
import xerrox.store.Store;

public class BaseController<T> implements BaseBusiness<T> {
 
	@Override
	public void adicionar(T object) {
		if (object instanceof Funcionario) {
			Store.sistema.getFuncionarios().add((Funcionario) object);
		
		} else if (object instanceof ItemEstoque) {
			Store.sistema.getEstoque().getItensEstoque().add((ItemEstoque) object);
		
		} else if (object instanceof Venda) {
			Store.sistema.getHistorico().getVendas().add((Venda) object);
		
		} else {			
			System.out.println("Erro interno ao adicionar esse objeto");
		}
	}

	@Override
	public void atualizar(T object) {
		
		if (object instanceof Funcionario) {
			Store.sistema.getFuncionarios().replaceAll(funcionario -> {
				if (funcionario.getId().equalsIgnoreCase(((Funcionario)object).getId())) {
					return (Funcionario) object;
				}
				
				return (Funcionario) object;
			});
		
		} else if (object instanceof ItemEstoque) {
			
		} else if (object instanceof Venda) {
			
		} else {			
			System.out.println("Erro interno ao adicionar esse objeto");
		}
		
	}

	@Override
	public Boolean deletar(T object) {
		if (object instanceof Funcionario) {
			return Store.sistema.getFuncionarios().removeIf(filter -> filter.getId().equalsIgnoreCase(((Funcionario) object).getId()));
		} else if (object instanceof ItemEstoque) {
			return Store.sistema.getEstoque().getItensEstoque().removeIf(filter -> filter.getId().equalsIgnoreCase(((ItemEstoque) object).getId()));
		} else if (object instanceof Venda) {
			return false;
		} else {			
			return false;
		}
	}

	@Override
	public ArrayList<T> listarTodos() {
		return (ArrayList<T>) Store.sistema.getFuncionarios();
	}

	@Override
	public T listarPorId() {
		// TODO Auto-generated method stub
		return null;
	}

}

 */
