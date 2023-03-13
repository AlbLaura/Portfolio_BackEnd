package com.portfolio.alblaura.Controller;

import com.portfolio.alblaura.Model.Education;
import com.portfolio.alblaura.Service.EducationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/education")
public class EducationController {
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Education>> getEducation() {
        List<Education> edu = educationService.getEducation();
        return new ResponseEntity<>(edu, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Education> editarEducation(@RequestBody Education edu) {
        Education updateEducation = educationService.saveEducation(edu);
        return new ResponseEntity<>(updateEducation, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Education> addEducation(@RequestBody Education edu) {
        Education newEducation = educationService.saveEducation(edu);
        return new ResponseEntity<>(newEducation, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long id) {
        educationService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
