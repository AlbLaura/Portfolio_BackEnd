package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Exception.UserNotFoundException;
import com.portfolio.alblaura.Model.Experience;
import com.portfolio.alblaura.Repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ExperienceService {
    private final ExperienceRepository experienceRepo;

    @Autowired
    public ExperienceService(ExperienceRepository experienceRepo) {
        this.experienceRepo = experienceRepo;
    }
    public List<Experience> getExperience() {
        return experienceRepo.findAll();
    }
    public Experience saveExperience(Experience experience) {
        return experienceRepo.save(experience);
    }
    public void deleteExperience(Long id) {
        experienceRepo.deleteById(id);
    }
    public Experience findExperience(Long id) {
        return experienceRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Experiencia no encontrada"));
    }
}
