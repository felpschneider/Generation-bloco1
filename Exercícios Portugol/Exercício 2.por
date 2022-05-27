programa
{
	
	funcao inicio()
	{
		escreva("Vamos transformar sua idade em dias em anos, meses e dias?")
		escreva("\nDigite sua idade em dias: ")

		inteiro idadeDias
		leia(idadeDias)

		inteiro idadeAnos = idadeDias / 365

		inteiro idadeMeses = (idadeDias % 365) / 30

		idadeDias = idadeMeses % 30

		escreva("Sua idade em anos, meses e dias é: " + idadeAnos + ", "
		+ idadeMeses + " e " + idadeDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 403; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */