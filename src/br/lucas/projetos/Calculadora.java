package br.lucas.projetos;

public class Calculadora {

	public static void main(String[] args) {
		boolean continua = true;
		do {
			String[] opcoes = { "Calcula soma",
					"Equa��o do segundo grau(Bhaskara).",
					"Calculadora Potencia��o", "Calculadora Raiz quadrada."};
			int escolha = Console.mostrarMenu(opcoes, null, null);

			switch (escolha) {
			case 1:
				calculadoraQuatroOperacoes();
				break;
			case 2:
				equacaoSegundoGrau();
				break;
			case 3:
				potenciacao();
				break;
			case 4:
				raizQuadrada();
				break;

			case -1:
				System.out.println("###################");
				System.out.println("Sistema finalizado.");
				System.out.println("###################");
				continua = false;
			}
			System.out.println("\n");
		} while (continua);
	}
	
	private static void calculadoraQuatroOperacoes() {
		int valor1 = Console
				.recuperaInteiro("Entre com o primeiro valor para o c�lculo:");
		int valor2 = Console
				.recuperaInteiro("Entre com o segundo valor para o c�lculo:");
		String operacao = "";
		char op = 0;
		boolean operacaoValida = false;
		do {
			operacao = Console
					.recuperaTexto("Entre com a opera��o pretendida (+, -, *, /:)");
			if (operacao.length() == 1) {
				op = operacao.charAt(0);
				if (op == Operadores.ADICAO || op == Operadores.SUBTRACAO
						|| op == Operadores.MULTIPLICACAO
						|| op == Operadores.DIVISAO) {
					operacaoValida = true;
				}
			}
		} while (!operacaoValida);
		double resultado = Operadores.realizarCalculo(valor1, valor2, op);
		System.out.println("Resultado da opera��o " + valor1 + " " + op + " "
				+ valor2 + " � igual a " + resultado + ".");
	}
	
	private static void equacaoSegundoGrau() {
		int valor1 = Console.recuperaInteiro("Entre com o elemento a da equa��o:");
		int valor2 = Console.recuperaInteiro("Entre com o elemento b da equa��o:");
		int valor3 = Console.recuperaInteiro("Entre com o elemento c da equa��o:");
		Operadores.bhaskara(valor1, valor2, valor3);
	}
	
	private static void potenciacao() {
		int valor1 = Console.recuperaInteiro("Entre com o valor:");
		int valor2 = Console.recuperaInteiro("Entre com o valor que sera elevado:");
		Operadores.potencia(valor1, valor2);
		
	}
	
	private static void raizQuadrada() {
		double valor1 = Console.recuperaDecimal("Entre com o valor:");
		
		Operadores.raizQuadrada(valor1);
	}

}
