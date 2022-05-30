programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		escreva("Vamos resolver equações lineares e descobrir os valores de x e y!")
		escreva("\nPara isso, você precisará informar 6 valores")
		
		escreva("\nEscreva o valor de a: ")
		real valorA
		leia(valorA)

		escreva("\nEscreva o valor de b: ")
		real valorB
		leia(valorB)

		escreva("\nEscreva o valor de c: ")
		real valorC
		leia(valorC)

		escreva("\nEscreva o valor de d: ")
		real valorD
		leia(valorD)

		escreva("\nEscreva o valor de e: ")
		real valorE
		leia(valorE)
		
		escreva("\nPor fim, escreva o valor de f: ")
		real valorF
		leia(valorF)

		real valorX = (valorC * valorE - valorB * valorF) / (valorA * valorE - valorB * valorD)

		real valorY = (valorA * valorF - valorC * valorD) / (valorA * valorE - valorB * valorD)

		escreva("\nOs valores de X e Y são: " + mat.arredondar(valorX, 2) + " e " 
		+ mat.arredondar(valorY, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 834; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */