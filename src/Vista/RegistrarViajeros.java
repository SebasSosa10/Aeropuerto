package Vista;

import Controlador.ControladorViajero;
import Modelo.AdministradorAerolinea;
import Modelo.CapitanVuelo;
import Modelo.EmpleadoLogistica;
import Modelo.GestorMantenimineto;
import Modelo.Persona;
import Modelo.Viajero;
import javax.swing.JOptionPane;

/**
 * @author Sebastian Sosa
 */
public class RegistrarViajeros extends javax.swing.JFrame {

    ControladorViajero controladorviajero;

    public RegistrarViajeros() {
        initComponents();
        setLocationRelativeTo(this);
        this.controladorviajero = new ControladorViajero();
        incializarComboBoxGenero();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNumCelular = new javax.swing.JTextField();
        txtNumDocumento = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        cbGenero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPasaporte = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Genero");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Numero Celular");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Numero Documento");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtNumCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtNumCelular.setForeground(new java.awt.Color(0, 0, 0));
        txtNumCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumCelularKeyTyped(evt);
            }
        });

        txtNumDocumento.setBackground(new java.awt.Color(255, 255, 255));
        txtNumDocumento.setForeground(new java.awt.Color(0, 0, 0));
        txtNumDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumDocumentoKeyTyped(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(255, 214, 94));
        btnRegistrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 214, 94));
        btnLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        cbGenero.setBackground(new java.awt.Color(255, 255, 255));
        cbGenero.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("REGISTRAR VIAJERO");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Usuario");

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));

        txtContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasenia.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contraseña");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Numero de Pasaporte");

        txtPasaporte.setBackground(new java.awt.Color(255, 255, 255));
        txtPasaporte.setForeground(new java.awt.Color(0, 0, 0));
        txtPasaporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasaporteKeyTyped(evt);
            }
        });

        txtNacionalidad.setBackground(new java.awt.Color(255, 255, 255));
        txtNacionalidad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtNacionalidad.setForeground(new java.awt.Color(0, 0, 0));
        txtNacionalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNacionalidadKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nacionalidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNacionalidad)
                                .addComponent(txtPasaporte)
                                .addComponent(txtContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(48, 48, 48))
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

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        VentanaLogin ventana = new VentanaLogin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String usuario = txtUsuario.getText();
        String contrasenia = txtContrasenia.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String Genero = cbGenero.getSelectedItem().toString();
        String numCelular = txtNumCelular.getText();
        String numDocumen = txtNumDocumento.getText();
        String numPasaporte = txtPasaporte.getText();
        String nacionalidad = txtNacionalidad.getText();
        Viajero viaje = new Viajero(numPasaporte, nacionalidad, nombre, apellido, Genero, numCelular, numDocumen, usuario, contrasenia);
        AdministradorAerolinea admin = controladorviajero.verificarAdministradorAerolinea(viaje);
        Persona persona = controladorviajero.verificarEmpleado(viaje);
        Viajero viajero = (Viajero) controladorviajero.buscar(viaje.getNumDocumento());
        if (admin != null) {
            int A = JOptionPane.showConfirmDialog(null, "¿Ya tienes  creada una cuenta de Administrador de Aereolinea Quieres crear una de Viajero? ");
            if (A == 0) {
                Viajero ad = new Viajero(numPasaporte, nacionalidad, admin.getNombre(), admin.getApellido(), admin.getGenero(), numCelular, admin.getNumDocumento(), usuario, contrasenia);
                boolean respuesta = controladorviajero.guardarViajero(ad);
                if (respuesta) {
                    limpiarViaje();
                    JOptionPane.showMessageDialog(null, "Se ha creado su cuenta de Viajero");
                } else {
                    JOptionPane.showMessageDialog(null, "No se creo la cuenta de viajero");
                }
            }
        } else if (persona instanceof EmpleadoLogistica) {
            int E = JOptionPane.showConfirmDialog(null, "Ya tienes  creada una cuenta de Empleado de Logistica Quieres crear una de viajero ");
            if (E == 0) {
                Viajero em = new Viajero(numPasaporte, nacionalidad, persona.getNombre(), persona.getApellido(), persona.getGenero(), numCelular, persona.getNumDocumento(), usuario, contrasenia);
                boolean respuesta = controladorviajero.guardarViajero(em);
                if (respuesta) {
                    limpiarViaje();
                    JOptionPane.showMessageDialog(null, "Se ha creado su cuenta de Viajero");
                } else {
                    JOptionPane.showMessageDialog(null, "No se creo la cuenta de viajero");
                }
            }
        } else if (persona instanceof CapitanVuelo) {
            Viajero ca = new Viajero(numPasaporte, nacionalidad, persona.getNombre(), persona.getApellido(), persona.getGenero(), numCelular, persona.getNumDocumento(), usuario, contrasenia);
            int C = JOptionPane.showConfirmDialog(null, "Ya tienes  creada una cuenta de Capitan Quieres crear una de viajero ");
            if (C == 0) {
                boolean respuesta = controladorviajero.guardarViajero(ca);
                if (respuesta) {
                    limpiarViaje();
                    JOptionPane.showMessageDialog(null, "Se ha creado su cuenta de Viajero");
                } else {
                    JOptionPane.showMessageDialog(null, "No se creo la cuenta de viajero");
                }
            }
        } else if (persona instanceof GestorMantenimineto) {
            Viajero gestorMan = new Viajero(numPasaporte, nacionalidad, persona.getNombre(), persona.getApellido(), persona.getGenero(), numCelular, persona.getNumDocumento(), usuario, contrasenia);
            int G = JOptionPane.showConfirmDialog(null, "Ya tienes  creada una cuenta de Gestor De Mantenimiento Quieres crear una de viajero ");
            if (G == 0) {
                boolean respuesta = controladorviajero.guardarViajero(gestorMan);
                if (respuesta) {
                    limpiarViaje();
                    JOptionPane.showMessageDialog(null, "Se ha creado su cuenta de Viajero");
                } else {
                    JOptionPane.showMessageDialog(null, "No se creo la cuenta de viajero");
                }
            }
        } else if (viajero == null) {
            boolean aux = controladorviajero.guardarViajero(viaje);
            if (aux) {
                limpiarViaje();
                JOptionPane.showMessageDialog(null, " Se Registra el Viajero");
            } else {
                JOptionPane.showMessageDialog(null, "No  Se Registra el Viajero");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Se Registra el Viajero");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtPasaporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasaporteKeyTyped
        char num = evt.getKeyChar();
        if (num < '0' || num > '9')
            evt.consume();
    }//GEN-LAST:event_txtPasaporteKeyTyped

    private void txtNumCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCelularKeyTyped
        char num = evt.getKeyChar();
        if (num < '0' || num > '9')
            evt.consume();
    }//GEN-LAST:event_txtNumCelularKeyTyped

    private void txtNumDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocumentoKeyTyped
        char num = evt.getKeyChar();
        if (num < '0' || num > '9')
            evt.consume();
    }//GEN-LAST:event_txtNumDocumentoKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z'))
            evt.consume();
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z'))
            evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNacionalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNacionalidadKeyTyped
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z'))
            evt.consume();
    }//GEN-LAST:event_txtNacionalidadKeyTyped

    private void limpiarViaje() {
        txtUsuario.setText("");
        txtContrasenia.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        cbGenero.setSelectedIndex(0);
        txtNumCelular.setText("");
        txtNumDocumento.setText("");
        txtPasaporte.setText("");
        txtNacionalidad.setText("");
    }

    //Método para inicializar el ComboBox de Genero
    private void incializarComboBoxGenero() {
        cbGenero.removeAllItems();
        cbGenero.addItem("Seleccionar");
        cbGenero.addItem("Hombre");
        cbGenero.addItem("Mujer");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCelular;
    private javax.swing.JTextField txtNumDocumento;
    private javax.swing.JTextField txtPasaporte;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}