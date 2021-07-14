package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entities.Mascaras;
import entities.Relatorio;

public class Program {

	public static void main(String[] args) throws IOException {

		// IMPORTANDO A CLASSE SCANNER PARA REALIZAR A LEITURA DAS IMFORMAÇÕES DIGITA NO
		// CONSOLE
		Scanner sc = new Scanner(System.in);

		// IMPORTANDO A CLASSE MASCARAS QUE VAI SE CHAMAR "masc" PARA PODEMOS REALIZAR
		// MANIPULAÇÕES DE SUAS FUNÇÕES E METADOS
		Mascaras masc = new Mascaras();

		// IMPORTANDO A CLASSE RELATORIO QUE VAI SE CHAMAR "relatorio" PARA PODEMOS
		// REALIZAR
		// MANIPULAÇÕES DE SUAS FUNÇÕES E METADOS
		Relatorio relatorio = new Relatorio();

		// ULTILIZANDO print"ln" JA COM UMA QUEBRA DE LINHA PARA MOSTRA A INFORMAÇÃO QUE
		// CONSTA DENTRO DE SEU PARAMENTRO
		System.out.println("DIGITE A ENTRA DO ARQUIVO: ");

		// DECLARANDO UMA STRING CHAMADA ARQUIVO QUE VAI RECEBER UM VALOR DIGITANDO NO
		// CONSOLE ATRAVES DO METODO NEXTLINE QUE VAI LER TODA A LINHA
		String arquivo = sc.nextLine();

		// DECLARANDO UM VETOR DO TIPO STRING CHAMADO FIELDS
		String[] fields;

		// ESTRUTURA TRY PARA TRATAR A LEITURA DO ARQUIVO É EM SEU PARAMENTRO INPORTEI
		// BufferedReader PARA CONSUMIR A LEITURA MAIS RAPIDA É DENTRO DO SEU PARAMENTRO
		// INVOQUEI FileReader PARA LER A MINHA STRING QUE SERA O CAMINHA DIGITADO PELO
		// USUARIO. ASSIM O PROGRAMA VAI CONSUMIR MENOS MEMORIA E O PROGRAMA VAI TER
		// MENOS LINHA, TAMBEM NAO HA PRECISÃO DE DAR UM CLOSE NO FINAL PARA FINALIZAR.
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

			// DECLARAÇÃO DA MATRIZ DO TIPO DOUBLE QUE VAI SE CHAMAR "VALOR" QUE VAI TER O
			// TAMANHA DE 4X3: 4LINHAS É 3COLUNAS.
			double[][] valor = new double[4][3];

			// DECLARAÇÃO DE UMA STRING CHAMADA "LINHA" QUE VAI RECEBER CADA LINHA LIDA PELO
			// METODO readLine() FUNÇÃO DA CLASSSE BufferedReader. AQUI NESTA LINHA DO
			// PROGRAMA STRING VAI RECEBER A PRIMEIRA LINHA DO QUE SERA ONDE TODOS OS
			// VALORES SERAM TRANSFORMADOS EM LETRAS MAIUSCULAS PELO METODO toUpperCase().
			String linha = br.readLine().toUpperCase();

			// TODOS OS VALORES CONTIDOS NA VARIAVEL "LINHA" QUE TIVER UM ESPAÇO ENTRE ELES
			// SERAM SEPARADOS PELO METODO split E CADA VALOR SERA ARMAZENADO EM CADA VETOR
			// DA VARIAVEL FIELDS.
			fields = linha.split(" ");

			// CHAMANDO O METODO setProduct DA CLASSE "MASC" PARA ARMAZENAR OS VALORES
			// OBTIDOS NA VARIAVEL FIELDS
			masc.setProduct(fields);

			// NESTA LINHA DO PROGRAMA A VARIAVEL "LINHA" VAI RECABER OS VALORES DA SEGUNDA
			// LINHA DO ARQUIVO OBTIDOS PELO MEDOTO br.readLine().
			linha = br.readLine();

			// TODOS OS VALORES CONTIDOS NA VARIAVEL "LINHA" QUE TIVER UM ESPAÇO ENTRE ELES
			// SERAM SEPARADOS PELO METODO split E CADA VALOR SERA ARMAZENADO EM CADA VETOR
			// DA VARIAVEL FIELDS.
			fields = linha.split(" ");
			
			// NESTE PREIMEIRO LANÇO FOR VAI SER ULTILIZADO PARA PERCORRE TODAS AS COLUNAS
			// DA
			// MATRIZ PARA VALIDAR A CODIÇÃO O VETOR "VALOR" INICIAR COM 0.
			
			
			for (int col = 0; col < valor[0].length; col++) {

				// TODOS OS VALORES CONTIDOS NA VARIAVEL "LINHA" QUE TIVER UM ESPAÇO ENTRE ELES
				// SERAM SEPARADOS PELO METODO split E CADA VALOR SERA ARMAZENADO EM CADA VETOR
				// DA VARIAVEL FIELDS A CADA REPIÇÃO VAI RECEBER O VALOR DA PROXIMA COLONA DO
				// ARQUIVO.
				fields = linha.split(" ");
				
				//VAI LER A PROXIMA LINHA
				linha = br.readLine();
				// NESTE SEGUNDO FOR VAI PREENCHER AS LINHAS DA MATRIZ
					for (int ln = 0; ln < valor.length; ln++) {

						// O VALOR OBTIDO NAS LINHAS DO ARQUIVO QUE SÃO DO TIPO STRING SERAM CONVERTIDOS
						// PARA TIPO DOUBLE É SERAM ARMAZENADOS NA MATRIZ "VALOR" PREENCHENDO LINHA É
						// COLUNA.
						
						valor[ln][col] = Double.parseDouble(fields[ln]);
					

					}
				}
			
			// VAMOS ULTILIZAR O METODO DA CLASSE MASC setValor PARA ARMAZENAR OS VALORES
			// OBTIDOS ATRAVES DA LEITURA DO ARQUIVO E AMAZANADOS NA MATRIZ VALOR
			masc.setValor(valor);

			// VAMOR ULTILIZAR O METODO EXIBIR DA CLASSE MASC PARA MOSTRA O RESULTA DA
			// LEITURA DO ARQUIVO NO CONSOLE
			masc.exibir();

			// METODO CATCH PARA TRATAMENTO DE EXCEÇÃO PADRÃO ULTILIZANDO THROW IOException
			// PARA TRATAMENDO.
		} catch (IOException e) {

			// CASO OCORRA ALGO ERRO NA LEITURA DO ARQUIVO SERA EXIBIDO UMA MESSAGEM DE ERRO
			// PADRÃO DA CLASSE IOException CONCATENADO COM MESSAGEM DESCRITA NO ENTRE
			// ASPAS.
			System.out.println("Error reading file: " + e.getMessage());
		}
		// FIM DA LEITURA E PREENCHEMNTO DA MATRIZ É ARMAZENAMENTO.

