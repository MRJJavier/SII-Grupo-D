/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Date;
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
@DiscriminatorValue(value="U")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String DNI;
    
    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private String apellidos;
    
    @Column(nullable = false)
    private String contrasenya; // HASH / SALT de la contrasenya
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    
    @Column(nullable = false)
    private String competencias;
    
    @Column(nullable = false)
    private String profesion;
    
    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String telefono;
        
    @Column(nullable = false)
    private String direccion;
    
    @JoinTable(name = "USER_ONG", joinColumns = { @JoinColumn(name = "usuario_fk") }, inverseJoinColumns = { @JoinColumn(name = "ONG_fk") })
    private List<ONG> perteneceAONG;

    // getters y setters
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }
    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCompetencias() {
        return competencias;
    }

    public void setCompetencias(String competencias) {
        this.competencias = competencias;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<ONG> getPerteneceAONG() {
        return perteneceAONG;
    }

    public void setPerteneceAONG(List<ONG> perteneceAONG) {
        this.perteneceAONG = perteneceAONG;
    }
    
    //hashcode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.DNI);
        hash = 73 * hash + Objects.hashCode(this.nombre);
        hash = 73 * hash + Objects.hashCode(this.apellidos);
        hash = 73 * hash + Objects.hashCode(this.contrasenya);
        hash = 73 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 73 * hash + Objects.hashCode(this.competencias);
        hash = 73 * hash + Objects.hashCode(this.profesion);
        hash = 73 * hash + Objects.hashCode(this.email);
        hash = 73 * hash + Objects.hashCode(this.telefono);
        hash = 73 * hash + Objects.hashCode(this.direccion);
        hash = 73 * hash + Objects.hashCode(this.perteneceAONG);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.DNI, other.DNI)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.contrasenya, other.contrasenya)) {
            return false;
        }
        if (!Objects.equals(this.competencias, other.competencias)) {
            return false;
        }
        if (!Objects.equals(this.profesion, other.profesion)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.perteneceAONG, other.perteneceAONG)) {
            return false;
        }
        return true;
    }

    
    
    
}
