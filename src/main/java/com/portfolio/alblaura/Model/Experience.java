package com.portfolio.alblaura.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    private String fechaInicio;
    private String fechaFinal;
    private String urlLogo;

    public Experience() {
    }

    public Experience(Long id, String titulo, String descripcion, String fechaInicio, String fechaFinal, String urlLogo) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.urlLogo = urlLogo;
    }
}