		// DECLARAÇÃO DA VARIALVEL DO TIPO STRING QUE VAI SE CHAMAR namePro.
		String namePro;

		// DECLARAÇÃO DE VARIAS VARIAVEIS DO TIPO DOUBLE
		double quantComp = 0, preçoTotal = 0, quantEst = 0, lucro = 0, custo = 0;

		// EXIBINDO UMA MESSAGEM NO CONSOLE PARA AJUDAR O USUARIO NA INTERAÇÃO COM
		// PROGRAMA
		System.out.println("DIGITE O ARQUIVO QUE SERA SALVO:");

		// DECLARAÇÃO DA VARIAVEL DO TIPO STRING CHAMANDO saved QUE VAI RECEBER UM VALOR
		// QUE USUARIO DIGITAR NO CONSOLE ATRAVES DO METODO nextLine().
		String saved = sc.nextLine();

		// ESTRUTURA TRY PARA TRATAR A ESCRITA NO ARQUIVO ESCOLHIDO PELO USUARIO EM SEU
		// PARAMENTRO ESTOU TAMBEM ULTILIZANDO BufferedWriter PARA ESCRITA SER MAIS
		// RAPIDA E
		// DINAMICA É EM SEU PARAMENTRO ESTOU CHAMANDO A CLASSE FileWriter PASSANDO COMO
		// PARAMENTRO O ARQUIVO É COLOCANDO TRUE PARA NAO SUBSCREVER O ARQUIVO.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(saved, true))) {

