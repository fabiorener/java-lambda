package lambda;

public class Exemplo1 {

	
	/*
	 * Simplificando um pouco a defini��o, uma fun��o lambda � uma fun��o sem declara��o,
	 * isto �, n�o � necess�rio colocar um nome, um tipo de retorno e o modificador de acesso.
	 * 
	 * A ideia � que o m�todo seja declarado no mesmo lugar em que ser� usado.
	 * As fun��es lambda em Java tem a sintaxe definida como (argumento) -> (corpo)
	 * 
	 * Uma fun��o lambda pode ter nenhum ou v�rios par�metros e seus tipos podem ser colocados ou podem ser omitidos,
	 * dessa forma, eles s�o inferidos pelo Java
	 * 
	 * A fun��o lambda pode ter nenhum ou v�rios comandos:
	 *  
	 * se a mesma tiver apenas um comando as chaves, n�o s�o obrigat�rias e a fun��o retorna o valor calculado na express�o; 
	 * se a fun��o tiver v�rios comandos, � necess�rio colocar as chaves e tamb�m o comando return - se nada for retornado, a fun��o tem um retorno void.
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
		Runnable l = () -> System.out.println("Thread com fun��o lambda!");
		new Thread(l).start();

	}

}
