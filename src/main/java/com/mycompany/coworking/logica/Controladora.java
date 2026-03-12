package com.mycompany.coworking.logica;

import com.mycompany.coworking.persistencia.ControladoraPersistencia;

public class Controladora {
 
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombre, String apellido, 
            String celular, String email, String membresia, 
            String observaciones, String fecha, String horaInicio, 
            String horaFin, String tipo, String espacio, String estado) {
        
        // Creamos el miembro y asignamos los valores
        Miembro miembro = new Miembro();
        
        miembro.setNombre(nombre);
        miembro.setApellido(apellido);
        miembro.setCelular(celular);
        miembro.setEmail(email);
        miembro.setTipoMembresia(membresia);
        
        //creamos la reserva y asignamos los valores
        Reserva reserva = new Reserva();
        reserva.setFecha(fecha);
        reserva.setHoraInicio(horaInicio);
        reserva.setHoraFin(horaFin);
        reserva.setTipo(tipo);
        reserva.setEspacio(espacio);
        reserva.setEstado(estado);
        reserva.setObservaciones(observaciones);
        
        controlPersis.guardar(miembro,reserva);
        
        
    }

   
    
}
