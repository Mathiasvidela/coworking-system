package com.mycompany.coworking.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Miembro implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idMiembro;
    
    private String nombre;
    private String apellido;
    private String celular;
    private String email;
    private String tipoMembresia;
    
    //constructor
    
    public Miembro() {
    }

    public Miembro(int idMiembro, String nombre, String apellido, String celular, String email, String tipoMembresia) {
        this.idMiembro = idMiembro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.email = email;
        this.tipoMembresia = tipoMembresia;
    }

    //getters y setters

    public int getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(int idMiembro) {
        this.idMiembro = idMiembro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }
    
    
     
    
}
