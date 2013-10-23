package br.com.project.petshop.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import net.java.dev.designgridlayout.Tag;

public class TelaCadastroCliente extends TelaBase implements ActionListener {

	private static final long serialVersionUID = 3886230101752803501L;

	private static final String BOTAO_CANCELAR = "botao_cancelar";
	private static final String BOTAO_CADASTRO = "botao_cadastro";

	// Campos cliente.
	private JTextField nomeCampo;
	private JTextField mailCampo;
	private JTextField rgCampo;
	private JTextField cpfCampo;

	// Campos endereço.
	private JTextField ruaCampo;
	private JTextField numeroCampo;
	private JTextField complementoCampo;
	private JTextField bairroCampo;
	private JTextField cidadeCampo;
	private JTextField cepCampo;

	private JButton cancelarBotao;
	private JButton cadastrarBotao;

	public TelaCadastroCliente(final String telaTitulo) {
		super(telaTitulo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.project.petshop.view.TelaBase#init()
	 */
	@Override
	protected void inicializar() {
		super.inicializar();

		nomeCampo = new JTextField(15);
		nomeCampo.setToolTipText("Nome");

		mailCampo = new JTextField(15);
		mailCampo.setToolTipText("E-Mail");

		rgCampo = new JTextField(15);
		rgCampo.setToolTipText("RG");

		cpfCampo = new JTextField(15);
		cpfCampo.setToolTipText("CPF");

		ruaCampo = new JTextField(15);
		ruaCampo.setToolTipText("Rua");

		numeroCampo = new JTextField(15);
		numeroCampo.setToolTipText("Numero");

		complementoCampo = new JTextField(15);
		complementoCampo.setToolTipText("Complemento");

		bairroCampo = new JTextField(15);
		bairroCampo.setToolTipText("Bairro");

		cidadeCampo = new JTextField(15);
		cidadeCampo.setToolTipText("Cidade");

		cepCampo = new JTextField(15);
		cepCampo.setToolTipText("Cep");

		cancelarBotao = new JButton("Cancelar");
		cancelarBotao.setActionCommand(BOTAO_CANCELAR);
		cancelarBotao.addActionListener(this);

		cadastrarBotao = new JButton("Cadastrar");
		cadastrarBotao.setActionCommand(BOTAO_CADASTRO);
		cadastrarBotao.addActionListener(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.project.petshop.view.TelaBase#montarTela()
	 */
	@Override
	protected void montarTela() {
		gridLayout.row().center().add(label("Cadastro"));
		gridLayout.row().center().fill().add(new JSeparator());
		gridLayout.emptyRow();

		gridLayout.row().grid(label("Nome:")).add(nomeCampo).empty(2);
		gridLayout.row().grid(label("E-Mail:")).add(mailCampo).empty(2);
		gridLayout.row().grid(label("RG:")).add(rgCampo).empty(7);
		gridLayout.row().grid(label("CPF:")).add(cpfCampo).empty(7);
		gridLayout.emptyRow();

		gridLayout.row().center().add(label("Endereço"));
		gridLayout.row().center().fill().add(new JSeparator());
		gridLayout.emptyRow();

		gridLayout.row().grid(label("Rua:")).add(ruaCampo).empty();
		gridLayout.row().grid(label("Numero:")).add(numeroCampo).empty(15);
		gridLayout.row().grid(label("Complemento:")).add(complementoCampo).empty(2);
		gridLayout.row().grid(label("Bairro:")).add(bairroCampo).empty(5);
		gridLayout.row().grid(label("Cidade:")).add(cidadeCampo).empty(5);
		gridLayout.row().grid(label("Cep:")).add(cepCampo).empty(7);
		gridLayout.emptyRow();

		gridLayout.row().bar().add(cancelarBotao, Tag.CANCEL).add(cadastrarBotao, Tag.OK);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(final ActionEvent event) {

		if (event.getActionCommand().equals(BOTAO_CADASTRO)) {

		} else if (event.getActionCommand().equals(BOTAO_CANCELAR)) {
			fecharTela();
		}
	}
}
