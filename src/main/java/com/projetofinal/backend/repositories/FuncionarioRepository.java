//Dentro do pacote repositories, ficam as classes responsaveis por se comunicar com o banco de dados

//Aqui será criada uma interface ao inves de uma classe.

package com.projetofinal.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetofinal.backend.entities.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{

}