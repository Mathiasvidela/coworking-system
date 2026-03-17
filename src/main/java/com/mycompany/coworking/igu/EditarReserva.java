package com.mycompany.coworking.igu;

import com.mycompany.coworking.logica.Controladora;
import com.mycompany.coworking.logica.Reserva;
import com.mycompany.coworking.util.MessageUtil;
import java.awt.Color;



public class EditarReserva extends javax.swing.JFrame {
    Reserva reserv;
    Controladora control = null;
   
    public EditarReserva(int idReserva) {
        control = new Controladora();
        initComponents();
        cargarDatos(idReserva);
        
        jPanel2.setBackground(new Color(46,48,63));
        jPanel2.putClientProperty("JComponent.arc", 30);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHoraInicio = new javax.swing.JTextField();
        txtHoraFin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        cmbEspacio = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        cmbMembresia = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        cmbTipo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        jLabel9.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(22, 23, 36));

        jPanel2.setBackground(new java.awt.Color(40, 42, 54));

        jLabel2.setFont(new java.awt.Font("Space Grotesk", 1, 12)); // NOI18N
        jLabel2.setText("Hora inicio:");

        jLabel3.setFont(new java.awt.Font("Space Grotesk", 1, 12)); // NOI18N
        jLabel3.setText("Fecha:");

        jLabel4.setFont(new java.awt.Font("Space Grotesk", 1, 12)); // NOI18N
        jLabel4.setText("Hora Fin:");

        jLabel5.setFont(new java.awt.Font("Space Grotesk", 1, 12)); // NOI18N
        jLabel5.setText("Tipo:");

        jLabel6.setFont(new java.awt.Font("Space Grotesk", 1, 12)); // NOI18N
        jLabel6.setText("Estado:");

        jLabel7.setFont(new java.awt.Font("Space Grotesk", 1, 12)); // NOI18N
        jLabel7.setText("Observaciones:");

        jLabel8.setFont(new java.awt.Font("Space Grotesk", 1, 12)); // NOI18N
        jLabel8.setText("Espacio:");

        txtFecha.setBackground(new java.awt.Color(46, 48, 63));

        txtHoraInicio.setBackground(new java.awt.Color(46, 48, 63));

        txtHoraFin.setBackground(new java.awt.Color(46, 48, 63));

