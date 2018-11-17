package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class Exemplo4 {

	/*
	 * https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
	 * http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html
	 */
	
	public static void main(String [] a)  {

		System.out.println("Cria a lista com os elementos que serão realizadas operações");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);        
		System.out.println("Multiplica todos os elementos da lista por 5:");
		realizaOperacao(list, (n)-> n * 5);

		System.out.println("Calcula o quadrado de todos os elementos da lista:");
		realizaOperacao(list, (n)-> n * n);


		System.out.println("Soma 3 em todos os elementos da lista:");
		realizaOperacao(list, (n)-> n + 3);

		System.out.println("Coloca 0 em todos os elementos da lista:");
		realizaOperacao(list, (n)-> 0);

	}

	public static void realizaOperacao(List<Integer> list, IntFunction<Integer> function) {
		list.forEach(n -> {
			n = function.apply(n);
			System.out.println(n + " ");
		});
	}

}
