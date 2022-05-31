programa
{
	inclua biblioteca Matematica
	
	/* Exercício 1 - Pesquisa da prefeitura
	 * Autor: Felipe Schneider - Turma 54 de Java da Generation
	 * Data: 31/05/2022 - 11h58min
	 */
	funcao inicio()
	{
		real salarioPopulacao = 0.0
		real salarioMedia = 0.0
		inteiro salarioContador = 0
		inteiro salarioPercentual = 0
		real salarioMaisAlto = 0.0

		inteiro qtdPopulacao = 20

		inteiro filhosPopulacao  = 0
		real filhosMedia = 0.0

		para (inteiro i = 0; i < qtdPopulacao; i++){
			escreva("\nPesquisa da prefeitura, responda a essas perguntas:")

			escreva("\nQuantos filhos você tem?\n")
			leia(filhosPopulacao)
			filhosMedia += filhosPopulacao 


			escreva("\nQuanto você recebe?\n")
			leia(salarioPopulacao)
			salarioMedia += salarioPopulacao

			se (salarioPopulacao <= 100){
				salarioContador++
			}

			se (salarioPopulacao > salarioMaisAlto){
				salarioMaisAlto = salarioPopulacao
			}
			
			
		}
		
		filhosMedia = filhosMedia / qtdPopulacao
		
		
		salarioPercentual = salarioContador / qtdPopulacao * 100

		salarioMedia = salarioMedia / qtdPopulacao

		escreva("\nA média salarial da população é de R$ " + salarioMedia)

		escreva("\nA média do número de filhos da população é de " + 
		Matematica.arredondar(filhosMedia, 2))

		escreva("\nO maior salário da cidade é R$ " + salarioMaisAlto)

		escreva("\nE o percentual de pessoas com salário de até R$ 100,00 é " + 
		salarioPercentual + "%\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 83; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */