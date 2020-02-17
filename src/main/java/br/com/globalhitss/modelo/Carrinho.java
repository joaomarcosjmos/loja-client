package br.com.globalhitss.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

public class Carrinho {

	private List<Produto> produtos = new ArrayList<Produto>();
	private String rua;
	private String cidade;
	private long id;

	public Carrinho adiciona(Produto produto) {
		produtos.add(produto);
		return this;
	}

	public Carrinho para(String rua, String cidade) {
		this.rua = rua;
		this.cidade = cidade;
		return this;
	}

	public Carrinho setId(long id) {
		this.id = id;
		return this;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public long getId() {
		return id;
	}
	
	public void remove(long id) {
		for (Iterator iterator = produtos.iterator(); iterator.hasNext();) {
			Produto produto = (Produto) iterator.next();
			if(produto.getCodigo() == id) {
				iterator.remove();
			}
		}
	}
	
	public void troca(Produto produto) {
		remove(produto.getCodigo());
		adiciona(produto);
	}

	public void trocaQuantidade(Produto produto) {
		for (Iterator iterator = produtos.iterator(); iterator.hasNext();) {
			Produto p = (Produto) iterator.next();
			if(p.getCodigo() == produto.getCodigo()) {
				p.setQuantidade(produto.getQuantidade());
				return;
			}
		}
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

}
