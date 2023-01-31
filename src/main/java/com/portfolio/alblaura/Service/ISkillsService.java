package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Model.Skills;

import java.util.List;

public interface ISkillsService {
    List<Skills> getSkills();

    void saveSkills(Skills skills);

    void deleteSkills(Long id);

    Skills findSkills(Long id);
}
