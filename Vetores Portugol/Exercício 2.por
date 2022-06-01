programa
{
	inclua biblioteca Util
	/* Exercício 2 - Vetores 
	 * Autor: Felipe Schneider - Turma 54 de Java da Generation
	 * Data: 01/06/2022 - 16h
	 */	
	funcao inicio()
	{
		inteiro valorDados [10]
		real mediaDados = 0.0
		inteiro ocorrenciaDados = 0
		inteiro maiorPonto = 0
		
		escreva("Os dados estão rolando!")
		
		para(inteiro i = 0; i < Util.numero_elementos(valorDados); i++){
			valorDados[i] = Util.sorteia(1, 6)

			escreva("\nO dado " + (i + 1) + " caiu no número " + valorDados[i] + "\n")

			mediaDados += valorDados[i]

			se(valorDados[i] > maiorPonto){
				maiorPonto = valorDados[i]
			}
		}
		para(inteiro j = 0; j < Util.numero_elementos(valorDados); j++){
			se (valorDados[j] == maiorPonto){
				ocorrenciaDados++
			}
		}

		escreva("\nO maior valor que caiu foi " + maiorPonto + " tendo " + ocorrenciaDados + 
		" ocorrências")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 587; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {ocorrenciaDados, 12, 10, 15}-{valorDados, 10, 10, 10}-{maiorPonto, 13, 10, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */