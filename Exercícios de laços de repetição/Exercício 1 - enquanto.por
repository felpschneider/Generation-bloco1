programa
{
	/* Exercício 1 - enquanto
	 * Autor: Felipe Schneider - Turma 54 de Java da Generation
	 * Data: 31/05/2022 - 14h03min
	 */
	funcao inicio()
	{
		inteiro numero1 = 0 
		inteiro numero2 = 0
		inteiro numero3 = 0

		real media = 0.0
		real totalValores = 0.0
		inteiro soma = 0
		
		enquanto (verdadeiro){
		
		escreva("Olá, digite um número: ")
		leia(numero1)
		se (numero1 < 0){
			pare
		}
		totalValores++

		escreva("\nDigite outro número: ")
		leia(numero2)
		se (numero2 < 0){
			pare
		}
		totalValores++

		escreva("\nDigite o último: ")
		leia(numero3)
		se (numero3 < 0){
			pare
		}
		totalValores++

		soma = numero1 + numero2 + numero3
		
		media = (numero1 + numero2 + numero3) / totalValores
		
		escreva("\nA média dos números é " + media + "\nA somatória é " + soma + 
		"\nE o total de valores lidos foram " + totalValores + "\n\n")
		}

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */