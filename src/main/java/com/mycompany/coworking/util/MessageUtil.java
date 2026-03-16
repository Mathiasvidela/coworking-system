
package com.mycompany.coworking.util;

public class MessageUtil {
    
    public static void mostrarMensaje(String mensaje, String tipo, String titulo){
            
        int tipoMensaje = 0 ;
        
        if (tipo.equals("Info")){
            tipoMensaje = javax.swing.JOptionPane.INFORMATION_MESSAGE;
        } else if (tipo.equals("Error")){
            tipoMensaje = javax.swing.JOptionPane.ERROR_MESSAGE;
        } 

        //mensaje
            javax.swing.JOptionPane.showMessageDialog(
                null,
                mensaje,
                titulo,
                tipoMensaje
                
            );
            
    }
    
}
