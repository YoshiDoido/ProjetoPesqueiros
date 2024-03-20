package com.fatecdiadema.pesqueiros.dto;

import com.fatecdiadema.pesqueiros.entity.PescadorEntity;
import org.springframework.beans.BeanUtils;

public class PescadorDTO {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String nrTelefone;
    private String cpf;
    private String cnpj;

    public PescadorDTO() {

    }

    public PescadorDTO(PescadorEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
