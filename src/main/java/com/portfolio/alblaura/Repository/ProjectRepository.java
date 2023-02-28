package com.portfolio.alblaura.Repository;

import com.portfolio.alblaura.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
