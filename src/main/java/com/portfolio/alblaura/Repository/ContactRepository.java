package com.portfolio.alblaura.Repository;

import com.portfolio.alblaura.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
