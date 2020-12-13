package xeroox.model;

import xeroox.enums.CorPapel;
import xeroox.enums.FormatoPapel;
import xeroox.enums.GramaturaPapel;
import xeroox.enums.TipoPapel;

public class Papel {
	private TipoPapel tipo;
	private FormatoPapel formato;
	private GramaturaPapel gramatura;
	private CorPapel cor;
	private double valor;
	
	public Papel (TipoPapel tipo, FormatoPapel formato, GramaturaPapel gramatura, CorPapel cor, double valor) {
		this.tipo = tipo;
		this.formato = formato;
		this.gramatura = gramatura;
		this.cor = cor;
		this.valor = valor;
	}

	public TipoPapel getTipo() {
		return tipo;
	}

	public void setTipo(TipoPapel tipo) {
		this.tipo = tipo;
	}

	public FormatoPapel getFormato() {
		return formato;
	}

	public void setFormato(FormatoPapel formato) {
		this.formato = formato;
	}

	public GramaturaPapel getGramatura() {
		return gramatura;
	}

	public void setGramatura(GramaturaPapel gramatura) {
		this.gramatura = gramatura;
	}

	public CorPapel getCor() {
		return cor;
	}

	public void setCor(CorPapel cor) {
		this.cor = cor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
