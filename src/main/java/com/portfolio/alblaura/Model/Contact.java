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
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreEmisor;
    private String mensaje;
    private String asunto;
    private String emailReceptor;

    public Contact() {
    }

    public Contact(Long id, String nombreEmisor, String mensaje, String asunto, String emailReceptor) {
        this.id = id;
        this.nombreEmisor = nombreEmisor;
        this.mensaje = mensaje;
        this.asunto = asunto;
        this.emailReceptor = emailReceptor;
    }
}
