programa
{
/*	Exercício 2 - Laços condicionais 
 * 	Autor: Felipe Schneider - Turma 54 de Java - Generation
 * 	Data: 30/05/2022
 * 	
 *	Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
 *	horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
 *	por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
 *	armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
 *	trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
 *	excedente.
 */

	funcao inicio()
	{
		escreva("Calculadora de horas trabalhadas")
		
		inteiro C, N, E, salario

		escreva("\nQual é o código do operário?\n")
		leia(C)

		escreva("\nQuantas horas ele trabalhou??\n")
		leia(N)

		se (N <= 50)
		{
			salario = N * 10
			escreva("O operário trabalhou " + N + " horas e seu salário foi de R$" + salario + 
			" e seu excedente foi R$ 0,00")
		}
		senao {
			E = N - 50
			N = N - E

			E = E * 20
			N = N * 10

			salario = N + E

			escreva("O operário teve um salário de R$ " + N + " e seu salário excedente foi de R$" +
			E + " totalizando R$" + salario)
			
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 951; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */