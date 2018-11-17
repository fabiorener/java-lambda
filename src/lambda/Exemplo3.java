package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exemplo3 {

	/*
	 * Além de escrever funções lambda, também é possível criar métodos que as recebam como parâmetro,
	 * o que é bastante útil e pode tornar um método bastante flexível. 
	 * 
	 * Por exemplo, podemos criar um método genérico para imprimir elementos de uma lista, 
	 * mas passamos como parâmetro a função para a filtragem dos elementos dessa lista, assim, 
	 * com apenas um método, e passando a função como parâmetro, é possível fazer a filtragem da lista de várias maneiras diferentes
	 */
	
	public static void main(String[] args) {
		System.out.println("Cria a lista com os elementos que serão realizadas operações");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

		System.out.println("Imprime todos os números:");
		avaliaExpressao(list, (n)->true);

		System.out.println("Não imprime nenhum número:");
		avaliaExpressao(list, (n)->false);

		System.out.println("Imprime apenas número pares:");
		avaliaExpressao(list, (n)-> n%2 == 0 );

		System.out.println("Imprime apenas números impares:");
		avaliaExpressao(list, (n)-> n%2 == 1 );

		System.out.println("Imprime apenas números maiores que 5:");
		avaliaExpressao(list, (n)-> n > 5 );

		System.out.println("Imprime apenas números maiores que 5 e menores que 10:");
		avaliaExpressao(list, (n)-> n > 5 && n < 10);

	}

	public static void avaliaExpressao(List<Integer> list, Predicate<Integer> predicate) {
		list.forEach(n -> {
			if(predicate.test(n)) {
				System.out.println(n + " ");
			}
		});
	}
}
