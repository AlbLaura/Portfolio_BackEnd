package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Exception.UserNotFoundException;
import com.portfolio.alblaura.Model.Contact;
import com.portfolio.alblaura.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ContactService {
    private final ContactRepository contactRepo;

    @Autowired
    public ContactService(ContactRepository contactRepo) {
        this.contactRepo = contactRepo;
    }
    public List<Contact> getContact() {
        return contactRepo.findAll();
    }
    public Contact saveContact(Contact contact) {
        return contactRepo.save(contact);
    }
    public void deleteContact(Long id) {
        contactRepo.deleteById(id);
    }
    public Contact findContact(Long id) {
        return contactRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Contacto no encontrado"));
    }
}
