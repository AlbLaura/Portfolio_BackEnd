package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Model.Experience;
import com.portfolio.alblaura.Repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExperienceService implements IExperienceService {

    @Autowired
    private ExperienceRepository expRepo;

    @Override
    public List<Experience> getExperience() {
        return expRepo.findAll();
    }

    @Override
    public void saveExperience(Experience exp) {
        expRepo.save(exp);
    }

    @Override
    public void deleteExperience(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experience findExperience(Long id) {
        return expRepo.findById(id).orElse(null);
    }
}
