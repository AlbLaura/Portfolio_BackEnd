package com.portfolio.alblaura.Controller;

import com.portfolio.alblaura.Model.Experience;
import com.portfolio.alblaura.Service.IExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienceController {
    @Autowired
    private IExperienceService interExp;

    @GetMapping("/experience/get")
    public List<Experience> getExperience() { return interExp.getExperience(); }

    @PostMapping("/experience/post")
    public String createExperience(@RequestBody Experience exp) {
        interExp.saveExperience(exp);
        return "Su experiencia fue creada correctamente";
    }

    @DeleteMapping("/experience/delete/{id}")
    public String deleteExperience(@PathVariable Long id) {
        interExp.deleteExperience(id);
        return "La experiencia fue eliminada correctamente";
    }

    @PutMapping("/experience/put/{id}")
    public Experience editExperience( @PathVariable Long id,
                                      @RequestParam ("titulo") String nuevoTitulo,
                                      @RequestParam ("urlLogo") String nuevoUrlLogo,
                                      @RequestParam ("descripcion") String nuevoDescripcion,
                                      @RequestParam ("fechaInicio") String nuevoFechaInicio,
                                      @RequestParam ("fechaFinal") String nuevoFechaFinal) {
        Experience exp = interExp.findExperience(id);
        exp.setTitulo(nuevoTitulo);
        exp.setDescripcion(nuevoDescripcion);
        exp.setFechaInicio(nuevoFechaInicio);
        exp.setFechaFinal(nuevoFechaFinal);
        exp.setUrlLogo(nuevoUrlLogo);

        interExp.saveExperience(exp);
        return exp;
    }
}
