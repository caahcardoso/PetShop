package br.com.project.petshop.model;

public class Endereco {

	private String rua;
	private String numero;
	private String pontoReferencia;
	private String bairro;
	private String cidade;
	private String cep;
	private String estado;
	private String pais;

	public Endereco() {

	}

	/**
	 * @return the rua
	 */
	public final String getRua() {
		return rua;
	}

	/**
	 * @param rua
	 *            the rua to set
	 */
	public final void setRua(final String rua) {
		this.rua = rua;
	}

	/**
	 * @return the numero
	 */
	public final String getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public final void setNumero(final String numero) {
		this.numero = numero;
	}

	/**
	 * @return the pontoReferencia
	 */
	public final String getPontoReferencia() {
		return pontoReferencia;
	}

	/**
	 * @param pontoReferencia
	 *            the pontoReferencia to set
	 */
	public final void setPontoReferencia(final String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	/**
	 * @return the bairro
	 */
	public final String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro
	 *            the bairro to set
	 */
	public final void setBairro(final String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the cidade
	 */
	public final String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade
	 *            the cidade to set
	 */
	public final void setCidade(final String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the cep
	 */
	public final String getCep() {
		return cep;
	}

	/**
	 * @param cep
	 *            the cep to set
	 */
	public final void setCep(final String cep) {
		this.cep = cep;
	}

	/**
	 * @return the estado
	 */
	public final String getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public final void setEstado(final String estado) {
		this.estado = estado;
	}

	/**
	 * @return the pais
	 */
	public final String getPais() {
		return pais;
	}

	/**
	 * @param pais
	 *            the pais to set
	 */
	public final void setPais(final String pais) {
		this.pais = pais;
	}
}
