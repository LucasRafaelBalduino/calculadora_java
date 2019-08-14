package br.lucas.projetos;

/**
 * Classe responsavel pelas as operacoes da calculadora
 * @author lukas
 *
 */

public class Operadores {
	
	public static final char ADICAO = '+';

	public static final char SUBTRACAO = '-';

	public static final char MULTIPLICACAO = '*';

	public static final char DIVISAO = '/';

	/**
	 * Realiza operações matemáticas de acordo com a operação desejada.
	 * 
	 * @param valor1
	 * @param valor2
	 * @param operacao
	 * @return O resultado do cálculo.
	 */
	public static double realizarCalculo(int valor1, int valor2, char operacao) {
		switch (operacao) {
		case ADICAO:
			return valor1 + valor2;
		case SUBTRACAO:
			return valor1 - valor2;
		case MULTIPLICACAO:
			return valor1 * valor2;
		case DIVISAO:
			return valor1 / valor2;
		default:
			return -1;
		}
	}
	
	
	public static void bhaskara(double valor1, double valor2, double valor3) {
		
		double delta = Math.pow(valor2, 2) - 4 * valor1 * valor3;
		
		double raizDelta = Math.sqrt(delta);
		if (delta == 0) {
			double x1 = (valor2 * -1) / (2 * valor1);
			System.out.println("Duas raízes iguais: " + x1);
		}
		if (delta > 0) {
			double x1 = (valor2 * -1 + raizDelta) / (2 * valor1);
			double x2 = (valor2 * -1 - raizDelta) / (2 * valor1);
			System.out.println("Raiz x1: " + x1 + ".");
			System.out.println("Raiz x2: " + x2 + ".");
		}
		if (delta < 0) {
			System.out.println("Não há raízes reais.");
		}
	}
	
	public static void potencia(int valor1, int valor2) {
		
		
		int resultado = (int) Math.pow(valor1, valor2);
		System.out.println("O " + valor1 + " elevado a "+ valor2 + " potencia " + " é " +resultado);
	}
	
	public static void raizQuadrada(double valor1) {
		
		double resultado = Math.sqrt(valor1);
		
		System.out.println("A raiz quadrade de " + valor1 + " é: " +resultado);
		
	}
	

}