        txtObservaciones.setBackground(new java.awt.Color(46, 48, 63));
        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        cmbEspacio.setBackground(new java.awt.Color(46, 48, 63));
        cmbEspacio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sala 1", "Sala 2", "Puesto A1", "Puesto A2" }));
        cmbEspacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEspacioActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(35, 37, 51));

        jLabel1.setFont(new java.awt.Font("Space Grotesk SemiBold", 1, 18)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel12.setFont(new java.awt.Font("Space Grotesk", 1, 12)); // NOI18N
        jLabel12.setText("Nombre:");

        jLabel13.setFont(new java.awt.Font("Space Grotesk", 1, 12)); // NOI18N
        jLabel13.setText("Apellido:");

        jLabel14.setFont(new java.awt.Font("Space Grotesk", 1, 12)); // NOI18N
        jLabel14.setText("Celular:");

        jLabel15.setFont(new java.awt.Font("Space Grotesk", 1, 12)); // NOI18N
        jLabel15.setText("Email:");

        jLabel16.setFont(new java.awt.Font("Space Grotesk", 1, 12)); // NOI18N
        jLabel16.setText("Tipo cliente:");

        txtApellido.setBackground(new java.awt.Color(46, 48, 63));

        txtNombre.setBackground(new java.awt.Color(46, 48, 63));

        txtEmail.setBackground(new java.awt.Color(46, 48, 63));

        txtCelular.setBackground(new java.awt.Color(46, 48, 63));

        cmbMembresia.setBackground(new java.awt.Color(46, 48, 63));
        cmbMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Individual", "Empresa", "Institución" }));
        cmbMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMembresiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMembresia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmbMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        cmbEstado.setBackground(new java.awt.Color(46, 48, 63));
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Confirmada", "Pendiente", "Cancelada" }));
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });

        cmbTipo.setBackground(new java.awt.Color(46, 48, 63));
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sala", "Puesto" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(35, 37, 51));

        jLabel11.setFont(new java.awt.Font("Space Grotesk", 1, 24)); // NOI18N
        jLabel11.setText("Modificacion de reserva");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHoraFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbEstado, 0, 126, Short.MAX_VALUE)
                                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(31, 31, 31)
                                .addComponent(cmbEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(cmbEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgDatos.jpg"))); // NOI18N
        jLabel10.setText("jLabel2");

        btnGuardar.setBackground(new java.awt.Color(42, 93, 185));
        btnGuardar.setFont(new java.awt.Font("Space Grotesk SemiBold", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(64, 67, 80));
        btnLimpiar.setFont(new java.awt.Font("Space Grotesk SemiBold", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/borrar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

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
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMembresiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMembresiaActionPerformed

    private void cmbEspacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEspacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEspacioActionPerformed

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //datos del clientes
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String celular = txtCelular.getText();
        String email = txtEmail.getText();
        String membresia = (String) cmbMembresia.getSelectedItem().toString();
        String observaciones = txtObservaciones.getText();
        //datos de la reserva
        String fecha = txtFecha.getText();
        String horaInicio = txtHoraInicio.getText();
        String horaFin = txtHoraFin.getText();
        String tipo = (String) cmbTipo.getSelectedItem().toString();
        String espacio = (String) cmbEspacio.getSelectedItem().toString();
        String estado = (String) cmbEstado.getSelectedItem().toString();

        
        control.modificarReserva(reserv,nombre,apellido,celular,email,membresia,observaciones,fecha,horaInicio,horaFin,tipo,espacio,estado);

        //mensaje de guardado exitoso
        MessageUtil.mostrarMensaje("Se modificaron los datos correctamente", "Info", "Modificacion Exitosa");
        
        VerDatos pantallaDatos = new VerDatos();
        pantallaDatos.setVisible(true);
        pantallaDatos.setLocationRelativeTo(null);
        
        this.dispose();
        
        limpiarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();           
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void limpiarDatos(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        cmbMembresia.setSelectedIndex(0);
        
        txtFecha.setText("");
        txtHoraFin.setText("");
        txtHoraInicio.setText("");
        txtObservaciones.setText("");
        cmbEspacio.setSelectedIndex(0);
        cmbEstado.setSelectedIndex(0);
        cmbTipo.setSelectedIndex(0);
    }
    
    
    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        
        VerDatos pantallaDatos = new VerDatos();
        pantallaDatos.setVisible(true);
        pantallaDatos.setLocationRelativeTo(null);

        this.dispose();
        
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbEspacio;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbMembresia;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int idReserva) {
        
        this.reserv = control.traerReserva(idReserva);
        
        txtNombre.setText(reserv.getUnMiembro().getNombre());
        txtApellido.setText(reserv.getUnMiembro().getApellido());
        txtCelular.setText(reserv.getUnMiembro().getCelular());
        txtEmail.setText(reserv.getUnMiembro().getEmail());
        
        //-, Individual, Empresa, Institución
        if (reserv.getUnMiembro().getTipoMembresia().equals("Individual")){
            cmbMembresia.setSelectedIndex(1);
        } else if (reserv.getUnMiembro().getTipoMembresia().equals("Empresa")){
            cmbMembresia.setSelectedIndex(2);
        } else{
            if(reserv.getUnMiembro().getTipoMembresia().equals("Institución")){
                cmbMembresia.setSelectedIndex(3);
            }
        }
            
        
        
        txtFecha.setText(reserv.getFecha());
        txtHoraFin.setText(reserv.getHoraFin());
        txtHoraInicio.setText(reserv.getHoraInicio());
        txtObservaciones.setText(reserv.getObservaciones());
        
        //Espacio -, Sala 1, Sala 2, Puesto A1, Puesto A2
        if (reserv.getEspacio().equals("Sala 1")){
            cmbEspacio.setSelectedIndex(1);
        } else if (reserv.getEspacio().equals("Sala 2")) {
            cmbEspacio.setSelectedIndex(2);
        } else if (reserv.getEspacio().equals("Puesto A1")){
            cmbEspacio.setSelectedIndex(3);
        } else {
            if (reserv.getEspacio().equals("Puesto A2")){
                cmbEspacio.setSelectedIndex(4);
            }
        }
        
        //estado -, Confirmada, Pendiente, Cancelada
        if (reserv.getEstado().equals("Confirmada")){
            cmbEstado.setSelectedIndex(1);
        } else if (reserv.getEstado().equals("Pendiente")) {
            cmbEstado.setSelectedIndex(2);
        }  else {
            if (reserv.getEstado().equals("Cancelada")){
                cmbEstado.setSelectedIndex(3);
            }
        }

        
        //tipo -, Sala, Puesto
        if (reserv.getTipo().equals("Sala")){
            cmbTipo.setSelectedIndex(1);
        } else {
            if (reserv.getEstado().equals("Puesto")){
                cmbTipo.setSelectedIndex(2);
            }
        }
        
        
        
        
    }
}
