package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Exception.UserNotFoundException;
import com.portfolio.alblaura.Model.Project;
import com.portfolio.alblaura.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectService {
    private final ProjectRepository projectRepo;

    @Autowired
    public ProjectService(ProjectRepository projectRepo) {
        this.projectRepo = projectRepo;
    }
    public List<Project> getProject() {
        return projectRepo.findAll();
    }
    public Project saveProject(Project project) {
        return projectRepo.save(project);
    }
    public void deleteProject(Long id) {
        projectRepo.deleteById(id);
    }
    public Project findProject(Long id) {
        return projectRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Projecto no encontrado"));
    }
}
