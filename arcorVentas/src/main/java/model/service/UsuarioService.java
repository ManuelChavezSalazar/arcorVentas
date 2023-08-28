package model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import model.entity.Usuario;

import model.repository.IUsuarioRepository;


@Service
public class UsuarioService {
    @Autowired
    private IUsuarioRepository usuarioRepository;
    
   

    public UsuarioService() {
        super();
    }
    public Usuario obtenerUsuarioPorId(int id) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        return usuarioOptional.orElse(null);
    }

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }
    
}

    
    
   

