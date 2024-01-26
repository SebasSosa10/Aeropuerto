package Vista;

import Controlador.ControladorSolicitudMantenimiento;
import Modelo.Aerolinea;
import Modelo.SolicitudMantenimiento;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author joans
 */
public class VentanaChatEmpleado extends javax.swing.JFrame {

    ControladorSolicitudMantenimiento controladorSolicitudMantenimiento;
    Aerolinea aero;

    public VentanaChatEmpleado(Aerolinea aero) {
        initComponents();
        this.aero = aero;
        this.controladorSolicitudMantenimiento = new ControladorSolicitudMantenimiento();
        actualizarMensaje();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnMensaje = new javax.swing.JButton();
        txtMensaje = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        btnMensaje.setBackground(new java.awt.Color(255, 214, 94));
        btnMensaje.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnMensaje.setForeground(new java.awt.Color(0, 0, 0));
        btnMensaje.setText("Mensaje");
        btnMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensajeActionPerformed(evt);
            }
        });

        txtMensaje.setBackground(new java.awt.Color(255, 255, 255));
        txtMensaje.setForeground(new java.awt.Color(0, 0, 0));
        txtMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensajeActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 214, 94));
        btnAtras.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("Atra");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnMensaje))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMensaje)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras)
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensajeActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VentanaEmpleado ventana = new VentanaEmpleado(aero);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensajeActionPerformed
        String mensaje = "Emple: " + txtMensaje.getText();
        this.aero = controladorSolicitudMantenimiento.enviarMensajeE(this.aero, mensaje);
        actualizarMensaje();
        limpiar();
    }//GEN-LAST:event_btnMensajeActionPerformed

    private void actualizarMensaje() {
    int totalSolicitudes = 0;

    for (int i = 0; i < controladorSolicitudMantenimiento.getListaAerolineas().size(); i++) {
        if (this.aero.getCodigoAerolinea().equals(controladorSolicitudMantenimiento.getListaAerolineas().get(i).getCodigoAerolinea())) {
            for (int j = 0; j < controladorSolicitudMantenimiento.getListaAerolineas().get(i).getListaSolicitud().size(); j++) {
                totalSolicitudes += controladorSolicitudMantenimiento.getListaAerolineas().get(i).getListaSolicitud().get(j).getMensajes().size();
            }
        }
    }

    DefaultTableModel modelo = new DefaultTableModel(new String[]{"MENSAJE"}, totalSolicitudes);
    tblTabla.setModel(modelo);

    TableModel modeloDatos = tblTabla.getModel();
    int fila = 0;

    for (int i = 0; i < controladorSolicitudMantenimiento.getListaAerolineas().size(); i++) {
        if (this.aero.getCodigoAerolinea().equals(controladorSolicitudMantenimiento.getListaAerolineas().get(i).getCodigoAerolinea())) {
            for (int j = 0; j < controladorSolicitudMantenimiento.getListaAerolineas().get(i).getListaSolicitud().size(); j++) {
                for (int k = 0; k < controladorSolicitudMantenimiento.getListaAerolineas().get(i).getListaSolicitud().get(j).getMensajes().size(); k++) {
                    SolicitudMantenimiento aux = controladorSolicitudMantenimiento.getListaAerolineas().get(i).getListaSolicitud().get(j);
                    modeloDatos.setValueAt(aux.getMensajes().get(k), fila, 0);
                    fila++;
                }
            
                modelo.addRow(new Object[]{""});
            }
        }
    }
}

    private void limpiar() {
        txtMensaje.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnMensaje;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtMensaje;
    // End of variables declaration//GEN-END:variables
}
