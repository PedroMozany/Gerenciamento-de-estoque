package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

//CRIAÇÃO DA CLASSE RELATORIO COM SEUS ACASSORES E CONTRUTORES FACILIDAR A MANIPULAÇÃO DAS VARIAVEIS É ARMAZENAMENTO DOS DADOS
public class Relatorio {

	// IMPORTEI A CLASS DATE PARA AJUDAR A INFORMAR A DATA ATUAL SEM PRECISAR
	// DIGITAR NO CONSOLE
	Date date = new Date();

	// IMPORTEI A CLASS SimpleDateFormat PARA FORMATAR A DATA
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// DECLARAÇÃO DA VARIAVEL DO TIPO STRING CHAMADA product TENDO O SEU ACESSO
	// PRIVATE PARA SOMENTE A CLASSE TER ACESSO AS MOTIFICAÇÕES
	private String product;

	// DECLARAÇÕES DAS VARIAVEIS DO TIPO DOUBLE CHAMADAS product E lucro TENDO O SEU
	// ACESSO PRIVATE PARA SOMENTE A CLASSE TER ACESSO AS MOTIFICAÇÕES
	private double valorVen, lucro;

	// DECLARAÇÕES DAS VARIAVEIS DO TIPO INT CHAMADA totalProct E quantEstq TENDO O
	// SEU ACESSO PRIVATE PARA SOMENTE A CLASSE TER ACESSO AS MOTIFICAÇÕES
	private int totalProct, quantEstq;

	// CRIAÇÃO DE UM CONSTRUTOR PADRÃO PARA FACILITA A MANIPULAÇÃO DE INFORMAÇÕES
	// SEM PARAMETRO
	public Relatorio() {

	}

	// CRIAÇÃO DE UM CONSTRUTOR COM PARAMETRO COLOCANDO AS PRINCIPAIS VARIAVEIS DA
	// CLASS PARA AJUDAR NA MANIPULAÇÃO DE DADOS
	public void setRelatorio(String product, double valorVen, int totalProct, int quantEstq, double lucro) {
		this.product = product;
		this.valorVen = valorVen;
		this.totalProct = totalProct;
		this.quantEstq = quantEstq;
		this.lucro = lucro;

	}

	// ACESSOR DE DADOS PADRÃO ONDE DAR PERMISSÃO DE OUTRA CLASSE DE ACESSAR AS
	// INFORÇÕES ATRAVES DO METODO getProduct() QUE VAI RETURNA O VALOR DO
	// PRODUCT NESTE CASO O NOME
	public String getProduct() {
		return product;
	}

	// ACESSOR QUE VAI DAR PERMISÃO DE ALTERAR DADOS ATRAVES DO METODO setProduct É
	// SERA SALVO NA VARIAVEL PRODUCT.
	public void setProduct(String product) {
		this.product = product;
	}

	// ACESSOR DE DADOS PADRÃO ONDE DAR PERMISSÃO DE OUTRA CLASSE DE ACESSAR AS
	// INFORÇÕES ATRAVES DO METODO getValorVen() QUE VAI RETURNA O VALOR DO
	// valorVen NESTE CASO O VALOR TOTAL DA COMPRA
	public double getValorVen() {
		return valorVen;
	}

	// ACESSOR QUE VAI DAR PERMISÃO DE ALTERAR DADOS ATRAVES DO METODO setValorVeN É
	// SERA SALVO NA VARIAVEL valorVen.
	public void setValorVen(double valorVen) {
		this.valorVen = valorVen;
	}

	// ACESSOR DE DADOS PADRÃO ONDE DAR PERMISSÃO DE OUTRA CLASSE DE ACESSAR AS
	// INFORÇÕES ATRAVES DO METODO getTotalProct() QUE VAI RETURNA O VALOR DO
	// totalProct NESTE CASO O TOTAL DE ITENS
	public int getTotalProct() {
		return totalProct;
	}

	// ACESSOR QUE VAI DAR PERMISÃO DE ALTERAR DADOS ATRAVES DO METODO setTotalProct
	// É SERA SALVO NA VARIAVEL totalProct.
	public void setTotalProct(int totalProct) {
		this.totalProct = totalProct;
	}

	// ACESSOR DE DADOS PADRÃO ONDE DAR PERMISSÃO DE OUTRA CLASSE DE ACESSAR AS
	// INFORÇÕES ATRAVES DO METODO getQuantEstq() QUE VAI RETURNA O QUANTIDADE DE
	// PRODUTO NO ESTOQUE
	public int getQuantEstq() {
		return quantEstq;
	}

	// ACESSOR QUE VAI DAR PERMISÃO DE ALTERAR DADOS ATRAVES DO METODO setQuantEstq
	// É SERA SALVO NA VARIAVEL quantEstq.
	public void setQuantEstq(int quantEstq) {
		this.quantEstq = quantEstq;
	}

	// ACESSOR DE DADOS PADRÃO ONDE DAR PERMISSÃO DE OUTRA CLASSE DE ACESSAR AS
	// INFORÇÕES ATRAVES DO METODO getQuantEstq() QUE VAI RETURNA O QUANTIDADE DE
	// PRODUTO NO ESTOQUE
	public double getLucro() {
		return lucro;
	}

	// ACESSOR QUE VAI DAR PERMISÃO DE ALTERAR DADOS ATRAVES DO METODO setLucro
	// É SERA SALVO NA VARIAVEL lucro.
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	// METODO PARA FORMATAR O RELATORIO QUE SERA ESCRITO EM UM ARQUIVO QUE SERA
	// SALVO ONDE VAI CONTER TODAS AS INFORMÇÕES COMO NOME DO PRODUTO QUE FOI
	// COMPRADO QUANTIDADE COMPRADA, QUNATIDA QUE FICOU NO ESTOQUE, LUCRO OBTIDO NA
	// VENDA.COLOQUEI ESPAÇOS EM BRANCOS PARA MELHORAR E DEIXAR A FORMATAÇÃO MELHOR
	// VISUALMENTE.
	public String toString() {
		return "VENDAS DO DIA: " + sdf.format(date) + "\n"
				+ "PRODUTO   TOTAL VENDIDO    QUANTIDADE    ESTOQUE   LUCRO \n" + product + "         " + "R$"
				+ valorVen + "         " + totalProct + "             " + quantEstq + "     " + "R$" + lucro;
	}

}
