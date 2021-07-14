package entities;

// CRIA��O DA CLASSE MASCARAS COM SEUS ACESSORES E METODOS PARA FACILIDAR A MANIPULA��O DAS VARIAVEIS � ARMAZENAMENTO DOS DADOS
public class Mascaras {

	// DECLARA��O DO VETOR DO TIPO STRING CHAMADO PRODUCT TENDO O SEU ACESSO PRIVATE
	// PARA SOMENTE A CLASSE TER ACESSO A ELE.
	private String[] product;

	// DECLARA��O DA MATRIZ DO TIPO DOUBLE CHAMADO VALOR TENDO O SEU ACESSO PRIVATE
	// PARA SOMENTE A CLASSE TER ACESSO A ELE.
	private double[][] valor;

	// CRIA��O DE UM CONSTRUTOR PADR�O PARA FACILITAR NA HORA DE SOLICITAR E
	// ARMAZENAR DADOS DENTRO DAS VARIAVEIS
	public Mascaras() {

	}

	// CRIA��O DE UM CONSTRUTOR PASSANDO COMO PARAMENTRO A MATRIZ VALOR ONDE A
	// VALOR VAI RECEBER VALOR
	public Mascaras(double[][] valor) {
		this.valor = valor;
	}

	// CRIA��O DE UM CONSTRUTOR PASSANDO COMO PARAMENTRO O VETOR PRODUCT E MATRIZ
	// VALOR
	public Mascaras(String[] product, double[][] valor) {
		this.product = product;
		this.valor = valor;
	}

	// ACESSOR DE DADOS PADR�O ONDE DAR PERMISS�O DE OUTRA CLASSE DE ACESSAR AS
	// INFOR��ES ATRAVES DO METODO getProduct() QUE VAI RETURNA O VALOR DE
	// PRODUCT NESTE CASO O NOME
	public String[] getProduct() {
		return product;
	}

	// ACESSOR QUE VAI DAR PERMIS�O DE ALTERAR DADOS ATRAVES DO METODO setProduct �
	// SERA SALVO DO VETOR PRODUCT.
	public void setProduct(String[] product) {
		this.product = product;
	}

	// ACESSOR DE DADOS PADR�O ONDE DAR PERMISS�O DE OUTRA CLASSE DE ACESSAR AS
	// INFOR��ES ATRAVES DO METODO getValor() QUE VAI RETURNA O VALOR AS INFORMA��ES
	// SALVAS NA MATRIZ VALOR
	public double[][] getValor() {
		return valor;
	}

	// ACESSOR QUE VAI DAR PERMIS�O DE ALTERAR DADOS ATRAVES DO METODO setValor �
	// SERA SALVO NA MATRIZ VALOR
	public void setValor(double[][] valor) {
		this.valor = valor;
	}

	// METODO DE FORMATA��O PARA MOSTRAR A SAIDA CONFORMAR O PROGRAMADOR QUEIRA.
	public void exibir() {

		// AQUI FIZ A SEGUINTE FORMATA��O ABAIXO QUE SERA MOSTRATA NO CONSOLE AO USUARIO
		System.out.println("Produto    Q    C     P ");

		// METODO FOR PARA FORMATAR E PREENCHER A MATRIZ CONFORMAR OS DADOS ADD NA
		// MATRIZ PREENCHENDO LINHA E COLUNA
		for (int ln = 0; ln < valor.length; ln++) {
			// VAI MOSTRA O NOME DE CADA PRODUTO ADD NO VETOR CONSUMINDO CADA LINHA
			System.out.print(product[ln] + "       ");
			for (int col = 0; col < valor[0].length; col++) {
				System.out.printf("%.2f ", valor[ln][col]);

			}
			// COLOQUEI UM PRINTLN PARA CADA REPITI��O DE LINHA OCORRE UMA QUEBRA
			// VISUALMENTE MAIS ELEGANTE O PROGRAMA
			System.out.println();

		}
	}
}
