package com.fatecdiadema.pesqueiros.dto;

import com.fatecdiadema.pesqueiros.entity.UsuarioEntity;
import org.springframework.beans.BeanUtils;

public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;

    public UsuarioDTO() {

    }

    public UsuarioDTO(UsuarioEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
