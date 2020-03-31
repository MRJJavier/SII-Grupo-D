/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author ps3aj
 */
@Entity
@DiscriminatorValue(value="F")
public class Formativa extends Actividad implements Serializable{
    
    @Column(nullable=false)
    private String ramaDeEstudio;
    
    @ManyToMany(mappedBy = "coordinaForm")
    private List <Profesor> coordProf;
    
    // getters y setters
    public String getRamaDeEstudio() {
        return ramaDeEstudio;
    }

    public void setRamaDeEstudio(String ramaDeEstudio) {
        this.ramaDeEstudio = ramaDeEstudio;
    }

    public List<Profesor> getCoordProf() {
        return coordProf;
    }

    public void setCoordProf(List<Profesor> coordProf) {
        this.coordProf = coordProf;
    }
    
    // hashcode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.ramaDeEstudio);
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
        final Formativa other = (Formativa) obj;
        if (!Objects.equals(this.ramaDeEstudio, other.ramaDeEstudio)) {
            return false;
        }
        return true;
    }
    
    
    
}