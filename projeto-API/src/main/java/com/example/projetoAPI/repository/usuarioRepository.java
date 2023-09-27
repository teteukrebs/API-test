package com.example.projetoAPI.repository;

import com.example.projetoAPI.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface usuarioRepository extends CrudRepository<Usuario, Integer> {

}
