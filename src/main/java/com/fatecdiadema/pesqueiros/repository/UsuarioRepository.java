package com.fatecdiadema.pesqueiros.repository;

import com.fatecdiadema.pesqueiros.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}