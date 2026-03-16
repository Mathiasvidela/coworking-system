package com.mycompany.coworking.persistencia;

import com.mycompany.coworking.logica.Miembro;
import com.mycompany.coworking.logica.Reserva;
import com.mycompany.coworking.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
   ReservaJpaController reservaJpa = new ReservaJpaController();
   MiembroJpaController miembroJpa = new MiembroJpaController();

    public void guardar(Miembro miembro, Reserva reserva) {
       //creamos en la BD el miembro
       miembroJpa.create(miembro);
       
       //Crear en la BD la reserva
       reservaJpa.create(reserva);
       
    }

    public List<Reserva> TraerReservas() {
       
        return reservaJpa.findReservaEntities();
        
    }

    public void borrarReserva(int idReserva) {
       try {
           reservaJpa.destroy(idReserva);
       } catch (NonexistentEntityException ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

   

    public Reserva traerReserva(int idReserva) {
        return reservaJpa.findReserva(idReserva);
    }

    public void modificarReserva(Reserva reserva) {
       try {
           reservaJpa.edit(reserva);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    public Miembro traerCliente(int idMiembro) {
        return miembroJpa.findMiembro(idMiembro);
    }

    public void modificarCliente(Miembro miembro) {
       try {
           miembroJpa.edit(miembro);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

   
}
