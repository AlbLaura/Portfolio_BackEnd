package com.portfolio.alblaura.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Projects {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String url_img;
    private String resume; //optional

    public Projects() {
    }

    public Projects(Long id, String titulo, String url_img, String resume) {
        this.id = id;
        this.titulo = titulo;
        this.url_img = url_img;
        this.resume = resume;
    }
}