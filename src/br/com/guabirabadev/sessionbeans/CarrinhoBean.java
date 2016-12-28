package br.com.guabirabadev.sessionbeans;

import java.util.HashSet;
import java.util.Set;

public class CarrinhoBean {

	private Set<String> produtos = new HashSet<String>();
	
	public void adiciona(String produto){
		this.produtos.add(produto);
	}
	
	public void remove(String produto){
		this.remove(produto);
	}
	
	public Set<String> getProdutos(){
		return produtos;
	}
}
