programa
{
	
	funcao inicio()
	{
		escreva("Olá! Digite sua idade em anos: ")
		inteiro idadeAnos
		leia(idadeAnos)

		escreva("\nLegal! Agora digite quantos meses: ")
		inteiro idadeMeses
		leia(idadeMeses)

		escreva("\nPara finalizar, diga quantos dias: ")
		inteiro idadeDias
		leia(idadeDias)

		inteiro resultadoAnos = idadeAnos * 365
		inteiro resultadoMeses = idadeMeses * 30

		inteiro resultadoFinal = resultadoAnos + resultadoMeses + idadeDias

		escreva("\nSua idade em dias é: " + resultadoFinal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 514; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */