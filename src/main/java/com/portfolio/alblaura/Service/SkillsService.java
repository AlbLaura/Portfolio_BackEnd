package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Model.Skills;
import com.portfolio.alblaura.Repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService implements ISkillsService{

    @Autowired
    private SkillsRepository skillsRepo;

    @Override
    public List<Skills> getSkills() {
        return skillsRepo.findAll();
    }

    @Override
    public void saveSkills(Skills skills) {
        skillsRepo.save(skills);
    }

    @Override
    public void deleteSkills(Long id) {
        skillsRepo.deleteById(id);
    }

    @Override
    public Skills findSkills(Long id) {
        return skillsRepo.findById(id).orElse(null);
    }
}
