/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author ps3aj
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(
    name="DiscrCOL",
    discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue(value="A")
public class Actividad implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigoActividad;
    @Column(nullable=false)
    private String nombreActividad;
    @Column(nullable=false)
    private Integer numHoras;
    @Column(nullable=false)
    private String descripcion;
    @ManyToOne(optional = true)
    private ONG nombreONG;
    
    @ManyToMany(mappedBy = "participaEnAct")
    private List <Alumno> alumnosPart;
    
    // getters y setters (estan todos, aunque nombres por defecto modificados)
    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public Integer getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(Integer numHoras) {
        this.numHoras = numHoras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ONG getNIFONG() {
        return nombreONG;
    }

    public void setNIFONG(ONG nombreONG) {
        this.nombreONG = nombreONG;
    }

    public List<Alumno> getAlumnosParticipantes() {
        return alumnosPart;
    }

    public void setAlumnosParticipantes(List<Alumno> alumnosPart) {
        this.alumnosPart = alumnosPart;
    }

    public Long getCodigoActividad() {
        return codigoActividad;
    }
        
    // hashcode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codigoActividad);
        hash = 97 * hash + Objects.hashCode(this.nombreActividad);
        hash = 97 * hash + Objects.hashCode(this.numHoras);
        hash = 97 * hash + Objects.hashCode(this.descripcion);
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
        final Actividad other = (Actividad) obj;
        if (!Objects.equals(this.nombreActividad, other.nombreActividad)) {
            return false;
        }
        if (!Objects.equals(this.numHoras, other.numHoras)) {
            return false;
        }
        if (!Objects.equals(this.codigoActividad, other.codigoActividad)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
