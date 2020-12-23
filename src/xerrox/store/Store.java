package xerrox.store;

import java.util.ArrayList;

import xeroox.model.Estoque;
import xeroox.model.Funcionario;
import xeroox.model.Historico;
import xeroox.model.Sistema;

public class Store {
	private static Store instance = null;
	public static Sistema sistema; 
	 
	public static Store getInstance(String nomeSistema, String cnpjEmpresa) {
		if (Store.instance == null) {
			Store.instance = new Store();
			Store.sistema = new Sistema(nomeSistema, new ArrayList<Funcionario>(), cnpjEmpresa, new Estoque(), new Historico());
		}
		
		return Store.instance;
	}
}
