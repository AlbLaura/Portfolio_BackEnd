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
public class Education {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String place;
    private String fechaInicio;
    private String fechaFinal;
    private String resume;
    private String tituloEgreso;
    private String logoUrl;

    public Education() {
    }

    public Education(Long id, String place, String fechaInicio, String fechaFinal, String resume, String tituloEgreso, String logoUrl) {
        this.id = id;
        this.place = place;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.resume = resume;
        this.tituloEgreso = tituloEgreso;
        this.logoUrl = logoUrl;
    }
}
