programa
{
	/* Exercício 1 - Vetores 
	 * Autor: Felipe Schneider - Turma 54 de Java da Generation
	 * Data: 01/06/2022 - 14h
	 */
	funcao inicio()
	{
		real pontuacao[5]
		inteiro maiorPonto = 0

		para (inteiro i = 0; i < 5; i++){
			escreva("\nOlá, digite seu " + (i + 1) + "° ponto: ")
			leia(pontuacao[i])

			escreva("\nVocê digitou: " + pontuacao[i])
			escreva("\n")
			
			se(pontuacao[i] > maiorPonto){
				maiorPonto = pontuacao[i]
			}
		}

		escreva("\nA maior pontuação registrada foi: " + maiorPonto)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 128; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */