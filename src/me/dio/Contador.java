package me.dio;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		int parametro1 = lerInteiro(terminal, "Informe o primeiro valor inteiro: ");
		int parametro2 = lerInteiro(terminal, "Informe o segundo valor inteiro: ");

		try {
			executarContador(parametro1, parametro2);
		} catch (ParametroInvalidoException e) {
			System.out.println(e.getMessage());
		}

		terminal.close();
	}

	static int lerInteiro(Scanner terminal, String prompt) {
		int parametro = 0;
		boolean success = false;
		do {
			try {
				System.out.print(prompt);
				parametro = Integer.parseInt(terminal.next());
				success = true;
			} catch (NumberFormatException e) {
				success = false;
				System.out.println("Houve uma falha na leitura do valor. Por favor, tente novamente.");
			}
		} while (!success);

		return parametro;
	}

	static void executarContador(int valorInicial, int valorFinal) throws ParametroInvalidoException {
		if (valorInicial > valorFinal) {
			throw new ParametroInvalidoException();
		}

		int contador = valorFinal - valorInicial;
		for (int i = 0; i < contador; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
