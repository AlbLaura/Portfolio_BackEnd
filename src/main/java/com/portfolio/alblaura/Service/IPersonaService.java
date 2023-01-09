package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Model.Persona;
import java.util.List;

/**
 *
 * @author Laura
 */
public interface IPersonaService {
    //metodo para traer todas las personas
    public List<Persona> getPersonas();
    //metodo para dar de alta una persona
    public void savePersona(Persona perso);
    //metodo para borrar una persona
    public void deletePersona(Long id);
    //metodo para encontrar una persona
    public Persona findPersona(Long id);
}
