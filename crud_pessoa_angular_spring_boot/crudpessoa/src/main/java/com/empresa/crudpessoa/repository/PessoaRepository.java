package com.empresa.crudpessoa.repository;

import com.empresa.crudpessoa.entity.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/*No início desta poc esta anotação era uma das formas de liberar
um repositório para o cors de uma url específica, domínio e porta,
mas foi estudado depois uma forma de implementar globalmente e não por cada
classe de repositório como abaixo*/
//@CrossOrigin(origins = "http://localhost:4200")
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}
