
package com.mycompany.coworking.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Reserva implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idReserva;
    
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private String tipo;
    private String espacio;
    private String estado;
    private String observaciones;
    
    @OneToOne
    private Miembro unMiembro; // relacion 1:1 con miembro
    
    //constructor

    public Reserva() {
    }

    public Reserva(int idReserva, String fecha, String horaInicio, String horaFin, String tipo, String espacio, String estado, String observaciones, Miembro unMiembro) {
        this.idReserva = idReserva;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tipo = tipo;
        this.espacio = espacio;
        this.estado = estado;
        this.observaciones = observaciones;
        this.unMiembro = unMiembro;
    }
    
    //getters y setters

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Miembro getUnMiembro() {
        return unMiembro;
    }

    public void setUnMiembro(Miembro unMiembro) {
        this.unMiembro = unMiembro;
    }
    
    
    
}
