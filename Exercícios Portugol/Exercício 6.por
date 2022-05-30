programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		escreva("Vamos calcular dois pontos em um plano cartesiano?")
		
		escreva("\nDigite o valor de x do ponto 1: ")
		real x1
		leia(x1)

		escreva("\nDigite o valor de y do ponto 1: ")
		real y1
		leia(y1)

		escreva("\nLegal! Agora digite o valor de x do ponto 2: ")
		real x2
		leia(x2)

		escreva("\nPor fim, digite o valor de y do ponto 2: ")
		real y2
		leia(y2)

		real calculo1 = mat.potencia((x2-x1), 2)
		real calculo2 = mat.potencia((y2-y1), 2)
		
		real resultado = mat.raiz((calculo1 - calculo2), 2)
		escreva("\nA distância entre os pontos (" + x1 + ", " + y1 + ") e (" + x2 + ", " + y2 + 
		") é de: " + mat.arredondar(resultado, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 694; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */