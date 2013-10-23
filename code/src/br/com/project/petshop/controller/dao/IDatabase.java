package br.com.project.petshop.controller.dao;

interface IDatabase<T> {

	/**
	 * 
	 * @return
	 */
	T selecionarPorId();

	/**
	 * 
	 * @return
	 */
	T selecionarTodos();

	/**
	 * 
	 * @param entity
	 * @return
	 */
	boolean inserir(T entity);

	/**
	 * 
	 * @param entity
	 * @return
	 */
	boolean atualizar(T entity);

	/**
	 * 
	 * @param entity
	 * @return
	 */
	boolean deletar(T entity);
}
