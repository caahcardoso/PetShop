package br.com.project.petshop.exception;

public class ExceptionLogger {

	/**
	 * Construtor padrão privado.
	 */
	private ExceptionLogger() {

	}

	/**
	 * 
	 * @param message
	 */
	public static void logger(final String message) {
		System.out.println(message);
	}

	/**
	 * 
	 * @param e
	 */
	public static void logger(final Exception e) {
		System.out.println(e.getMessage());
	}

	/**
	 * 
	 * @param message
	 * @param e
	 */
	public static void logger(final String message, final Exception e) {
		System.out.println(message + "\n" + e.getMessage());
	}
}