			// EXIBINDO UMA MESSAGEM NO CONSOLE PARA AJUDAR O USUARIO NA INTERAÇÃO COM
			// PROGRAMA
			System.out.println("DESEJA COMPRAR ALGUMA MASCARA? S/N ");

			// DECLARAÇÃO DA VARIAVEL CHAR QUE SE CHAMA RESP QUE VAI RESCEBER SOMENTE UM
			// CARACTER
			// QUE USUARIO DIGITAR NORMALMENTE E SOMENTE UMA LENTRA.
			char resp = sc.next().charAt(0);

			// METODO WHILE DE REPETIÇÃO QUE PARA CONDIÇÃO DAR VERDADEIRA O VALOR ARMAZENADO
			// NA VARIAVEL RESP TEM QUER SER IGUAL A 'S' MINUSCULO OU MAIUSCULO.
			while (resp == 's' || resp == 'S') {

				// PRECISEI COLOCAR UM nextLine() A MAIS PQ FICOU PENDENTE
				sc.nextLine();

				// EXIBINDO UMA MESSAGEM NO CONSOLE PARA AJUDAR O USUARIO NA INTERAÇÃO COM
				// PROGRAMA
				System.out.println("QUAL TIPO ? ");

				// O USUARIO IRA DIGITA ALGUM TIPO DE MASCARA E ESSE VALOR DO TIPO STRING SERA
				// FORMATADO EM LETRA MAIUSCULA É ARMAZENADA NA VARIAVEL namePro
				namePro = sc.nextLine().toUpperCase();

				// METODO DE CONDICIONAMENTO QUE VAI COMPARAR O NOME DO PRODUTO COM NOME
				// DIGITADO PELO USUARIO PARA VALIDAR A CONDIÇÕE É RETORNAR VERDADEIRA NESTA
				// ESTRUTURA ESTOU USANDO IF É ELSE PARA O TESTE SER MAIS DINAMICO É MAIS RAPIDO
				// SE CASO A PRIMEIRA CONDIÇÃO DAR VERDADEIRO NAO VAI TESTAR AS DEMAIS.
				if (masc.getProduct()[0].equals(namePro)) {

					// EXIBINDO UMA MESSAGEM NO CONSOLE PARA AJUDAR O USUARIO NA INTERAÇÃO COM
					// PROGRAMA
					System.out.println("QUANTAS ?");

					// O USUARIO VAI DIGITA UM VALOR QUE VAI SE ARMAZENDO NA VARIAVEL quantComp
					quantComp = sc.nextDouble();

					// NESTE TESTE DE CONDICIONAMENTO VAI TESTAR SE O VALOR DIGITADO PELO USUARIO E
					// MENOR QUE O QUANTIDADE DE PRODUTO NO ESTOQUE É SE É DIFERENTE DE 0. NESTE
					// CASO O
					// QUANTIDADE DE PRODUTO NO ESTOQUE ESTA NA LINHA 0 E COLUNA 0 DA MATRIZ.
					if (quantComp <= masc.getValor()[0][0] && quantComp != 0) {

						// AQUI PEGUEI A QUANTIDADE DE PRODUTO QUE O USUARIO DESEJA COMPRAR E
						// MULTIPLIQUEI PELO PREÇO DO PRODUTO QUE ESTA NA LINHA 0 COLUNA 2 O RESULTADO
						// ARMAZENEI NA VARIAVEL preçoTotal.
						preçoTotal = quantComp * masc.getValor()[0][2];

						// AQUI PARA ATUALIZAR O NUMERO DE PRODUTO NO ESTOQUE PEGUEI A QUANTIDADE QUE O
						// USUARIO DESEJA COMPRAR É SUBTRAIR PELO QUANTIDADE ATUAL QUE TINHA NO ESTOQUE
						// QUE ESTA NA LINHA 0 COLUNA 0 É O RESULTADO AMAZENEI NA VARIAVEL quantEst.
						quantEst = masc.getValor()[0][0] - quantComp;

						// AQUI PARA SABER O CUSTO TOTAL DO PRODUTO PEGUEI O CUSTO UNITARIO DO PRODUTO
						// QUE ESTA NA LINHA 0 COLUNA 1 NA MATRIZ É MULTIPLIQUEI PELO VALOR QUE USUARIO
						// DESEJA COMPRAR É SALVEI NA VARIAVEL CUSTO.
						custo = masc.getValor()[0][1] * quantComp;

						// PARA SABER O LUCRO OBTIDO PEGUEI O PREÇO TOTAL DA COMPRAR E SUBTRAIR PELO
						// CUSTO TOTAL DO PRODUTO É SALVEI NA VARIAVEL LUCRO.
						lucro = preçoTotal - custo;

						// AQUI ESTOU INVOCANDO O CONTRUTOR DA MINHA CLASSE RELARORIO PARA ESTA SALVENDO
						// OS VALORES QUE OBTIVE ATRAVES DAS FUNÇÕES MATEMATICAS QUE REALIZEI E GRAVANDO
						// EM CADA VARIAVEL DECLARADAS NO PARAMENTRO DO CONSTRUTOr FAZENDO UM CASH NAS
						// VARIAVEL DOUBLLE CONVERTANDO PARA INTEIRAS
						relatorio.setRelatorio(namePro, preçoTotal, (int) quantComp, (int) quantEst, lucro);

						// CHAMEI O METODO DA CLASSE BufferedWriter QUE ESTA REPRESENTADO PELO PELA
						// SIGLA "bw" QUE VAI ESCREVER NO ARQUIVO SELECIONA PELO USUARIO JA COM A
						// FORMATAÇÃO DO METODO toString() DA NOSSA CLASSE RELATORIO
						bw.write(relatorio.toString());

						// QUEBRA DE LINHA QUNADO A ESCRITA FOR REALIZADA
						bw.newLine();

						// VAI MOSTRAR AO USUARIO O REGISTRO DE COMPRA, VALOR TOTAL É QUANTIDADE
						// COMPRADA É PRODUTO.
						System.out.println(
								"Mascara Lisa \n" + "Unidades:" + quantComp + "\n" + "Preço total: R$ " + preçoTotal);

						// SE CASO USUARIO DIGITA ALGUM VALOR ACIMA DA QUANTIDADE QUE TENHA NO ESTOQUE
						// VAI MOSTRAR A MENSAGEM DESCRITA ABAIXO
					} else if (quantComp > masc.getValor()[0][0]) {

						// EXIBINDO UMA MESSAGEM NO CONSOLE PARA AJUDAR O USUARIO NA INTERAÇÃO COM
						// PROGRAMA
						System.out.println("NÃO HÁ PRODUTO NO ESTOQUE !!");

						// SE CASO CLIENTE DIGITAR ZERO O PROGRAMA VAI SOLICITAR QUE ENTRE ALGUM VALOR
						// ACIMA.
					} else if (quantComp == 0) {

						// EXIBINDO UMA MESSAGEM NO CONSOLE PARA AJUDAR O USUARIO NA INTERAÇÃO COM
						// PROGRAMA
						System.out.println("FAVOR DIGITAR VALOR ACIMA DE ZERO");
					}

					// A MESMA LOGICO QUE USEI PARA TESTA ESSE PRODUTO ESTOU ULTILIZANDO PARA OS
					// DEMAIS
					// PRODUTOS LEMBRANDO QUE SE CASO A PRIMEIRA CONDIÇÕA DAR TRUE AS DEMAIS NAO
					// SERAM TESTADAS, MAS SE CASO DAR FALSO IRA TESTAR A PROXIMA

				} else if (masc.getProduct()[1].equals(namePro)) {

					System.out.println("QUANTAS ?");

					quantComp = sc.nextDouble();

					if (quantComp <= masc.getValor()[1][0] && quantComp != 0) {

						preçoTotal = quantComp * masc.getValor()[1][2];
						quantEst = masc.getValor()[1][0] - quantComp;
						custo = masc.getValor()[1][1] * quantComp;
						lucro = preçoTotal - custo;

						relatorio.setRelatorio(namePro, preçoTotal, (int) quantComp, (int) quantEst, lucro);
						bw.write(relatorio.toString());
						bw.newLine();

						System.out.println("Mascara Estampada \n" + "Unidades:" + quantComp + "\n" + "Preço total: R$"
								+ preçoTotal);
					} else if (quantComp > masc.getValor()[1][0]) {
						System.out.println("NÃO HÁ PRODUTO NO ESTOQUE !!");
					} else if (quantComp == 0) {
						System.out.println("FAVOR DIGITAR VALOR ACIMA DE ZERO");
					}

				} else if (masc.getProduct()[2].equals(namePro)) {
					System.out.println("QUANTAS ?");
					quantComp = sc.nextDouble();

					if (quantComp <= masc.getValor()[2][0] && quantComp != 0) {
						preçoTotal = quantComp * masc.getValor()[2][2];

						quantEst = masc.getValor()[2][0] - quantComp;
						custo = masc.getValor()[2][1] * quantComp;
						lucro = preçoTotal - custo;

						relatorio.setRelatorio(namePro, preçoTotal, (int) quantComp, (int) quantEst, lucro);
						bw.write(relatorio.toString());
						bw.newLine();

						System.out.println(
								"Mascara Adulto \n" + "Unidades:" + quantComp + "\n" + "Preço total: R$" + preçoTotal);

					} else if (quantComp > masc.getValor()[2][0]) {
						System.out.println("NÃO HÁ PRODUTO NO ESTOQUE !!");
					} else if (quantComp == 0) {
						System.out.println("FAVOR DIGITAR VALOR ACIMA DE ZERO");
					}

				} else if (masc.getProduct()[3].equals(namePro)) {

					System.out.println("QUANTAS ?");
					quantComp = sc.nextDouble();

					if (quantComp <= masc.getValor()[3][0] && quantComp != 0) {

						preçoTotal = quantComp * masc.getValor()[3][2];
						quantEst = masc.getValor()[3][0] - quantComp;
						custo = masc.getValor()[3][1] * quantComp;
						lucro = preçoTotal - custo;

						relatorio.setRelatorio(namePro, preçoTotal, (int) quantComp, (int) quantEst, (int) lucro);

						bw.write(relatorio.toString());
						bw.newLine();

						System.out.println(
								"Mascara Infatil \n" + "Unidades:" + quantComp + "\n" + "Preço total: R$" + preçoTotal);
					} else if (quantComp > masc.getValor()[3][0]) {
						System.out.println("NÃO HÁ PRODUTO NO ESTOQUE !!");
					} else if (quantComp == 0) {
						System.out.println("FAVOR DIGITAR VALOR ACIMA DE ZERO");
					}
				}

				// AQUI, SE CASO O USUARIO DIGITA ALGUM PRODUTO QUE NAO DEMOS VAI MOSTRA A
				// MENSAGEM A BAIXO
				else {
					System.out.println("DIGITE ALGUM PRODUTO VALIDO!!");
				}
				// FIM DO CONDICONAMENTO GERAL DE TESTE DE PRODUTO É COMPRAR É REGISTRO DE
				// PRODUTO

				// SE CASO CLIENTE QUISER COMPRAR MAIS PRODUTO VAI MOSTRA ESSA INFORMAÇÃO
				System.out.println("DESEJA COMPRAR MAIS MASCARA ?");

				// SE CASO CLIENTE DIGITAR "S" VAI CAIR NOVAMENTO NO MESMO PROCESSO MAS SE CASO
				// DIGITAR "N" O METODO WHILE VAI SER FINALIZADO
				resp = sc.next().charAt(0);

			}

			// MENSAGEM DE AGRADECIMENTO PELA COMPRA EM NOSSA LOJA
			System.out.println("OBRIGADO POR COMPRAR CONOSCO !!");

			// TRATAMENTO DE EXCEÇÃO SE CASO OCORRER ALGUM ERRO NA HORA DE ESCREVER O
			// ARQUIVO VAI MOSTRA A MENSAGEM PADRÃO DA CLASSE IOException
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		// FECHAMENTO DO SCANNER
		sc.close();
	}
}
