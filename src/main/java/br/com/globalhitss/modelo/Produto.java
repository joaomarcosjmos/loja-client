package br.com.globalhitss.modelo;


public class Produto {

	private double preco;
	private long codigo;
	private String nome;
	private int quantidade;
	
	public Produto(long id, String nome, double preco, int quantidade) {
		this.codigo = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getPrecoTotal() {
		return quantidade * preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
