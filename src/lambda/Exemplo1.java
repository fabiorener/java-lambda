package lambda;

public class Exemplo1 {

	
	/*
	 * Simplificando um pouco a definição, uma função lambda é uma função sem declaração,
	 * isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso.
	 * 
	 * A ideia é que o método seja declarado no mesmo lugar em que será usado.
	 * As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo)
	 * 
	 * Uma função lambda pode ter nenhum ou vários parâmetros e seus tipos podem ser colocados ou podem ser omitidos,
	 * dessa forma, eles são inferidos pelo Java
	 * 
	 * A função lambda pode ter nenhum ou vários comandos:
	 *  
	 * se a mesma tiver apenas um comando as chaves, não são obrigatórias e a função retorna o valor calculado na expressão; 
	 * se a função tiver vários comandos, é necessário colocar as chaves e também o comando return - se nada for retornado, a função tem um retorno void.
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//sem uso de lambda
		Runnable r = new Runnable() {
		     public void run() {
		          System.out.println("Thread com classer interna!");
		     }
		};
		new Thread(r).start();
		
		
		
		//com uso de lambda
		Runnable l = () -> System.out.println("Thread com função lambda!");
		new Thread(l).start();

	}

}
