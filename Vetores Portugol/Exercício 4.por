programa
{
	inclua biblioteca Util
	/* 	Exercício 4- Matrizes 
	 * 	Autor: Felipe Schneider - Turma 54 de Java da Generation
	 * 	Data: 01/06/2022 - 20h41min
	 */
	funcao inicio()
	{
		inteiro N1 [4][6]
		inteiro M1 [4][6]

		para(inteiro i = 0; i < Util.numero_linhas(N1); i++){
			para(inteiro j = 0; j < Util.numero_colunas(N1); j++){

				escreva("Digite o valor da sua matriz na posição " + N1[i][j] + ": ")
				leia(N1[i][j])				

			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */