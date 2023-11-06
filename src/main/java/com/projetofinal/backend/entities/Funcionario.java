//No pacote "entities" é onde serão criadas as classes que representam as entidades do banco de dados.

package com.projetofinal.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//As annotations do Spring JPA (marcadas pelo sinal de @) servem para fazer a ligação entre a classe e a 
//tabela do banco de dados. É importante lembrar que a classe e a tabela terão o mesmo nome.

@Entity //Informa que essa classe será uma entidade do banco de dados.
public class Funcionario {

	@Id //serve para identificar a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //gera uma iteração no id, evitando que estes sejam repetidos.
	private Integer id; //Atributo id
	private String nome; //Atributo nome
	private String email; //Atributo email
	private String senha; //Atributo senha
	private String setor; //Atributo setor
	
	//para garantir a compatibilidade do sistema e facilitar a manipulação dos objetos, 
	//o Hibernate tem como requisito, criar um construtor vazio.
	public Funcionario() {}

	public Funcionario(Integer id, String nome, String email, String senha, String setor) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.setor = setor;
	}

	
	//Criação dos getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
}