package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Model.Persona;

import java.util.List;

import com.portfolio.alblaura.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Laura
 */
@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<Persona> getPersonas() {
        return persoRepository.findAll();
    }

    @Override
    public void savePersona(Persona perso){
        persoRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id){
        return persoRepository.findById(id).orElse(null);
    }

}
