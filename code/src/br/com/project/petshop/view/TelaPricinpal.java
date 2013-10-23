package br.com.project.petshop.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

import br.com.project.petshop.exception.ExceptionLogger;
import br.com.project.petshop.utility.Constantes;

public class TelaPricinpal extends TelaBase implements Runnable, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4176373314351813650L;

	// Menu Cadastro.
	private static final String CLIENTE = "cliente";
	private static final String VETERINARIO = "veterinario";
	private static final String PRODUTO = "produto";
	private static final String ANIMAL_VENDA = "animal_venda";
	private static final String ANIMAL_CLIENTE = "animal_cliente";
	private static final String SAIR = "sair";

	// Menu Ajuda
	private static final String SOBRE = "sobre";

	private final Thread thread;

	private JLabel horaCampo;
	private BufferedImage imagemLogo;

	private JMenuBar barraMenu;

	public TelaPricinpal(final String telaTitulo) {
		super(telaTitulo);

		thread = new Thread(this);
		thread.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.project.petshop.view.TelaBase#inicializar()
	 */
	@Override
	protected void inicializar() {
		super.inicializar();

		horaCampo = new JLabel();

		try {

			imagemLogo = ImageIO.read(new File(Constantes.PATH_BACKGROUND));
			setIconImage(imagemLogo);

		} catch (final IOException e) {
			ExceptionLogger.logger(e);
		}

		barraMenu = new JMenuBar();

		// Menu Cadastro.
		final JMenu menuCadastro = new JMenu("Cadastro");
		menuCadastro.setMnemonic(KeyEvent.VK_C);
		menuCadastro.addActionListener(this);

		// Sub items.
		final JMenuItem clienteMenuItem = new JMenuItem("Cliente");
		clienteMenuItem.setActionCommand(CLIENTE);
		clienteMenuItem.setMnemonic(KeyEvent.VK_C);
		clienteMenuItem.addActionListener(this);

		final JMenuItem veterinarioMenuItem = new JMenuItem("Veterinário");
		veterinarioMenuItem.setActionCommand(VETERINARIO);
		veterinarioMenuItem.setMnemonic(KeyEvent.VK_V);
		veterinarioMenuItem.addActionListener(this);

		final JMenuItem produtoMenuItem = new JMenuItem("Produto");
		produtoMenuItem.setActionCommand(PRODUTO);
		produtoMenuItem.setMnemonic(KeyEvent.VK_P);
		produtoMenuItem.addActionListener(this);

		final JMenuItem animalVendaMenuItem = new JMenuItem("Animal Venda");
		animalVendaMenuItem.setActionCommand(ANIMAL_VENDA);
		animalVendaMenuItem.addActionListener(this);

		final JMenuItem animalClienteMenuItem = new JMenuItem("Animal Cliente");
		animalClienteMenuItem.setActionCommand(ANIMAL_CLIENTE);
		animalClienteMenuItem.addActionListener(this);

		final JMenuItem sairMenuItem = new JMenuItem("Sair");
		sairMenuItem.setActionCommand(SAIR);
		sairMenuItem.setMnemonic(KeyEvent.VK_S);
		sairMenuItem.addActionListener(this);

		menuCadastro.add(clienteMenuItem);
		menuCadastro.add(new JSeparator());

		menuCadastro.add(produtoMenuItem);
		menuCadastro.add(new JSeparator());

		menuCadastro.add(animalVendaMenuItem);
		menuCadastro.add(new JSeparator());

		menuCadastro.add(animalClienteMenuItem);
		menuCadastro.add(new JSeparator());

		menuCadastro.add(sairMenuItem);

		// Menu Agenda
		final JMenu menuAgenda = new JMenu("Agenda");

		// Menu Veterinário
		final JMenu menuVeterinário = new JMenu("Veterinário");

		// Menu Ajuda
		final JMenu menuAjuda = new JMenu("Ajuda");

		// Sub items.
		final JMenuItem sobreMenuItem = new JMenuItem("Sobre");
		sobreMenuItem.setActionCommand(SOBRE);
		sobreMenuItem.addActionListener(this);

		menuAjuda.add(sobreMenuItem);

		// Adiciona na barra de menu.
		barraMenu.add(menuCadastro);
		barraMenu.add(menuAgenda);
		barraMenu.add(menuVeterinário);
		barraMenu.add(menuAjuda);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.project.petshop.view.TelaBase#montarTela()
	 */
	@Override
	protected void montarTela() {
		setJMenuBar(barraMenu);

		gridLayout.row().center().add(horaCampo);
		gridLayout.row().center().add(new JLabel(new ImageIcon(imagemLogo)));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(final ActionEvent event) {

		if (event.getActionCommand().equals(CLIENTE)) {
			navegarPara(TelaCadastroCliente.class, "Cadastro Cliente");

		} else if (event.getActionCommand().equals(VETERINARIO)) {
			navegarPara(TelaCadastroVeterinario.class, "Cadastro Veterinário");

		} else if (event.getActionCommand().equals(PRODUTO)) {
			navegarPara(TelaCadastroProduto.class, "Cadastro Produto");

		} else if (event.getActionCommand().equals(ANIMAL_VENDA)) {

		} else if (event.getActionCommand().equals(ANIMAL_CLIENTE)) {

		} else if (event.getActionCommand().equals(SAIR)) {
			fecharPrograma();

		} else if (event.getActionCommand().equals(SOBRE)) {
			JOptionPane.showMessageDialog(this, "Gracinha's Pet Shop");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		final SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");

		while (true) {
			horaCampo.setText(dateFormat.format(new Date()));

			try {

				Thread.sleep(1000);

			} catch (final InterruptedException e) {
				ExceptionLogger.logger(e);
			}
		}
	}
}
