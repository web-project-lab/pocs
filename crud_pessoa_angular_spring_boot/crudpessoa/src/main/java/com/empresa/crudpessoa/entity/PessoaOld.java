package com.empresa.crudpessoa.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

//https://www.tutorialspoint.com/jpa/jpa_entity_relationships.htm
@Entity
public class PessoaOld {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String cpf;
    private String cep;
    private Date aniversario;
    private Double salario;
    private Integer altura;
    private String email;
    private String telefone;
    private String estado;
    @ManyToMany(targetEntity = Preferencia.class)
    private List<Preferencia> preferencia;
    private String sexo;

    /*
    * Por padrão o spring data rest não retorna o id no response,
    * então eu criei este getCdId que retorna o id.
    * */
    public Long getCdId(){
        return this.id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Preferencia> getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(List<Preferencia> preferencia) {
        this.preferencia = preferencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
