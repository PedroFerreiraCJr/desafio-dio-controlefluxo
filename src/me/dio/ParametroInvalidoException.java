package me.dio;

public class ParametroInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;

	public ParametroInvalidoException() {
		super("O segundo par�metro deve ser maior que o primeiro par�metro");
	}
}
