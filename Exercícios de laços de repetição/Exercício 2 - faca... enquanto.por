programa
{
	/* Exercício 2 - Faça... enquanto 
	 * Autor: Felipe Schneider - Turma 54 de Java da Generation
	 * Data: 31/05/2022 - 14h40min
	 */
	funcao inicio()
	{
		inteiro numero = 0
		inteiro somatoria = 0
		
		escreva("Digite UM número: ")
		leia(numero)

		faca{
			somatoria = somatoria + numero
			numero-- 
		} enquanto(numero != 0)

		escreva ("Resultado: " + somatoria)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 139; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */