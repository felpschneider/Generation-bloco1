programa
{
/*	Exercício 1 - Laços condicionais 
 * 	Autor: Felipe Schneider - Turma 54 de Java - Generation
 *	Data: 30/05/2022
 *	
 *	João, homem de bem, comprou um microcomputador para controlar o rendimento diário
 *	de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
 *	regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
 *	excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
 *	verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
 *	da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
 *	ZERO.
 */

	funcao inicio()
	{
		escreva("Calculadora de excessos de tomate de João")
		
		inteiro P, E, M

		escreva("\nQuantos quilos de tomate João trouxe hoje?\n")
		leia(P)

		E = P - 50
		M = E * 4

		se (P <= 50)
		{
			escreva("João não pagará multa de excesso! Multa: " + M + " Excesso: " + E)
		}
		senao {
			
			escreva("João pagará uma multa de excesso de R$ " + M + " pois levou " + E + "kg a mais")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 133; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */