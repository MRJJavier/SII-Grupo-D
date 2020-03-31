/**
 *
 * @author ps3aj
 */
package jpa;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
public class Informe implements Serializable  {
    private static final long serialVersionUID = 1L;
    @Column(unique = true)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long codInforme;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaInforme;
    @Column(nullable = false)
    private String contenidoInforme;
    @Column(nullable = false)
    private String valoracionUsuario;
    @Column(nullable = false)
    private String valoracionActividad;
    
    @Id
    @ManyToOne
    private Usuario codUsuario;
    @Id
    @ManyToOne
    private Actividad codActividad;

    //getters y setters
    public Long getCodInforme() {
        return codInforme;
    }

    public void setCodInforme(Long codInforme) {
        this.codInforme = codInforme;
    }

    public Date getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(Date fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public String getContenidoInforme() {
        return contenidoInforme;
    }

    public void setContenidoInforme(String contenidoInforme) {
        this.contenidoInforme = contenidoInforme;
    }

    public String getValoracionUsuario() {
        return valoracionUsuario;
    }

    public void setValoracionUsuario(String valoracionUsuario) {
        this.valoracionUsuario = valoracionUsuario;
    }

    public String getValoracionActividad() {
        return valoracionActividad;
    }

    public void setValoracionActividad(String valoracionActividad) {
        this.valoracionActividad = valoracionActividad;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Actividad getCodActividad() {
        return codActividad;
    }

    public void setCodActividad(Actividad codActividad) {
        this.codActividad = codActividad;
    }   
    
    // hashcode y equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.codInforme);
        hash = 83 * hash + Objects.hashCode(this.fechaInforme);
        hash = 83 * hash + Objects.hashCode(this.contenidoInforme);
        hash = 83 * hash + Objects.hashCode(this.valoracionUsuario);
        hash = 83 * hash + Objects.hashCode(this.valoracionActividad);
        hash = 83 * hash + Objects.hashCode(this.codUsuario);
        hash = 83 * hash + Objects.hashCode(this.codActividad);
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
        final Informe other = (Informe) obj;
        if (!Objects.equals(this.contenidoInforme, other.contenidoInforme)) {
            return false;
        }
        if (!Objects.equals(this.valoracionUsuario, other.valoracionUsuario)) {
            return false;
        }
        if (!Objects.equals(this.valoracionActividad, other.valoracionActividad)) {
            return false;
        }
        if (!Objects.equals(this.codInforme, other.codInforme)) {
            return false;
        }
        if (!Objects.equals(this.fechaInforme, other.fechaInforme)) {
            return false;
        }
        if (!Objects.equals(this.codUsuario, other.codUsuario)) {
            return false;
        }
        if (!Objects.equals(this.codActividad, other.codActividad)) {
            return false;
        }
        return true;
    }
    
    
    


}