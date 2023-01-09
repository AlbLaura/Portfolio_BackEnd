package com.portfolio.alblaura.Controller;

import com.portfolio.alblaura.Model.Persona;
import com.portfolio.alblaura.Service.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }
    
    @GetMapping ("/personas/traer/perfil")
    public Persona getPerfil(){
     return interPersona.findPersona(1l);
    }
    
    @PostMapping ("/personas/crear")
    public String createStudent(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        //devuelve un string avisando si se creo correctamente
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        //devuelve un string avisando si se elimino correctamente
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping ("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam ("nombre") String nuevoNombre,
                               @RequestParam ("apellido") String nuevoApellido,
                               @RequestParam ("urlImagen") String nuevaUrlImagen){
        //busco la persona en cuestion
        Persona perso = interPersona.findPersona(id);
        
        //esto tambien puede ir en service
        //para desacoplar mejor aun el codigo en un nuevo metodo
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setUrlImagen(nuevaUrlImagen);
        
        interPersona.savePersona(perso);
        //retorna la nueva persona
        return perso;
    }
}
