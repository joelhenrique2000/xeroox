package xeroox.view;

import java.util.ArrayList;

import xeroox.enums.CorPapel;
import xeroox.enums.FormatoPapel;
import xeroox.enums.GramaturaPapel;
import xeroox.enums.TipoPapel;
import xeroox.model.*;

public class main {
	public static void main(String[] args) {

		// Funcionarios instanciados
		Funcionario funcionario1 = new Funcionario("Funcionario 1", "Funcionario 1", 950.0, 5.0);
		Funcionario funcionario2 = new Funcionario("Funcionario 2", "Funcionario 2", 950.0, 2.0);
		Funcionario funcionaria3 = new Funcionario("Funcionario 3", "Funcionario 3", 950.0, 5.0);
		Funcionario funcionario4 = new Funcionario("Funcionario 4", "Funcionario 4", 950.0, 1.0);
		
		// Adicionado os funcionarios em uma array list
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionaria3);
		funcionarios.add(funcionario4);

		// Clientes instanciados
		Usuario cliente1 = new Funcionario("Cliente 1", "Cliente 1", 950.0, 5.0);
		Usuario cliente2 = new Funcionario("Cliente 2", "Cliente 2", 950.0, 2.0);
		Usuario cliente3 = new Funcionario("Cliente 3", "Cliente 3", 950.0, 5.0);
		Usuario cliente4 = new Funcionario("Cliente 4", "Cliente 4", 950.0, 1.0);
		
