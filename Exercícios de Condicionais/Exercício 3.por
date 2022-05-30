programa
{
	inclua biblioteca Matematica --> mat
/*	Exercício 2 - Laços condicionais 
 * 	Autor: Felipe Schneider - Turma 54 de Java - Generation
 * 	Data: 30/05/2022
 * 	
 *	Desenvolva um sistema em que:
 * Leia 4 (quatro) números;
 * Calcule o quadrado de cada um;
 * Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
 * Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */	
	funcao inicio()
	{
		real numero1, numero2, numero3, numero4
		
		escreva("Olá, digite um número: ")
		leia(numero1)

		escreva("\nDigite outro número: ")
		leia(numero2)

		escreva("\nDigite mais outro: ")
		leia(numero3)

		escreva("\nDigite o último número: ")
		leia(numero4)

		real potNumero1 = mat.potencia(numero1, 2.0)
		real potNumero2 = mat.potencia(numero2, 2.0)
		real potNumero3 = mat.potencia(numero3, 2.0)
		real potNumero4 = mat.potencia(numero4, 2.0)

		se (potNumero3 >= 1000){
			escreva("\nValor inserido: " + numero3 + " potência quadrada do número: " + potNumero3)
		}
		senao{
			escreva("\nValor inserido: " + numero1 + " potência quadrada do número: " + potNumero1)
			escreva("\nValor inserido: " + numero2 + " potência quadrada do número: " + potNumero2)
			escreva("\nValor inserido: " + numero3 + " potência quadrada do número: " + potNumero3)
			escreva("\nValor inserido: " + numero4 + " potência quadrada do número: " + potNumero4)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */