package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Model.Usuario;
import java.util.List;

/**
 *
 * @author Laura
 */
public interface IUsuarioService {

    //metodo para traer todas las personas
    List<Usuario> getUsers();

    //metodo para dar de alta una persona
    void saveUser(Usuario user);

    //metodo para borrar una persona
    void deleteUser(Long id);

    //metodo para encontrar una persona
    Usuario findUser(Long id);
}
