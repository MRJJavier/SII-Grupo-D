/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class SolicitudEntrada implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @ManyToOne
    private Alumno codAlumno;
    
    @Id
    @ManyToOne
    private Actividad codActividad;
    
    @Column(unique=true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigoSolicitud;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaDeSolicitud;

    //getters y setters
    public Date getFechaDeSolicitud() {
        return fechaDeSolicitud;
    }

    public void setFechaDeSolicitud(Date fechaDeSolicitud) {
        this.fechaDeSolicitud = fechaDeSolicitud;
    }

    public Alumno getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(Alumno codAlumno) {
        this.codAlumno = codAlumno;
    }

    public Actividad getCodActividad() {
        return codActividad;
    }

    public void setCodActividad(Actividad codActividad) {
        this.codActividad = codActividad;
    }

    public Integer getCodigoSolicitud() {
        return codigoSolicitud;
    }
        
    //hashcode y equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codAlumno);
        hash = 23 * hash + Objects.hashCode(this.codActividad);
        hash = 23 * hash + Objects.hashCode(this.codigoSolicitud);
        hash = 23 * hash + Objects.hashCode(this.fechaDeSolicitud);
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
        final SolicitudEntrada other = (SolicitudEntrada) obj;
        if (!Objects.equals(this.codAlumno, other.codAlumno)) {
            return false;
        }
        if (!Objects.equals(this.codActividad, other.codActividad)) {
            return false;
        }
        if (!Objects.equals(this.codigoSolicitud, other.codigoSolicitud)) {
            return false;
        }
        if (!Objects.equals(this.fechaDeSolicitud, other.fechaDeSolicitud)) {
            return false;
        }
        return true;
    }
    
    
    
}
