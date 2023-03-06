package com.portfolio.alblaura.Service;

import com.portfolio.alblaura.Exception.UserNotFoundException;
import com.portfolio.alblaura.Model.Social;
import com.portfolio.alblaura.Repository.SocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SocialService {
    private final SocialRepository socialRepo;

    @Autowired
    public SocialService(SocialRepository socialRepo) {
        this.socialRepo = socialRepo;
    }
    public List<Social> getSocial() {
        return socialRepo.findAll();
    }
    public Social saveSocial(Social social) {
        return socialRepo.save(social);
    }
    public void deleteSocial(Long id) {
        socialRepo.deleteById(id);
    }
    public Social findSocial(Long id) {
        return socialRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Social no encontrado"));
    }
}
