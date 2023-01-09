package com.portfolio.alblaura.Repository;

import com.portfolio.alblaura.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laura
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
        
}
