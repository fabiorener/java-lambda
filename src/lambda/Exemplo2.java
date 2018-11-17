package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Imprime todos os elementos da lista! sem lambda");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		for(Integer n: list) {
			System.out.println(n);
		}

		System.out.println("=====================================================");

		System.out.println("Imprime todos os elementos da lista! com lambda");
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		lista.forEach(n -> System.out.println(n));



		System.out.println("=====================================================");

		/*
		 * Dentro do código de uma função lambda é possível executar diversos comandos, como por exemplo abaixo,
		 * que antes de imprimir o número, verifica se ele é par ou ímpar: se for par o numero é impresso, caso contrário, nada é realizado.
		 *  
		 * Nesse exemplo é possível verificar que dentro de uma expressão lambda pode ser realizado qualquer tipo de operação.
		 */

		System.out.println("Imprime todos os elementos pares da lista!");
		List<Integer> pares = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		pares.forEach(n -> {
			if (n % 2 == 0) {
				System.out.println(n);
			}                   
		});

		System.out.println("=====================================================");

		System.out.println("Imprime o quadrado de todos os elementos da lista!");
		List<Integer> quadrados = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		quadrados.forEach(n -> System.out.println(n * n));




		System.out.println("=====================================================");

		/*
		 * Funções lambda podem ser utilizadas também para a ordenação de listas com a interface Comparator. 
		 * 
		 * Por exemplo, caso exista uma classe Pessoa com os atributos nome e idade e é necessário ordenar uma lista em ordem alfabética pelo nome, ou em ordem das idades,
		 * é necessário implementar dois comparators, um para cada tipo de parâmetro, e chamá-lo no método sort da lista que será ordenada.
		 */

		System.out.println("Ordenando pessoas pelo nome sem lambda:");
		List<Pessoa> listPessoas = Arrays.asList(new Pessoa("Eduardo", 29), new Pessoa("Luiz", 32), new Pessoa("Bruna", 26));
		Collections.sort(listPessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa pessoa1, Pessoa pessoa2){
				return pessoa1.getNome().compareTo(pessoa2.getNome());
			}
		});
		listPessoas.forEach(p -> System.out.println(p.getNome()));

		System.out.println("Ordenando pessoas pela idade sem lambda:");
		Collections.sort(listPessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa pessoa1, Pessoa pessoa2){
				return pessoa1.getIdade().compareTo(pessoa2.getIdade());
			}
		});
		listPessoas.forEach(p -> System.out.println(p.getNome()));


		System.out.println("=====================================================");


		List<Pessoa> listaPessoas = Arrays.asList(new Pessoa("Eduardo", 29), new Pessoa("Luiz", 32), new Pessoa("Bruna", 26));
		System.out.println("Ordenando pessoas pelo nome com lambda:");
		Collections.sort(listaPessoas, (Pessoa pessoa1, Pessoa pessoa2) -> pessoa1.getNome().compareTo(pessoa2.getNome()));
		listPessoas.forEach(p -> System.out.println(p.getNome()));
		System.out.println("Ordenando pessoas pela idade com lambda:");
		Collections.sort(listaPessoas, (Pessoa pessoa1, Pessoa pessoa2) -> pessoa1.getIdade().compareTo(pessoa2.getIdade()));
		listPessoas.forEach(p -> System.out.println(p.getNome()));
		
		System.out.println("=====================================================");
		
		/*
		 * Com expressões lambda também é possível filtrar elementos de uma coleção de objetos criando para isso um stream de dados (também um novo conceito do Java 8). 
		 * 
		 * É chamado o método filter do stream e como parâmetro para esse método é passado uma função lambda que faz o filtro dos elementos desejados.
		 */
		
		System.out.println("Filtros com Funções Lambda.");
		
		System.out.println("Pessoas com mais de 30 anos:");
		List<Pessoa> maioresTrinta = listPessoas.stream().filter(p -> p.getIdade() > 30).collect(Collectors.toList());
		maioresTrinta.forEach(p -> System.out.println(p.getNome()));
		      
		System.out.println("Pessoas que o nome iniciam com E:");
		List<Pessoa> nomesIniciadosE = listPessoas.stream().filter(p -> p.getNome().startsWith("E")).collect(Collectors.toList());
		nomesIniciadosE.forEach(p -> System.out.println(p.getNome()));
		

	}

}
