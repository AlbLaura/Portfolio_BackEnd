package com.portfolio.alblaura.Controller;

import com.portfolio.alblaura.Model.User;
import com.portfolio.alblaura.Service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Laura
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private IUserService interUser;

    @GetMapping ("/users/get")
    public List<User> getUsers(){
        return interUser.getUsers();
    }

    @GetMapping ("/users/traer/perfil")
    public User getPerfil(){
        return interUser.findUser(1L);
    }

    @PostMapping ("/users/post")
    public String createUser(@RequestBody User perso){
        interUser.saveUser(perso);
        //devuelve un string avisando si se creo correctamente
        return "La persona fue creada correctamente";
    }

    @DeleteMapping ("/users/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        interUser.deleteUser(id);
        //devuelve un string avisando si se elimino correctamente
        return "La persona fue eliminada correctamente";
    }

    @PutMapping ("/users/put/{id}")
    public User editUser (  @PathVariable Long id,
                            @RequestParam ("nombre") String nuevoNombre,
                            @RequestParam ("apellido") String nuevoApellido,
                            @RequestParam ("urlImagen") String nuevaUrlImagen){
        //busco la persona en cuestion
        User user = interUser.findUser(id);

        //esto tambien puede ir en service
        //para desacoplar mejor aun el codigo en un nuevo metodo
        user.setNombre(nuevoNombre);
        user.setApellido(nuevoApellido);
        user.setUrlImagen(nuevaUrlImagen);

        interUser.saveUser(user);
        //retorna la nueva persona
        return user;
    }
}
