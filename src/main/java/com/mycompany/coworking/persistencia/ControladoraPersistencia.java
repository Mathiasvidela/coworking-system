package com.mycompany.coworking.persistencia;

import com.mycompany.coworking.logica.Miembro;
import com.mycompany.coworking.logica.Reserva;

public class ControladoraPersistencia {
    
   ReservaJpaController reservaJpa = new ReservaJpaController();
   MiembroJpaController miembroJpa = new MiembroJpaController();

    public void guardar(Miembro miembro, Reserva reserva) {
       //creamos en la BD el miembro
       miembroJpa.create(miembro);
       
       //Crear en la BD la reserva
       reservaJpa.create(reserva);
       
    }
    
}
