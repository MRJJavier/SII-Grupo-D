package jpa;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Sergio
 */
@Entity
public class ONG implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(nullable = false)
    private String NIF; 
    @Column(nullable = false)
    private String nombreOrg;
    @Column(nullable = false)
    private String Direccion;
    @Column(nullable = false)
    private Integer cp;
    @Column(nullable = false)
    private String localidad;
    @Column(nullable = false)
    private Integer tlf;
    @Column(nullable = false)
    private String email;
    @ManyToMany(mappedBy = "perteneceAONG")
    private List <Usuario> users;
    @OneToMany  (mappedBy = "nombreONG")
    private List<Actividad> listActiv;
    @OneToMany  (mappedBy = "nombreONG")
    private List<PeticionActividad> peticiones;
    
    // getters y setters
    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombreOrg() {
        return nombreOrg;
    }

    public void setNombreOrg(String nombreOrg) {
        this.nombreOrg = nombreOrg;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Integer getTlf() {
        return tlf;
    }

    public void setTlf(Integer tlf) {
        this.tlf = tlf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Usuario> getUsers() {
        return users;
    }

    public void setUsers(List<Usuario> users) {
        this.users = users;
    }

    public List<Actividad> getListActiv() {
        return listActiv;
    }

    public void setListActiv(List<Actividad> listActiv) {
        this.listActiv = listActiv;
    }

    public List<PeticionActividad> getPeticiones() {
        return peticiones;
    }

    public void setPeticiones(List<PeticionActividad> peticiones) {
        this.peticiones = peticiones;
    }
       
    //hashcode y equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.NIF);
        hash = 37 * hash + Objects.hashCode(this.nombreOrg);
        hash = 37 * hash + Objects.hashCode(this.Direccion);
        hash = 37 * hash + Objects.hashCode(this.cp);
        hash = 37 * hash + Objects.hashCode(this.localidad);
        hash = 37 * hash + Objects.hashCode(this.tlf);
        hash = 37 * hash + Objects.hashCode(this.email);
        hash = 37 * hash + Objects.hashCode(this.users);
        hash = 37 * hash + Objects.hashCode(this.listActiv);
        hash = 37 * hash + Objects.hashCode(this.peticiones);
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
        final ONG other = (ONG) obj;
        if (!Objects.equals(this.NIF, other.NIF)) {
            return false;
        }
        if (!Objects.equals(this.nombreOrg, other.nombreOrg)) {
            return false;
        }
        if (!Objects.equals(this.Direccion, other.Direccion)) {
            return false;
        }
        if (!Objects.equals(this.localidad, other.localidad)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.cp, other.cp)) {
            return false;
        }
        if (!Objects.equals(this.tlf, other.tlf)) {
            return false;
        }
        if (!Objects.equals(this.users, other.users)) {
            return false;
        }
        if (!Objects.equals(this.listActiv, other.listActiv)) {
            return false;
        }
        if (!Objects.equals(this.peticiones, other.peticiones)) {
            return false;
        }
        return true;
    }

}
