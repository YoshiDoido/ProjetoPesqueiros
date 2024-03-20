package com.fatecdiadema.pesqueiros.service;

import com.fatecdiadema.pesqueiros.dto.UsuarioDTO;
import com.fatecdiadema.pesqueiros.dto.UsuarioMinDTO;
import com.fatecdiadema.pesqueiros.entity.UsuarioEntity;
import com.fatecdiadema.pesqueiros.projection.UsuarioMinProjection;
import com.fatecdiadema.pesqueiros.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional(readOnly = true)
    public UsuarioDTO findById(Long id) {
        UsuarioEntity result = usuarioRepository.findById(id).get();
        return new UsuarioDTO(result);
    }

    @Transactional(readOnly = true)
    public List<UsuarioMinDTO> findAll() {
        List<UsuarioEntity> result = usuarioRepository.findAll();
        return result.stream().map(x -> new UsuarioMinDTO(x)).toList();
    }

    // Implementar depois
    /*

    @Transactional(readOnly = true)
    public List<UsuarioMinDTO> findByNome(String nome) {
        List<UsuarioMinProjection> result = usuarioRepository.searchByNome(nome);
        return result.stream().map(x -> new UsuarioMinDTO(x)).toList();
    }

    */
}
