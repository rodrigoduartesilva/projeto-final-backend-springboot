package com.projetofinal.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetofinal.backend.entities.Produto;
import com.projetofinal.backend.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> procuraTodosProdutos(){
		return repository.findAll();
	}
	
	public Produto procuraProdutoPorId(Integer id) {
		return repository.findById(id).get();
	}
	
	public String adicionaProduto(Produto produto) {
		repository.save(produto);
		return "Produto adicionado com sucesso.";
	}
	
	public String editarProduto(Integer id, Produto produto) {
		Produto response = repository.findById(id).get();
		
		response.setNomeProduto(produto.getNomeProduto());
		response.setTipoProduto(produto.getTipoProduto());
		response.setQuantidade(produto.getQuantidade());
		response.setPreco(produto.getPreco());
		
		repository.save(response);
		return "Produto editado com sucesso.";
	}
	
	public void excluirProduto(Integer id) {
		Produto response = repository.findById(id).get();
		repository.delete(response);
	}
}