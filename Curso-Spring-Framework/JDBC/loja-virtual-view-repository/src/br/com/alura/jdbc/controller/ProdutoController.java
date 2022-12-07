package br.com.alura.jdbc.controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

public class ProdutoController {
	
	private ProdutoDAO produtoDAO;
	
	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.produtoDAO = new ProdutoDAO(connection);
	}

	public void deletar(Integer id) {
		System.out.println("Deletando produto");
		this.produtoDAO.deletar(id);
	}

	public void salvar(Produto produto) {
		System.out.println("Salvando produto");
		if(produto.getCategoriaId() == 0) {
			this.produtoDAO.salvar(produto);
			return;
		}
		this.produtoDAO.salvarComCategoria(produto);
	}

	public List<Produto> listar() {
		return this.produtoDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		System.out.println("Alterando produto");
		this.produtoDAO.alterar(nome, descricao, id);
	}
}
