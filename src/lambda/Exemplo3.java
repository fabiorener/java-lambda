package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exemplo3 {

	/*
	 * Al�m de escrever fun��es lambda, tamb�m � poss�vel criar m�todos que as recebam como par�metro,
	 * o que � bastante �til e pode tornar um m�todo bastante flex�vel. 
	 * 
	 * Por exemplo, podemos criar um m�todo gen�rico para imprimir elementos de uma lista, 
	 * mas passamos como par�metro a fun��o para a filtragem dos elementos dessa lista, assim, 
	 * com apenas um m�todo, e passando a fun��o como par�metro, � poss�vel fazer a filtragem da lista de v�rias maneiras diferentes
	 */
	
	public static void main(String[] args) {
		System.out.println("Cria a lista com os elementos que ser�o realizadas opera��es");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

		System.out.println("Imprime todos os n�meros:");
		avaliaExpressao(list, (n)->true);

		System.out.println("N�o imprime nenhum n�mero:");
		avaliaExpressao(list, (n)->false);

		System.out.println("Imprime apenas n�mero pares:");
		avaliaExpressao(list, (n)-> n%2 == 0 );

		System.out.println("Imprime apenas n�meros impares:");
		avaliaExpressao(list, (n)-> n%2 == 1 );

		System.out.println("Imprime apenas n�meros maiores que 5:");
		avaliaExpressao(list, (n)-> n > 5 );

		System.out.println("Imprime apenas n�meros maiores que 5 e menores que 10:");
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
