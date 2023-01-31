package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Model.User;
import java.util.List;

/**
 *
 * @author Laura
 */
public interface IUserService {

    //metodo para traer todas las personas
    List<User> getUsers();

    //metodo para dar de alta una persona
    void saveUser(User user);

    //metodo para borrar una persona
    void deleteUser(Long id);

    //metodo para encontrar una persona
    User findUser(Long id);
}
