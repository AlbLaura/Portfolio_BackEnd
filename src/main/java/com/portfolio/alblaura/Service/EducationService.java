package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Model.Education;
import com.portfolio.alblaura.Repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducationService {
    private final EducationRepository educationRepo;

    @Autowired
    public EducationService(EducationRepository educationRepo) {
        this.educationRepo = educationRepo;
    }
    public List<Education> getEducation() {
        return educationRepo.findAll();
    }
    public Education saveEducation(Education edu) {
        return educationRepo.save(edu);
    }
    public void deleteEducation(Long id) {
        educationRepo.deleteById(id);
    }
    public Education findEducation(Long id) {
        return educationRepo.findById(id).orElse(null);
    }
}