		// Papeis instanciados
		Papel papel01 = new Papel(TipoPapel.SULFITE, FormatoPapel.A0, GramaturaPapel.GRAMATURA_250_A_350_GRAMAS, CorPapel.LARANJA, 0.7);
		Papel papel02 = new Papel(TipoPapel.SULFITE, FormatoPapel.A2, GramaturaPapel.GRAMATURA_120_A_240_GRAMAS, CorPapel.AMARELO, 0.7);
		Papel papel03 = new Papel(TipoPapel.SULFITE, FormatoPapel.A5, GramaturaPapel.GRAMATURA_30_A_63_GRAMAS, CorPapel.AZUL, 0.7);
		Papel papel04 = new Papel(TipoPapel.SULFITE, FormatoPapel.A2, GramaturaPapel.GRAMATURA_120_A_240_GRAMAS, CorPapel.AMARELO, 0.7);
		Papel papel05 = new Papel(TipoPapel.SULFITE, FormatoPapel.A3, GramaturaPapel.GRAMATURA_30_A_63_GRAMAS, CorPapel.VERMELHO, 0.7);
		Papel papel06 = new Papel(TipoPapel.SULFITE, FormatoPapel.A8, GramaturaPapel.GRAMATURA_120_A_240_GRAMAS, CorPapel.AMARELO, 0.7);
		Papel papel07 = new Papel(TipoPapel.SULFITE, FormatoPapel.A4, GramaturaPapel.GRAMATURA_30_A_63_GRAMAS, CorPapel.ROXO, 0.7);
		Papel papel08 = new Papel(TipoPapel.SULFITE, FormatoPapel.A7, GramaturaPapel.GRAMATURA_30_A_63_GRAMAS, CorPapel.MARROM, 0.7);
		Papel papel09 = new Papel(TipoPapel.DESIGN_WHITE, FormatoPapel.A7, GramaturaPapel.GRAMATURA_250_A_350_GRAMAS, CorPapel.DOURADO, 0.7);
		Papel papel10 = new Papel(TipoPapel.DUO_DESIGN, FormatoPapel.A6, GramaturaPapel.GRAMATURA_250_A_350_GRAMAS, CorPapel.AMARELO, 0.7);
		Papel papel11 = new Papel(TipoPapel.DIAMOND, FormatoPapel.A4, GramaturaPapel.GRAMATURA_120_A_240_GRAMAS, CorPapel.PRETO, 0.7);
		Papel papel12 = new Papel(TipoPapel.ASPEN, FormatoPapel.A2, GramaturaPapel.GRAMATURA_75_A_120_GRAMAS, CorPapel.AMARELO, 0.7);
		Papel papel13 = new Papel(TipoPapel.DESIGN_WHITE, FormatoPapel.A9, GramaturaPapel.GRAMATURA_250_A_350_GRAMAS, CorPapel.AZUL, 0.7);
		Papel papel14 = new Papel(TipoPapel.SPPED, FormatoPapel.A5, GramaturaPapel.GRAMATURA_30_A_63_GRAMAS, CorPapel.BRANCO, 0.7);
		Papel papel15 = new Papel(TipoPapel.FINE_ART, FormatoPapel.A4, GramaturaPapel.GRAMATURA_120_A_240_GRAMAS, CorPapel.MARROM, 0.7);
		Papel papel16 = new Papel(TipoPapel.ASPEN, FormatoPapel.A2, GramaturaPapel.GRAMATURA_250_A_350_GRAMAS, CorPapel.VERDE, 0.7);
		Papel papel17 = new Papel(TipoPapel.DUPLEX, FormatoPapel.A1, GramaturaPapel.GRAMATURA_120_A_240_GRAMAS, CorPapel.DOURADO, 0.7);
		Papel papel18 = new Papel(TipoPapel.VERGE, FormatoPapel.A0, GramaturaPapel.GRAMATURA_30_A_63_GRAMAS, CorPapel.AMARELO, 0.7);
		Papel papel19 = new Papel(TipoPapel.JORNAL, FormatoPapel.A5, GramaturaPapel.GRAMATURA_75_A_120_GRAMAS, CorPapel.MARROM, 0.7);
		Papel papel20 = new Papel(TipoPapel.FOTOGRAFICO, FormatoPapel.A7, GramaturaPapel.GRAMATURA_75_A_120_GRAMAS, CorPapel.CINZA, 0.7);
		Papel papel21 = new Papel(TipoPapel.RECILATO, FormatoPapel.A5, GramaturaPapel.GRAMATURA_120_A_240_GRAMAS, CorPapel.AMARELO, 0.7);
		Papel papel22 = new Papel(TipoPapel.FOTOGRAFICO, FormatoPapel.A2, GramaturaPapel.GRAMATURA_30_A_63_GRAMAS, CorPapel.CINZA, 0.7);
		Papel papel23 = new Papel(TipoPapel.DESIGN_WHITE, FormatoPapel.A6, GramaturaPapel.GRAMATURA_120_A_240_GRAMAS, CorPapel.CINZA, 0.7);
		Papel papel24 = new Papel(TipoPapel.JORNAL, FormatoPapel.A2, GramaturaPapel.GRAMATURA_30_A_63_GRAMAS, CorPapel.AMARELO, 0.7);
		Papel papel25 = new Papel(TipoPapel.SULFITE, FormatoPapel.A0, GramaturaPapel.GRAMATURA_120_A_240_GRAMAS, CorPapel.LARANJA, 0.7);
		Papel papel26 = new Papel(TipoPapel.DUO_DESIGN, FormatoPapel.A0, GramaturaPapel.GRAMATURA_250_A_350_GRAMAS, CorPapel.LARANJA, 0.7);
		Papel papel27 = new Papel(TipoPapel.ASPEN, FormatoPapel.A0, GramaturaPapel.GRAMATURA_120_A_240_GRAMAS, CorPapel.AZUL, 0.7);
		Papel papel28 = new Papel(TipoPapel.FINE_ART, FormatoPapel.A0, GramaturaPapel.GRAMATURA_250_A_350_GRAMAS, CorPapel.AMARELO, 0.7);
		Papel papel29 = new Papel(TipoPapel.COUCHE, FormatoPapel.A0, GramaturaPapel.GRAMATURA_75_A_120_GRAMAS, CorPapel.DOURADO, 0.7);
		Papel papel30 = new Papel(TipoPapel.SPPED, FormatoPapel.A0, GramaturaPapel.GRAMATURA_30_A_63_GRAMAS, CorPapel.AMARELO, 0.7);
		Papel papel31 = new Papel(TipoPapel.DESIGN_WHITE, FormatoPapel.A0, GramaturaPapel.GRAMATURA_30_A_63_GRAMAS, CorPapel.AZUL, 0.7);
		Papel papel32 = new Papel(TipoPapel.ASPEN, FormatoPapel.A0, GramaturaPapel.GRAMATURA_120_A_240_GRAMAS, CorPapel.DOURADO, 0.7);
		Papel papel33 = new Papel(TipoPapel.DIAMOND, FormatoPapel.A0, GramaturaPapel.GRAMATURA_120_A_240_GRAMAS, CorPapel.VERDE, 0.7);
		Papel papel34 = new Papel(TipoPapel.DESIGN_WHITE, FormatoPapel.A0, GramaturaPapel.GRAMATURA_75_A_120_GRAMAS, CorPapel.AMARELO, 0.7);
		
