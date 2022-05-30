programa
{
/*	Exercício 5 - índice de poluição
 * 	Autor: Felipe Schneider - Turma 54 de Java da Generation
 * 	Data: 30/05/2022 - 15h12min
 */
	funcao inicio()
	{
		escreva("Análise do índice de poluição")
		
		escreva("\nDigite o índice de poluição da empresa: ")
		real indice
		leia(indice)

		se (indice < 0.25){
			escreva("\nÍndice dentro dos parâmetros aceitáveis!")
		}
		senao se (indice >= 0.3 e indice < 0.4){
			escreva("\nÍndice fora dos parâmetros, empresas do grupo 1 devem suspender " +
			"suas atividades!")
		}
		senao se (indice >= 0.4 e indice < 0.5){
			escreva("\nÍndice fora dos parâmetros, empresas dos grupos 1 e 2 devem suspender" +
			" suas atividades!")
		}
		senao se (indice >= 0.5){
			escreva("\nÍndice fora dos parâmetros, empresas de todos os grupos devem suspender" +
			" suas atividades!")
		}
		senao {
			escreva("\nÍndice com parâmetros não especificados!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */