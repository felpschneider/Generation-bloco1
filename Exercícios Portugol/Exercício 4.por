programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		escreva("Vamos fazer um cálculo, digite um número inteiro: ")

		inteiro A
		leia(A)

		escreva("\nDigite o segundo número inteiro: ")

		inteiro B
		leia(B)

		escreva("\nDigite o terceiro número inteiro: ")

		inteiro C
		leia(C)

		inteiro R = mat.potencia((A+B), 2)
		
		inteiro S = mat.potencia((B+C), 2)

		inteiro D = (R+S)/2

		escreva("\nO resultado da expressão é " + D)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 457; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */