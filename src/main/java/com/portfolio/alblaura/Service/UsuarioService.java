package com.portfolio.alblaura.Service;

import java.util.List;

import com.portfolio.alblaura.Model.Usuario;
import com.portfolio.alblaura.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Laura
 */
@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public List<Usuario> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(Usuario user){
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Usuario findUser(Long id){
        return userRepository.findById(id).orElse(null);
    }

}
