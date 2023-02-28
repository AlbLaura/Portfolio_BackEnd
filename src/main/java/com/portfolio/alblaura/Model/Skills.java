package com.portfolio.alblaura.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String porcentaje;
    private String urlLogo;

    public Skills() {
    }

    public Skills(Long id, String nombre, String porcentaje, String urlLogo) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.urlLogo = urlLogo;
    }
}
