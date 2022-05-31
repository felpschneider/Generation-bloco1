programa
{
	/* Exercício 2 - Somar números ímpares e múltiplos de 3
	 * Autor: Felipe Schneider - Turma 54 de Java da Generation
	 * Data: 31/05/2022 - 12h28min
	 */
	funcao inicio()
	{
		inteiro somaNumeros = 0
		
		para (inteiro numero = 1; numero <= 500; numero++){
			se (numero % 3 == 0 e numero % 2 == 1){
				somaNumeros += numero
			}
		}
			escreva("\nA soma dos números é: " + somaNumeros)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 28; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */