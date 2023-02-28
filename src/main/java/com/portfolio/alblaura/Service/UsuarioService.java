package com.portfolio.alblaura.Service;

import java.util.List;

import com.portfolio.alblaura.Model.Usuario;
import com.portfolio.alblaura.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Laura
 */
@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepository usuarioRepo;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public List<Usuario> getUsers() {
        return usuarioRepo.findAll();
    }

    public void saveUser(Usuario user){
        usuarioRepo.save(user);
    }

    public void deleteUser(Long id) {
        usuarioRepo.deleteById(id);
    }

    public Usuario findUser(Long id){
        return usuarioRepo.findById(id).orElse(null);
    }

}
