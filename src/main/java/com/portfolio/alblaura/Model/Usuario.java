package com.portfolio.alblaura.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.List;

@Getter @Setter
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String about;
    private String urlImagen;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Education> educationList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Experience> experienceList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Skills> skillsList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Project> projectsList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Social> socialsList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Contact> contactList;

    public Usuario() {
    }
    public Usuario(Long id, String nombre, String apellido, String titulo, String about, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.about = about;
        this.urlImagen = urlImagen;
    }
}