		ItemEstoque itemEstoque01 = new ItemEstoque(papel01, 400);
		ItemEstoque itemEstoque02 = new ItemEstoque(papel02, 500);
		ItemEstoque itemEstoque03 = new ItemEstoque(papel03, 40);
		ItemEstoque itemEstoque04 = new ItemEstoque(papel04, 120);
		ItemEstoque itemEstoque05 = new ItemEstoque(papel05, 76);
		ItemEstoque itemEstoque06 = new ItemEstoque(papel06, 3);
		ItemEstoque itemEstoque07 = new ItemEstoque(papel07, 12);
		ItemEstoque itemEstoque08 = new ItemEstoque(papel08, 43);
		ItemEstoque itemEstoque09 = new ItemEstoque(papel09, 12);
		ItemEstoque itemEstoque10 = new ItemEstoque(papel10, 323);
		ItemEstoque itemEstoque11 = new ItemEstoque(papel11, 32);
		ItemEstoque itemEstoque12 = new ItemEstoque(papel12, 12);
		ItemEstoque itemEstoque13 = new ItemEstoque(papel13, 0);
		ItemEstoque itemEstoque14 = new ItemEstoque(papel14, 2);
		ItemEstoque itemEstoque15 = new ItemEstoque(papel15, 333);
		ItemEstoque itemEstoque16 = new ItemEstoque(papel16, 53);
		ItemEstoque itemEstoque17 = new ItemEstoque(papel17, 12);
		ItemEstoque itemEstoque18 = new ItemEstoque(papel18, 44);
		ItemEstoque itemEstoque19 = new ItemEstoque(papel19, 123);
		ItemEstoque itemEstoque20 = new ItemEstoque(papel20, 66);
		ItemEstoque itemEstoque21 = new ItemEstoque(papel21, 66);
		ItemEstoque itemEstoque22 = new ItemEstoque(papel22, 66);
		ItemEstoque itemEstoque23 = new ItemEstoque(papel23, 312);
		ItemEstoque itemEstoque24 = new ItemEstoque(papel24, 123);
		ItemEstoque itemEstoque25 = new ItemEstoque(papel25, 321);
		ItemEstoque itemEstoque26 = new ItemEstoque(papel26, 11);
		ItemEstoque itemEstoque27 = new ItemEstoque(papel27, 23);
		ItemEstoque itemEstoque28 = new ItemEstoque(papel28, 58);
		ItemEstoque itemEstoque29 = new ItemEstoque(papel29, 13);
		ItemEstoque itemEstoque30 = new ItemEstoque(papel30, 21);
		ItemEstoque itemEstoque31 = new ItemEstoque(papel31, 34);
		ItemEstoque itemEstoque32 = new ItemEstoque(papel32, 55);
		ItemEstoque itemEstoque33 = new ItemEstoque(papel33, 89);
		ItemEstoque itemEstoque34 = new ItemEstoque(papel34, 144);
		
		// Adicionado os funcionarios em uma array list
		ArrayList<ItemEstoque> intensEstoque = new ArrayList<ItemEstoque>();
		intensEstoque.add(itemEstoque01);
		intensEstoque.add(itemEstoque02);
		intensEstoque.add(itemEstoque03);
		intensEstoque.add(itemEstoque04);
		intensEstoque.add(itemEstoque05);
		intensEstoque.add(itemEstoque06);
		intensEstoque.add(itemEstoque07);
		intensEstoque.add(itemEstoque08);
		intensEstoque.add(itemEstoque09);
		intensEstoque.add(itemEstoque10);
		intensEstoque.add(itemEstoque11);
		intensEstoque.add(itemEstoque12);
		intensEstoque.add(itemEstoque13);
		intensEstoque.add(itemEstoque14);
		intensEstoque.add(itemEstoque15);
		intensEstoque.add(itemEstoque16);
		intensEstoque.add(itemEstoque17);
		intensEstoque.add(itemEstoque18);
		intensEstoque.add(itemEstoque19);
		intensEstoque.add(itemEstoque20);
		intensEstoque.add(itemEstoque21);
		intensEstoque.add(itemEstoque22);
		intensEstoque.add(itemEstoque23);
		intensEstoque.add(itemEstoque24);
		intensEstoque.add(itemEstoque25);
		intensEstoque.add(itemEstoque26);
		intensEstoque.add(itemEstoque27);
		intensEstoque.add(itemEstoque28);
		intensEstoque.add(itemEstoque29);
		intensEstoque.add(itemEstoque30);
		intensEstoque.add(itemEstoque31);
		intensEstoque.add(itemEstoque32);
		intensEstoque.add(itemEstoque33);
		intensEstoque.add(itemEstoque34);
		
		Estoque estoque = new Estoque(intensEstoque);
		
		Historico historico = new Historico();
		
		Sistema empresaXeroox = new Sistema("Xeroox", funcionarios, "29343434", estoque, historico);
		
		// Aqui vai ter toda
		empresaXeroox.abrirPDV();
		
	}
}
