package br.com.project.petshop.view;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import net.java.dev.designgridlayout.DesignGridLayout;
import br.com.project.petshop.exception.ExceptionLogger;
import br.com.project.petshop.utility.Constantes;
import br.com.project.petshop.utility.Util;

abstract class TelaBase extends JFrame implements WindowListener {

	private static final long serialVersionUID = -8931872466017403636L;

	protected DesignGridLayout gridLayout = new DesignGridLayout(this);

	/**
	 * 
	 * @param telaTitulo
	 */
	public TelaBase(final String telaTitulo) {
		super(telaTitulo);

		inicializar();
		montarTela();

		setVisible(true);
	}

	/**
	 * Inicializa os componentes da tela.
	 * 
	 * Este metodo deve ser overriding por cada classe filha,
	 */
	protected void inicializar() {
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(this);

		try {

			setIconImage(ImageIO.read(new File(Constantes.PATH_BACKGROUND)));

		} catch (final IOException e) {
			ExceptionLogger.logger(e);
		}

		final int width = Util.getWidthScreen() / 2 - Constantes.TELA_WIDTH / 2;
		final int height = Util.getHeightScreen() / 2 - Constantes.TELA_HEIGHT / 2;

		setBounds(width, height, Constantes.TELA_WIDTH, Constantes.TELA_HEIGHT);
	}

	protected JLabel label(final String text) {
		return new JLabel(text);
	}

	protected void navegarPara(final Class<? extends JFrame> tela, final String tituloTela) {

		try {

			final Constructor<?> constructor = tela.getConstructor(String.class);
			constructor.newInstance(tituloTela);

		} catch (final InstantiationException e) {
			ExceptionLogger.logger(e);

		} catch (final IllegalAccessException e) {
			ExceptionLogger.logger(e);

		} catch (final IllegalArgumentException e) {
			ExceptionLogger.logger(e);

		} catch (final InvocationTargetException e) {
			ExceptionLogger.logger(e);

		} catch (final NoSuchMethodException e) {
			ExceptionLogger.logger(e);

		} catch (final SecurityException e) {
			ExceptionLogger.logger(e);
		}
	}

	protected void navegarPara(final Class<? extends JFrame> tela, final String tituloTela,
			final boolean fecharTelaAnterior) {

		try {

			if (fecharTelaAnterior) {
				fecharTela();
			}

			final Constructor<?> constructor = tela.getConstructor(String.class);
			constructor.newInstance(tituloTela);

		} catch (final InstantiationException e) {
			ExceptionLogger.logger(e);

		} catch (final IllegalAccessException e) {
			ExceptionLogger.logger(e);

		} catch (final IllegalArgumentException e) {
			ExceptionLogger.logger(e);

		} catch (final InvocationTargetException e) {
			ExceptionLogger.logger(e);

		} catch (final NoSuchMethodException e) {
			ExceptionLogger.logger(e);

		} catch (final SecurityException e) {
			ExceptionLogger.logger(e);
		}
	}

	protected void fecharTela() {
		dispose();
	}

	protected void fecharPrograma() {
		System.exit(0);
	}

	protected abstract void montarTela();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowActivated(final WindowEvent event) {
		// Intencionalmente vazio.

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosed(final WindowEvent event) {
		// Intencionalmente vazio.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosing(final WindowEvent event) {

		if (this instanceof TelaPricinpal) {
			fecharPrograma();

		} else {
			fecharTela();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent
	 * )
	 */
	@Override
	public void windowDeactivated(final WindowEvent event) {
		// Intencionalmente vazio.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent
	 * )
	 */
	@Override
	public void windowDeiconified(final WindowEvent event) {
		// Intencionalmente vazio.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowIconified(final WindowEvent event) {
		// Intencionalmente vazio.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowOpened(final WindowEvent event) {
		// Intencionalmente vazio.
	}
}
