package br.com.project.petshop.utility;

public final class Util {

	/**
	 * Construtor padr�o privado.
	 */
	private Util() {

	}

	public static int getWidthScreen() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
	}

	public static int getHeightScreen() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
	}
}
