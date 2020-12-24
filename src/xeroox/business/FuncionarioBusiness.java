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
		return funcionario;
	}

	@Override
	public void atualizar(Funcionario object) {
		Store.sistema.getFuncionarios().replaceAll(funcionario -> {
			if (funcionario.getId().equalsIgnoreCase(((Funcionario)object).getId())) {
				return (Funcionario) object;
			}
			
			return (Funcionario) funcionario;
		});
	}

	@Override
	public Boolean deletar(Funcionario object) {
		return Store.sistema.getFuncionarios().removeIf(filter -> filter.getId().equalsIgnoreCase(((Funcionario) object).getId()));
	}

}