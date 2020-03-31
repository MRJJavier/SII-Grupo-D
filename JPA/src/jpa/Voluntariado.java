/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author ps3aj
 */
@Entity
@DiscriminatorValue(value="V")
public class Voluntariado extends Actividad implements Serializable{
    
    @Column(nullable=false)
    private Integer numeroDeCreditos;
    
    @ManyToMany(mappedBy = "participaEnVol")
    private List <Profesor> profPart;

    // getters y setters
    public Integer getNumeroDeCreditos() {
        return numeroDeCreditos;
    }

    public void setNumeroDeCreditos(Integer numeroDeCreditos) {
        this.numeroDeCreditos = numeroDeCreditos;
    }

    public List<Profesor> getProfPart() {
        return profPart;
    }

    public void setProfPart(List<Profesor> profPart) {
        this.profPart = profPart;
    }
    
    // hashcode y equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.numeroDeCreditos);
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
        final Voluntariado other = (Voluntariado) obj;
        if (!Objects.equals(this.numeroDeCreditos, other.numeroDeCreditos)) {
            return false;
        }
        return true;
    }
    
     
    
}