programa
{
	
	funcao inicio()
	{
		escreva("Vamos descobrir quanto tempo em segundos durou o evento?")
		escreva("\nDigite a duração do evento em segundos: ")

		inteiro segundos
		leia(segundos)

		inteiro minutos = segundos / 60

		inteiro horas = minutos / 60

		minutos = minutos % 60

		segundos = segundos % 60

		escreva("O evento na da fábrica durou: " + horas + " horas, "
		+ minutos + " minutos e " + segundos + " segundos")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */