package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Model.Persona;
import java.util.List;

/**
 *
 * @author Laura
 */
public interface IPersonaService {

    //metodo para traer todas las personas
    List<Persona> getPersonas();

    //metodo para dar de alta una persona
    void savePersona(Persona perso);

    //metodo para borrar una persona
    void deletePersona(Long id);

    //metodo para encontrar una persona
    Persona findPersona(Long id);
}
