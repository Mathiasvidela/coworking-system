package com.mycompany.coworking.igu;

import com.mycompany.coworking.logica.Controladora;
import com.mycompany.coworking.logica.Reserva;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.mycompany.coworking.util.MessageUtil;


public class VerDatos extends javax.swing.JFrame {

    Controladora control = null;
    
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(22, 23, 36));

        jLabel1.setFont(new java.awt.Font("Space Grotesk SemiBold", 1, 36)); // NOI18N
        jLabel1.setText("Reservas");

        jPanel2.setBackground(new java.awt.Color(35, 37, 51));

        tablaReservas.setBackground(new java.awt.Color(40, 42, 54));
        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaReservas);

        jLabel2.setFont(new java.awt.Font("Space Grotesk SemiBold", 1, 18)); // NOI18N
        jLabel2.setText("Datos de las reservas");

        BtnEditar.setBackground(new java.awt.Color(64, 67, 80));
        BtnEditar.setFont(new java.awt.Font("Space Grotesk Medium", 0, 12)); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar1.setBackground(new java.awt.Color(42, 93, 185));
        BtnEliminar1.setFont(new java.awt.Font("Space Grotesk Medium", 0, 12)); // NOI18N
        BtnEliminar1.setText("Eliminar");
        BtnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnEliminar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnVolver.setBackground(new java.awt.Color(64, 67, 80));
        btnVolver.setFont(new java.awt.Font("Space Grotesk SemiBold", 0, 12)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
       if (tablaReservas.getRowCount() > 0){
            
            //condicional para controlar que se selecciono un registro
            if(tablaReservas.getSelectedRow() != -1){
                
                int idReserva = Integer.parseInt(String.valueOf(tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 0)));
                
                EditarReserva pantallaEditar = new EditarReserva(idReserva);
                pantallaEditar.setVisible(true);
                pantallaEditar.setLocationRelativeTo(null);
                this.dispose();

            }
            else{
                MessageUtil.mostrarMensaje("No se selecciono ninguna reserva", "Error", "Error al eliminar");
            }
   
        }
        else{
            MessageUtil.mostrarMensaje("No hay registros para eliminar en la tabla", "Error", "Error al eliminar");
        }
            
        
        
        
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminar1ActionPerformed
        
        //buscar el elemento en la DB
        
        //controlar que la tabla no este vacia
        if (tablaReservas.getRowCount() > 0){
            
            //condicional para controlar que se selecciono un registro
            if(tablaReservas.getSelectedRow() != -1){
                int idReserva = Integer.parseInt(String.valueOf(tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 0)));
                control.borrarReserva(idReserva);
                
                //mensaje de guardado exitoso
                MessageUtil.mostrarMensaje("Se elemino la reserva Correctamente", "Info", "Eliminacion de reserva");
                cargarTabla();
            }
            else{
                MessageUtil.mostrarMensaje("No se selecciono ninguna reserva", "Error", "Error al eliminar");
            }
   
        }
        else{
            MessageUtil.mostrarMensaje("No hay registros para eliminar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_BtnEliminar1ActionPerformed

    
    
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal pantalla = new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // se carga la informacion 
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReservas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            
            //que no sean editables las filas y columnas
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }  
        }; 
        
        //establecer los nombres de las columnas
        String titulos[]  = {"ID", "Fecha", "Hora inicio", "Hora fin",
            "Tipo", "Espacio", "Estado", 
            "Nombre", "Apellido", "Cliente"};   
        
         modeloTabla.setColumnIdentifiers(titulos);  
         
         //carga de datos desde la BD
         List<Reserva> listaReserva = control.traerReservas();
         
         //recorrer la lista y mostrar los elementos en la tabla
         if (listaReserva!=null){
             for (Reserva reserva : listaReserva){
                 Object[] objReserva
                 = { reserva.getIdReserva(),
                 reserva.getFecha(),
                 reserva.getHoraInicio(),
                 reserva.getHoraFin(),
                 reserva.getTipo(),
                 reserva.getEspacio(),
                 reserva.getEstado(),
                 reserva.getUnMiembro().getNombre(),
                 reserva.getUnMiembro().getApellido(),
                 reserva.getUnMiembro().getTipoMembresia()};
                 
                 modeloTabla.addRow(objReserva);
             }
         }
         
         tablaReservas.setModel(modeloTabla);
        
    };
}
