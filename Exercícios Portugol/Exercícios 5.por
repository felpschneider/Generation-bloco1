programa
{
	
	funcao inicio()
	{
		escreva("Olá, vamos descobrir a média de um aluno!")
		
		escreva("\nEscreva a primeira nota: ")

		real nota1 
		leia(nota1)

		escreva("\nEscreva a segunda nota: ")

		real nota2
		leia(nota2)

		escreva("\nEscreva a terceira nota: ")

		real nota3 
		leia(nota3)

		real media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5)
		
		escreva("\nA média do aluno foi " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */