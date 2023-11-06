//Nesse pacote será implementado a regra de negocio da aplicação.

package com.projetofinal.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetofinal.backend.entities.Funcionario;
import com.projetofinal.backend.repositories.FuncionarioRepository;

@Service //Serve para informar que essa classe será o service da aplicação
public class FuncionarioService {

	@Autowired //Informa que será realizado a injeção de dependencias vindo da classe FuncionarioRepository
	private FuncionarioRepository repository;
	
	//Metodo GET que retorna todos os funcionarios da busca de acordo com a URL informada dentro do Postman
	public List<Funcionario> procuraTodosFuncionarios(){
		return repository.findAll();
	}
	
	//Get By Id - retorna um funcionario especifico de acordo com a id informada na URL.
	public Funcionario procuraFuncionarioPorId(Integer id) {
		return repository.findById(id).get();
	}
	
	//Metodo POST - adiciona um funcionario de acordo com os dados passados no corpo da requisição.
	public String adicionaFuncionario(Funcionario funcionario) {
		repository.save(funcionario);
		return "Funcionário adicionado com sucesso.";
	}
	
	//Metodo PUT - edita os dados de um funcionario ja cadastrado dentro da aplicação.
	public String editarFuncionario(Integer id, Funcionario funcionario) {
		Funcionario response = repository.findById(id).get();
		
		response.setNome(funcionario.getNome());
		response.setEmail(funcionario.getEmail());
		response.setSenha(funcionario.getSenha());
		response.setSetor(funcionario.getSetor());
		
		repository.save(response);
		return "Funcionário editado com sucesso.";
	}
	
	//Deleta um funcionario da aplicação de acordo com uma id informada na URL.
	public void excluirFuncionario(Integer id) {
		Funcionario response = repository.findById(id).get();
		repository.delete(response);
	}
}