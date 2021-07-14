package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

//CRIA��O DA CLASSE RELATORIO COM SEUS ACASSORES E CONTRUTORES FACILIDAR A MANIPULA��O DAS VARIAVEIS � ARMAZENAMENTO DOS DADOS
public class Relatorio {

	// IMPORTEI A CLASS DATE PARA AJUDAR A INFORMAR A DATA ATUAL SEM PRECISAR
	// DIGITAR NO CONSOLE
	Date date = new Date();

	// IMPORTEI A CLASS SimpleDateFormat PARA FORMATAR A DATA
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// DECLARA��O DA VARIAVEL DO TIPO STRING CHAMADA product TENDO O SEU ACESSO
	// PRIVATE PARA SOMENTE A CLASSE TER ACESSO AS MOTIFICA��ES
	private String product;

	// DECLARA��ES DAS VARIAVEIS DO TIPO DOUBLE CHAMADAS product E lucro TENDO O SEU
	// ACESSO PRIVATE PARA SOMENTE A CLASSE TER ACESSO AS MOTIFICA��ES
	private double valorVen, lucro;

	// DECLARA��ES DAS VARIAVEIS DO TIPO INT CHAMADA totalProct E quantEstq TENDO O
	// SEU ACESSO PRIVATE PARA SOMENTE A CLASSE TER ACESSO AS MOTIFICA��ES
	private int totalProct, quantEstq;

	// CRIA��O DE UM CONSTRUTOR PADR�O PARA FACILITA A MANIPULA��O DE INFORMA��ES
	// SEM PARAMETRO
	public Relatorio() {

	}

	// CRIA��O DE UM CONSTRUTOR COM PARAMETRO COLOCANDO AS PRINCIPAIS VARIAVEIS DA
	// CLASS PARA AJUDAR NA MANIPULA��O DE DADOS
	public void setRelatorio(String product, double valorVen, int totalProct, int quantEstq, double lucro) {
		this.product = product;
		this.valorVen = valorVen;
		this.totalProct = totalProct;
		this.quantEstq = quantEstq;
		this.lucro = lucro;

	}

	// ACESSOR DE DADOS PADR�O ONDE DAR PERMISS�O DE OUTRA CLASSE DE ACESSAR AS
	// INFOR��ES ATRAVES DO METODO getProduct() QUE VAI RETURNA O VALOR DO
	// PRODUCT NESTE CASO O NOME
	public String getProduct() {
		return product;
	}

	// ACESSOR QUE VAI DAR PERMIS�O DE ALTERAR DADOS ATRAVES DO METODO setProduct �
	// SERA SALVO NA VARIAVEL PRODUCT.
	public void setProduct(String product) {
		this.product = product;
	}

	// ACESSOR DE DADOS PADR�O ONDE DAR PERMISS�O DE OUTRA CLASSE DE ACESSAR AS
	// INFOR��ES ATRAVES DO METODO getValorVen() QUE VAI RETURNA O VALOR DO
	// valorVen NESTE CASO O VALOR TOTAL DA COMPRA
	public double getValorVen() {
		return valorVen;
	}

	// ACESSOR QUE VAI DAR PERMIS�O DE ALTERAR DADOS ATRAVES DO METODO setValorVeN �
	// SERA SALVO NA VARIAVEL valorVen.
	public void setValorVen(double valorVen) {
		this.valorVen = valorVen;
	}

	// ACESSOR DE DADOS PADR�O ONDE DAR PERMISS�O DE OUTRA CLASSE DE ACESSAR AS
	// INFOR��ES ATRAVES DO METODO getTotalProct() QUE VAI RETURNA O VALOR DO
	// totalProct NESTE CASO O TOTAL DE ITENS
	public int getTotalProct() {
		return totalProct;
	}

	// ACESSOR QUE VAI DAR PERMIS�O DE ALTERAR DADOS ATRAVES DO METODO setTotalProct
	// � SERA SALVO NA VARIAVEL totalProct.
	public void setTotalProct(int totalProct) {
		this.totalProct = totalProct;
	}

	// ACESSOR DE DADOS PADR�O ONDE DAR PERMISS�O DE OUTRA CLASSE DE ACESSAR AS
	// INFOR��ES ATRAVES DO METODO getQuantEstq() QUE VAI RETURNA O QUANTIDADE DE
	// PRODUTO NO ESTOQUE
	public int getQuantEstq() {
		return quantEstq;
	}

	// ACESSOR QUE VAI DAR PERMIS�O DE ALTERAR DADOS ATRAVES DO METODO setQuantEstq
	// � SERA SALVO NA VARIAVEL quantEstq.
	public void setQuantEstq(int quantEstq) {
		this.quantEstq = quantEstq;
	}

	// ACESSOR DE DADOS PADR�O ONDE DAR PERMISS�O DE OUTRA CLASSE DE ACESSAR AS
	// INFOR��ES ATRAVES DO METODO getQuantEstq() QUE VAI RETURNA O QUANTIDADE DE
	// PRODUTO NO ESTOQUE
	public double getLucro() {
		return lucro;
	}

	// ACESSOR QUE VAI DAR PERMIS�O DE ALTERAR DADOS ATRAVES DO METODO setLucro
	// � SERA SALVO NA VARIAVEL lucro.
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	// METODO PARA FORMATAR O RELATORIO QUE SERA ESCRITO EM UM ARQUIVO QUE SERA
	// SALVO ONDE VAI CONTER TODAS AS INFORM��ES COMO NOME DO PRODUTO QUE FOI
	// COMPRADO QUANTIDADE COMPRADA, QUNATIDA QUE FICOU NO ESTOQUE, LUCRO OBTIDO NA
	// VENDA.COLOQUEI ESPA�OS EM BRANCOS PARA MELHORAR E DEIXAR A FORMATA��O MELHOR
	// VISUALMENTE.
	public String toString() {
		return "VENDAS DO DIA: " + sdf.format(date) + "\n"
				+ "PRODUTO   TOTAL VENDIDO    QUANTIDADE    ESTOQUE   LUCRO \n" + product + "         " + "R$"
				+ valorVen + "         " + totalProct + "             " + quantEstq + "     " + "R$" + lucro;
	}

}
