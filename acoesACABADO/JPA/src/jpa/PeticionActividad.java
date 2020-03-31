/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author ps3aj
 */
@Entity
public class PeticionActividad implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Column(unique=true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer peticionActividad;
    
    @Id
    @ManyToOne
    private ONG nombreONG;
    
    @Id
    @ManyToOne
    private Profesor profesorID;
    
    @Column(nullable = false)
    private String nombreActividad;
    
    @Column(nullable = false)
    private String descripcionActi;

    //getters y setters
    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDescripcionActi() {
        return descripcionActi;
    }

    public void setDescripcionActi(String descripcionActi) {
        this.descripcionActi = descripcionActi;
    }

    public Integer getPeticionActividad() {
        return peticionActividad;
    }

    public void setPeticionActividad(Integer peticionActividad) {
        this.peticionActividad = peticionActividad;
    }

    public ONG getNombreONG() {
        return nombreONG;
    }

    public void setNombreONG(ONG nombreONG) {
        this.nombreONG = nombreONG;
    }

    public Profesor getProfesorID() {
        return profesorID;
    }

    public void setProfesorID(Profesor profesorID) {
        this.profesorID = profesorID;
    }
       
    //hashcode y equals
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.peticionActividad);
        hash = 59 * hash + Objects.hashCode(this.nombreONG);
        hash = 59 * hash + Objects.hashCode(this.profesorID);
        hash = 59 * hash + Objects.hashCode(this.nombreActividad);
        hash = 59 * hash + Objects.hashCode(this.descripcionActi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PeticionActividad other = (PeticionActividad) obj;
        if (!Objects.equals(this.nombreActividad, other.nombreActividad)) {
            return false;
        }
        if (!Objects.equals(this.descripcionActi, other.descripcionActi)) {
            return false;
        }
        if (!Objects.equals(this.peticionActividad, other.peticionActividad)) {
            return false;
        }
        if (!Objects.equals(this.nombreONG, other.nombreONG)) {
            return false;
        }
        if (!Objects.equals(this.profesorID, other.profesorID)) {
            return false;
        }
        return true;
    }
    
    
    
}
