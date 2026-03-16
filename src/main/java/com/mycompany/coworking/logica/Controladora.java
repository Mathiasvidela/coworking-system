package com.mycompany.coworking.logica;

import com.mycompany.coworking.persistencia.ControladoraPersistencia;
import java.util.List;

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
        // relacionar reserva con miembro
        reserva.setUnMiembro(miembro);

        
        controlPersis.guardar(miembro,reserva);
        
        
    }

    public List<Reserva> traerReservas() {
        
        return controlPersis.TraerReservas();
        
        
    }

    public void borrarReserva(int idReserva) {
        
        controlPersis.borrarReserva(idReserva);

    }

    public Reserva traerReserva(int idReserva) {
        return controlPersis.traerReserva(idReserva);
        
    }

    public void modificarReserva(Reserva reserv, String nombre, String apellido, String celular, String email,
            String membresia, String observaciones, String fecha, String horaInicio, String horaFin, String tipo,
            String espacio, String estado) {
        
        reserv.setObservaciones(observaciones);
        reserv.setFecha(fecha);
        reserv.setHoraInicio(horaInicio);
        reserv.setHoraFin(horaFin);
        reserv.setTipo(tipo);
        reserv.setEstado(estado);
        reserv.setEspacio(espacio);
        
        //modificar reserva
        controlPersis.modificarReserva(reserv);
        
        //setear el cliente
        Miembro miembro = this.buscarCliente(reserv.getUnMiembro().getIdMiembro());
        miembro.setNombre(nombre);
        miembro.setApellido(apellido);
        miembro.setCelular(celular);
        miembro.setEmail(email);
        miembro.setTipoMembresia(membresia);
        
        //modificar cliente
        this.modificarCliente(miembro);
        
        
    }

    private Miembro buscarCliente(int idMiembro) {
       return controlPersis.traerCliente(idMiembro);
    }

    private void modificarCliente(Miembro miembro) {
        controlPersis.modificarCliente(miembro);
    }

  

   
    
}
