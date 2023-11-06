package com.projetofinal.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetofinal.backend.entities.Produto;
import com.projetofinal.backend.services.ProdutoService;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public List<Produto> procuProdutos() {
		return service.procuraTodosProdutos();
	}
	
	@GetMapping(value = "/{id}")
	public Produto procuraProdutoPorId(@PathVariable Integer id) {
		return service.procuraProdutoPorId(id);
	}
	
	@PostMapping
	public String adicionaProduto(@RequestBody Produto produto) {
		return service.adicionaProduto(produto);
	}
	
	@PutMapping(value = "/{id}")
	public String editarProduto(@PathVariable Integer id, @RequestBody Produto produto) {
		return service.editarProduto(id, produto);
	}
	
	@DeleteMapping(value = "/{id}")
	public void excluirProduto(@PathVariable Integer id) {
		service.excluirProduto(id);
	}
}