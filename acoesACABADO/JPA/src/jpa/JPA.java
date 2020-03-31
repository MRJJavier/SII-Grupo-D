/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Alejandro
 */
public class JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        CONFIGURAR PRIMERO EL ARCHIVO persistence.xml:
        En services -> Databases -> Java DB.
        click derecho 'start server'
        click derecho 'Create Database'
        meter los datos de la base de datos en persistence.xml
        En javax.persistence.jdbc.url despues del puerto 1527/ va el nombre de la base de datos
        
        Para las nuevas entidades deben añadirse al archivo de persistence.xml con <class>
        */
        
        Formativa al = new Formativa();
        al.setNombreActividad("Alejandro");
        al.setNumHoras(20);
        al.setDescripcion("Mozo");
        al.setRamaDeEstudio("Ing");
        
        Voluntariado a2 = new Voluntariado();
        a2.setNombreActividad("Act2");
        a2.setNumHoras(27);
        a2.setDescripcion("testing");
        a2.setNumeroDeCreditos(6);
               
        Usuario a1 = new Usuario();
        a1.setNombre("Antonio xNeg3sis");
        a1.setApellidos("Chaves");
        a1.setCompetencias("xd");
        a1.setEmail("miMail");
        a1.setDNI("1");
        a1.setContrasenya("hashpassAntonio");
        a1.setFechaNacimiento(Date.valueOf("2020-03-24"));
        a1.setProfesion("Estudiante");
        a1.setTelefono("633853224");
        a1.setDireccion("Calle False 123");
        
        Profesor a22 = new Profesor();
        a22.setNombre("Alba");
        a22.setApellidos("Ramos");
        a22.setContrasenya("hashpassAlba");
        a22.setCompetencias("Buena amiga xd");
        a22.setEmail("albichuela@email.com");
        a22.setDNI("AlbaDNI");
        a22.setFechaNacimiento(Date.valueOf("1996-12-11"));
        a22.setProfesion("Estilista");
        a22.setTelefono("MovilAlba");
        a22.setDireccion("Calle Alhaurin 4");
        a22.setDisponibilidad("25/8");
        a22.setRamaEstudio("Manicura");
        
        
        
        Alumno a3 = new Alumno();
        a3.setNombre("Jose");
        a3.setApellidos("Lasso");
        a3.setContrasenya("hashpassLasso");
        a3.setCompetencias("Puntualidad");
        a3.setEmail("jose@email.com");
        a3.setDNI("JoseDNI");
        a3.setFechaNacimiento(Date.valueOf("1998-02-7"));
        a3.setProfesion("Trabaja en McDonalds");
        a3.setTelefono("633853224");
        a3.setDireccion("Calle Granada 2");
        a3.setCarrera("Disenyo Industrial");
        a3.setCurso("4!");
        a3.setDisponibilidad("24/7");
        a3.setIntereses("Me gusta el lol");
        
        
                
        ONG o1 = new ONG();
        
        o1.setNIF("nifUNICEF");
        o1.setCp(29190);
        o1.setDireccion("España");
        o1.setEmail("info@unicef.com");
        o1.setLocalidad("Mundo");
        o1.setNombreOrg("UnicefES");
        o1.setTlf(6338232);
        
        
        // TODO Auto-generated method stub
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
        EntityManager em = emf.createEntityManager();
        // 3-Persists the book to the database
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        em.persist(a1);
        em.persist(a2);
        em.persist(a3);
        em.persist(o1);
        em.persist(a22);

        tx.commit();
        
        em.close();
        emf.close();
    }
    
}
