package com.example.projetoAPI.Controller;

import com.example.projetoAPI.entity.Usuario;
import com.example.projetoAPI.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UsuarioController {
    @Autowired
    private usuarioRepository dao;

    @PostMapping("/usuarios")
    @CrossOrigin
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
        Usuario novoUsuario = dao.save(usuario);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }

    @GetMapping("/usuarios")
    @CrossOrigin
    public List<Usuario> listaUsuarios(){
        return (List<Usuario>) dao.findAll();
    }
}

