package xeroox.business.interfaces;

import java.util.ArrayList;

public interface BaseBusiness<T> {
	public Boolean adicionar(T object);
	public ArrayList<T> listarTodos();
	public T listarPorId(String id);
	public void atualizar(T object);
	public Boolean deletar(T object);
}
