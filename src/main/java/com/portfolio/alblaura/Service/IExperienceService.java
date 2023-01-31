package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Model.Experience;

import java.util.List;

public interface IExperienceService {
    List<Experience> getExperience();

    void saveExperience(Experience exp);

    void deleteExperience(Long id);

    Experience findExperience(Long id);
}
