package com.fatecdiadema.pesqueiros.dto;

import com.fatecdiadema.pesqueiros.entity.UsuarioEntity;
import com.fatecdiadema.pesqueiros.projection.UsuarioMinProjection;

public class UsuarioMinDTO {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String nrTelefone;
    private String cpf;

    public UsuarioMinDTO() {

    }

    public UsuarioMinDTO(UsuarioEntity entity) {
        id = entity.getId();
        nome = entity.getNome();
        email = entity.getEmail();
        senha = entity.getSenha();
        nrTelefone = entity.getNrTelefone();
        cpf = entity.getCpf();
    }

    public UsuarioMinDTO(UsuarioMinProjection projection) {
        id = projection.getId();
        nome = projection.getNome();
        email = projection.getEmail();
        senha = projection.getSenha();
        nrTelefone = projection.getNrTelefone();
        cpf = projection.getCpf();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    // Não sei como implementar a senha, por isso vou deixar assim mesmo
    public String getSenha() {
        return senha;
    }

    public String getNrTelefone() {
        return nrTelefone;
    }

    public String getCpf() {
        return cpf;
    }
}
