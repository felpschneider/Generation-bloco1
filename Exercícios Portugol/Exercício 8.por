programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		escreva("Vamos descobrir o custo de um carro ao consumidor")
		
		escreva("\nPara isso, informe o preço de fábrica do carro: ")
		real precoFabrica
		leia(precoFabrica)

		real taxaDistribuidor = 0.23 * precoFabrica
		real impostos = 0.45 * precoFabrica


		real resultado = precoFabrica + taxaDistribuidor + impostos

		escreva("\nO preço do carro ao consumidor é de: " + resultado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {taxaDistribuidor, 14, 7, 16}-{impostos, 15, 7, 8}-{resultado, 18, 7, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */