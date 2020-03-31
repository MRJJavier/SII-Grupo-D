package jpa;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author ps3aj
 */
@Entity
@DiscriminatorValue(value="P")
public class Profesor extends Usuario implements Serializable{
    
    @Column(nullable = false)
    private String Disponibilidad;
    
    @Column(nullable = false)
    private String ramaEstudio;
    
    @OneToMany  (mappedBy = "profesorID")
    private List<PeticionActividad> peticiones;
    
    @ManyToMany
    @JoinTable(name = "PROF_PART_VOL", joinColumns = { @JoinColumn(name = "profesor_fk") }, inverseJoinColumns = { @JoinColumn(name = "voluntariado_fk") })
    private List<Voluntariado> participaEnVol;
    
    @ManyToMany
    @JoinTable(name = "PROF_COORD_FORM", joinColumns = { @JoinColumn(name = "profesor_fk") }, inverseJoinColumns = { @JoinColumn(name = "formativa_fk") })
    private List<Formativa> coordinaForm;
    
    //getters y setters
    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    public String getRamaEstudio() {
        return ramaEstudio;
    }

    public void setRamaEstudio(String ramaEstudio) {
        this.ramaEstudio = ramaEstudio;
    }

    public List<PeticionActividad> getPeticiones() {
        return peticiones;
    }

    public void setPeticiones(List<PeticionActividad> peticiones) {
        this.peticiones = peticiones;
    }

    public List<Voluntariado> getParticipaEnVol() {
        return participaEnVol;
    }

    public void setParticipaEnVol(List<Voluntariado> participaEnVol) {
        this.participaEnVol = participaEnVol;
    }

    public List<Formativa> getCoordinaForm() {
        return coordinaForm;
    }

    public void setCoordinaForm(List<Formativa> coordinaForm) {
        this.coordinaForm = coordinaForm;
    }
    
    //hashcode y equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.Disponibilidad);
        hash = 37 * hash + Objects.hashCode(this.ramaEstudio);
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
        final Profesor other = (Profesor) obj;
        if (!Objects.equals(this.Disponibilidad, other.Disponibilidad)) {
            return false;
        }
        if (!Objects.equals(this.ramaEstudio, other.ramaEstudio)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
    
