package com.portfolio.alblaura.Controller;

import com.portfolio.alblaura.Model.Skills;
import com.portfolio.alblaura.Service.ISkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class SkillsController {
    @Autowired
    private ISkillsService interSkill;

    @GetMapping("/skills/get")
    public List<Skills> getSkills() {
        return interSkill.getSkills();
    }

    @PostMapping("/skills/post")
    public String createSkills(@RequestBody Skills skills){
        interSkill.saveSkills(skills);
        return "Su habilidad fue creada correctamente";
    }

    @DeleteMapping("/skills/delete/{id}")
    public String deleteSkills(@PathVariable Long id) {
        interSkill.deleteSkills(id);
        return "Su habilidad fue eliminada correctamente";
    }

    @PutMapping("/skills/put/{id}")
    public Skills editSkills( @PathVariable Long id,
                              @RequestParam ("nombre") String nuevoNombre,
                              @RequestParam ("porcentaje") String nuevoPorcentaje,
                              @RequestParam ("urlLogo") String nuevoUrlLogo) {
        Skills skills = interSkill.findSkills(id);

        skills.setNombre(nuevoNombre);
        skills.setPorcentaje(nuevoPorcentaje);
        skills.setUrlLogo(nuevoUrlLogo);

        interSkill.saveSkills(skills);
        return skills;
    }
}
