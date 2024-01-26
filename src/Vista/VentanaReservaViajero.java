package Vista;

import Controlador.ControladorAerolinea;
import Controlador.ControladorViajero;
import Exepciones.reservaNoencontradaException;
import Modelo.Aerolinea;
import Modelo.Reserva;
import Modelo.Viajero;
import Modelo.Vuelo;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sebastian Sosa
 */
public class VentanaReservaViajero extends javax.swing.JFrame {

    Viajero viajero;
    Aerolinea aerolinea;
    ControladorViajero control;
    ControladorAerolinea controladorAerolinea;
    ControladorViajero controladorViajero;

    public VentanaReservaViajero(Viajero viajero) {
        initComponents();
        setLocationRelativeTo(this);
        this.viajero = viajero;
        this.control = new ControladorViajero();
        this.controladorAerolinea = new ControladorAerolinea();
        this.controladorViajero = new ControladorViajero();
        actualizartabla();
       
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
        tblReservas = new javax.swing.JTable();
        btnCancelarReserva = new javax.swing.JButton();
        btnAtras1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblReservas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblReservas);

        btnCancelarReserva.setBackground(new java.awt.Color(255, 214, 94));
        btnCancelarReserva.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnCancelarReserva.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarReserva.setText("Cancelar Rerserva");
        btnCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarReservaActionPerformed(evt);
            }
        });

        btnAtras1.setBackground(new java.awt.Color(255, 214, 94));
        btnAtras1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnAtras1.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras1.setText("Atras");
        btnAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras1)
                .addGap(30, 30, 30)
                .addComponent(btnCancelarReserva)
                .addGap(264, 264, 264))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarReserva)
                    .addComponent(btnAtras1))
                .addGap(18, 18, 18))
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

  

    private void btnCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarReservaActionPerformed
 
        try {
        int filaSeleccionada = tblReservas.getSelectedRow();
        if (filaSeleccionada != -1) {
            String codigo = (String) tblReservas.getValueAt(filaSeleccionada, 6);
                
            this.viajero  = controladorViajero.cancelarReserva(codigo, viajero);
           
               actualizartabla();
            JOptionPane.showMessageDialog(null, "Se cancelo el vuelo");
            } else {
            JOptionPane.showMessageDialog(null, "Seleccione la reserva que desea cancelar");
        }
              
                
                
        } catch (reservaNoencontradaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
              
            
        

    }//GEN-LAST:event_btnCancelarReservaActionPerformed

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        // TODO add your handling code here:
        VentanaViajeroMenu ven = new VentanaViajeroMenu(viajero);
        ven.setVisible(true);
        ven.setLocationRelativeTo(this);
        dispose();
    }//GEN-LAST:event_btnAtras1ActionPerformed

    private void actualizartabla() {
              LocalDateTime fechaHoy = LocalDateTime.now();
        int totalReservas = 0;
        for (int i = 0; i < controladorViajero.getListaAerolineas().size(); i++) {
            for (int j = 0; j < controladorViajero.getListaAerolineas().get(i).getListaVuelos().size(); j++) {
                for (int k = 0; k < controladorViajero.getListaAerolineas().get(i).getListaVuelos().get(j).getListaReserva().size(); k++) {
                    totalReservas++;
                }
            }
        }
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"ORIGEN", "DESTINO", "FECHA", "HORA SALIDA",
            "TIEMPO TRAYECTORIA", "AVION", "CODIGO VUELO", "Aereolinea", "Nombre del Viajero"},
                totalReservas);
        tblReservas.setModel(modelo);
        TableModel modeloDatos = tblReservas.getModel();
        SimpleDateFormat standar1 = new SimpleDateFormat("dd/MM/yyyy");
        int fila = 0;
        for (int i = 0; i < controladorViajero.getListaAerolineas().size(); i++) {
            for (int j = 0; j < controladorAerolinea.getListaAerolineas().get(i).getListaVuelos().size(); j++) {
                for (int k = 0; k < controladorViajero.getListaAerolineas().get(i).getListaVuelos().get(j).getListaReserva().size(); k++) {
                    if (viajero.getNumDocumento().equals((controladorViajero.getListaAerolineas().get(i).getListaVuelos().get(j).
                            getListaReserva().get(k).getViajero().getNumDocumento()))&&fechaHoy.isBefore((controladorAerolinea.getListaAerolineas().get(i).getListaVuelos().get(j).getFechaSalida()))) {
                        if (fila < totalReservas) {
                            Reserva aux = controladorViajero.getListaAerolineas().get(i).getListaVuelos().get(j).getListaReserva().get(k);
                            modeloDatos.setValueAt(aux.getVuelo().getOrigen(), fila, 0);
                            modeloDatos.setValueAt(aux.getVuelo().getDestino(), fila, 1);
                            modeloDatos.setValueAt(standar1.format(java.sql.Date.valueOf(aux.getVuelo().getFechaSalida().toLocalDate())), fila, 2);
                            modeloDatos.setValueAt(((aux.getVuelo().getFechaSalida().toLocalTime().toString())), fila, 3);
                            modeloDatos.setValueAt(aux.getVuelo().getFechaLlegada().toLocalTime().toString(), fila, 4);
                            modeloDatos.setValueAt(aux.getVuelo().getAvion().getModelo(), fila, 5);
                            modeloDatos.setValueAt(aux.getVuelo().getCodigoVuelo(), fila, 6);
                            modeloDatos.setValueAt(controladorViajero.getListaAerolineas().get(i).getNombreAerolinea(), fila, 7);
                            modeloDatos.setValueAt(controladorViajero.getListaAerolineas().get(i).getListaVuelos().get(j).getListaReserva().get(k).getViajero().getNombre(), fila, 8);
                            fila++;
                        }
                   
                    
                    
                    }
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnCancelarReserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReservas;
    // End of variables declaration//GEN-END:variables
}