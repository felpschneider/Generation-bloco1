programa
{
	inclua biblioteca Matematica --> mat
	inclua biblioteca Util
	/* 	Exercício 3.a e 3.b - Matrizes 
	 * 	Autor: Felipe Schneider - Turma 54 de Java da Generation
	 * 	Data: 01/06/2022 - 19h45
	 */	
	funcao inicio()
	{
		real N1 [4][6]
		real N2 [4][6]
		inteiro M1 [4][6]
		real M2 [4][6]

		escreva("Situação 3.a:\n")
		
		para(inteiro i = 0; i < Util.numero_linhas(N1); i++){
			para(inteiro j = 0; j < Util.numero_colunas(N1); j++){
				
				N1[i][j] = Util.sorteia(0, 10)				
				N2[i][j] = Util.sorteia(0, 10)
				
				M1 [i][j]= N1[i][j] + N2[i][j]
				
				M2 [i][j]= mat.arredondar((N1[i][j] - N2[i][j]), 1)
				
				
				escreva(M1[i][j] + " | ")
			}
			escreva("\n")
		}

		escreva("\nSituação 3.b:\n")
		
		para(inteiro k = 0; k < Util.numero_linhas(M2); k++){
			para(inteiro l = 0; l < Util.numero_colunas(M2); l++){
               	escreva(M2[k][l] + " | ")
        }
			escreva("\n")
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 98; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 11, 7, 2}-{N2, 12, 7, 2}-{M2, 14, 7, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */