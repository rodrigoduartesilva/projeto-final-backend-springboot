package com.projetofinal.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetofinal.backend.entities.Funcionario;
import com.projetofinal.backend.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;
	
	public List<Funcionario> procuraTodosFuncionarios(){
		return repository.findAll();
	}
	
	public Funcionario procuraFuncionarioPorId(Integer id) {
		return repository.findById(id).get();
	}
	
	public String adicionaFuncionario(Funcionario funcionario) {
		repository.save(funcionario);
		return "Funcionário adicionado com sucesso.";
	}
	
	public String editarFuncionario(Integer id, Funcionario funcionario) {
		Funcionario response = repository.findById(id).get();
		
		response.setNome(funcionario.getNome());
		response.setEmail(funcionario.getEmail());
		response.setSenha(funcionario.getSenha());
		response.setSetor(funcionario.getSetor());
		
		repository.save(response);
		return "Funcionário editado com sucesso.";
	}
	
	public void excluirFuncionario(Integer id) {
		Funcionario response = repository.findById(id).get();
		repository.delete(response);
	}
}