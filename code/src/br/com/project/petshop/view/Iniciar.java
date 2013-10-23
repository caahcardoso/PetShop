package br.com.project.petshop.view;

import java.awt.EventQueue;

import br.com.project.petshop.exception.ExceptionLogger;

class Iniciar {

	/**
	 * Abre a aplicação.
	 */
	public static void main(final String[] args) {

		EventQueue.invokeLater(new Runnable() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Runnable#run()
			 */
			@Override
			public void run() {

				try {

					new TelaAbertura("Pet Shop");

				} catch (final Exception e) {
					ExceptionLogger.logger(e);
				}
			}
		});
	}
}
