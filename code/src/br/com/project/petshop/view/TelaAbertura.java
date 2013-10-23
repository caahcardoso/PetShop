package br.com.project.petshop.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import br.com.project.petshop.exception.ExceptionLogger;
import br.com.project.petshop.utility.Constantes;

public class TelaAbertura extends TelaBase implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7962885497103030984L;

	private JButton entrarBotao;

	private BufferedImage imagemLogo;

	/**
	 * 
	 * @param telaTitulo
	 */
	public TelaAbertura(final String telaTitulo) {
		super(telaTitulo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.project.petshop.view.TelaBase#inicializar()
	 */
	@Override
	protected void inicializar() {
		super.inicializar();

		entrarBotao = new JButton("Entrar");
		entrarBotao.addActionListener(this);

		try {

			imagemLogo = ImageIO.read(new File(Constantes.PATH_BACKGROUND));
			setIconImage(imagemLogo);

		} catch (final IOException e) {
			ExceptionLogger.logger(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.project.petshop.view.TelaBase#montarTela()
	 */
	@Override
	protected void montarTela() {
		gridLayout.row().center().add(new JLabel(new ImageIcon(imagemLogo)));

		gridLayout.row().center().add(entrarBotao);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(final ActionEvent event) {
		navegarPara(TelaPricinpal.class, "Pet Shop", true);
	}
}
