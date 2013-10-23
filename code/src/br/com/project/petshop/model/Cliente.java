package br.com.project.petshop.model;

public class Cliente {

	private long id;
	private String nome;
	private String mail;
	private String rg;
	private String cpf;
	private Endereco endereco;

	public Cliente() {

	}

	/**
	 * @return the id
	 */
	public final long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId(final long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public final String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public final void setNome(final String nome) {
		this.nome = nome;
	}

	/**
	 * @return the mail
	 */
	public final String getMail() {
		return mail;
	}

	/**
	 * @param mail
	 *            the mail to set
	 */
	public final void setMail(final String mail) {
		this.mail = mail;
	}

	/**
	 * @return the rg
	 */
	public final String getRg() {
		return rg;
	}

	/**
	 * @param rg
	 *            the rg to set
	 */
	public final void setRg(final String rg) {
		this.rg = rg;
	}

	/**
	 * @return the cpf
	 */
	public final String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf
	 *            the cpf to set
	 */
	public final void setCpf(final String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the endereco
	 */
	public final Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public final void setEndereco(final Endereco endereco) {
		this.endereco = endereco;
	}
}
