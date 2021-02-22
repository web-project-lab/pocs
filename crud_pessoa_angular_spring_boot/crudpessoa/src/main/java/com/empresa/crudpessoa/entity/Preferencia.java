package com.empresa.crudpessoa.entity;

import javax.persistence.*;
import java.util.List;

//https://www.tutorialspoint.com/jpa/jpa_entity_relationships.htm
@Entity
public class Preferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String descricao;

    @ManyToMany(targetEntity = PessoaOld.class)
    private List<Pessoa> pessoaList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
