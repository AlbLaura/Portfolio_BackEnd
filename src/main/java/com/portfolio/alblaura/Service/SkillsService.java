package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Exception.UserNotFoundException;
import com.portfolio.alblaura.Model.Skills;
import com.portfolio.alblaura.Repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepository skillsRepo;

    @Autowired
    public SkillsService(SkillsRepository skillsRepo) {
        this.skillsRepo = skillsRepo;
    }
    public List<Skills> getSkills(){
        return skillsRepo.findAll();
    }
    public Skills saveSkills(Skills skills) {
        return skillsRepo.save(skills);
    } //add & edit
    public void deleteSkills(Long id) {
        skillsRepo.deleteById(id);
    }
}
