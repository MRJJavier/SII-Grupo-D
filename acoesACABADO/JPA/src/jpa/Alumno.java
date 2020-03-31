package jpa;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@DiscriminatorValue(value="A")
public class Alumno extends Usuario implements Serializable{
    
    @Column(nullable = false)
    private String Curso;
    @Column(nullable = false)
    private String Carrera;
    @Column(nullable = false)
    private String Disponibilidad;
    @Column(nullable = false)
    private String Intereses;

    @ManyToMany
    @JoinTable(name = "ALUMNO_PART_ACT", joinColumns = { @JoinColumn(name = "alumno_fk") }, inverseJoinColumns = { @JoinColumn(name = "actividad_fk") })
    private List<Actividad> participaEnAct;
    
    // getters y setters
    
    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        Disponibilidad = disponibilidad;
    }

    public String getIntereses() {
        return Intereses;
    }

    public void setIntereses(String intereses) {
        Intereses = intereses;
    }

    public List<Actividad> getParticipaEnAct() {
        return participaEnAct;
    }

    public void setParticipaEnAct(List<Actividad> participaEnAct) {
        this.participaEnAct = participaEnAct;
    }
   
    //hashcode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.Curso);
        hash = 67 * hash + Objects.hashCode(this.Carrera);
        hash = 67 * hash + Objects.hashCode(this.Disponibilidad);
        hash = 67 * hash + Objects.hashCode(this.Intereses);
        hash = 67 * hash + Objects.hashCode(this.participaEnAct);
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
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.Curso, other.Curso)) {
            return false;
        }
        if (!Objects.equals(this.Carrera, other.Carrera)) {
            return false;
        }
        if (!Objects.equals(this.Disponibilidad, other.Disponibilidad)) {
            return false;
        }
        if (!Objects.equals(this.Intereses, other.Intereses)) {
            return false;
        }
        if (!Objects.equals(this.participaEnAct, other.participaEnAct)) {
            return false;
        }
        return true;
    }
    
    
}