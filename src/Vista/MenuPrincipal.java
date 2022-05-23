package Vista;



import TallerUltimobanco.Cuenta;
import TallerUltimobanco.Factura;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipal extends javax.swing.JFrame {

    private List<Cuenta> Lista;
   
    public MenuPrincipal() {
        initComponents();
        Lista = new ArrayList();
        Datos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cuentas = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tipoMov = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Registrar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        n = new javax.swing.JLabel();
        nd = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        txtDocu = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        lblSaldo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaC = new javax.swing.JTable();
        Crear = new javax.swing.JButton();
        Pequeño = new javax.swing.JRadioButton();
        Mediano = new javax.swing.JRadioButton();
        Grande = new javax.swing.JRadioButton();
        c = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCuentas = new javax.swing.JButton();
        TablaCuentas = new javax.swing.JScrollPane();
        TablaCu = new javax.swing.JTable();
        btnCuenta = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        nc = new javax.swing.JLabel();
        txtnc = new javax.swing.JTextField();
        sa = new javax.swing.JLabel();
        txtsa = new javax.swing.JTextField();
        cu = new javax.swing.JLabel();
        txtcu = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNuCuenta = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNDocumento = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        Registrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Registrar.setText("Registrar Compra");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(Registrar);
        Registrar.setBounds(700, 290, 160, 40);

        Consultar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(Consultar);
        Consultar.setBounds(700, 350, 160, 40);

        n.setBackground(new java.awt.Color(0, 0, 0));
        n.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        n.setText("Nombre: ");
        jPanel1.add(n);
        n.setBounds(30, 90, 51, 14);

        nd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nd.setText("Número de documento: ");
        jPanel1.add(nd);
        nd.setBounds(570, 80, 133, 14);

        t.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        t.setText("Teléfono: ");
        jPanel1.add(t);
        t.setBounds(30, 130, 54, 14);

        txtDocu.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jPanel1.add(txtDocu);
        txtDocu.setBounds(740, 80, 127, 30);

        txtTelefono.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jPanel1.add(txtTelefono);
        txtTelefono.setBounds(130, 130, 127, 30);

        txtNombre.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jPanel1.add(txtNombre);
        txtNombre.setBounds(130, 90, 127, 30);

        txtSaldo.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });
        jPanel1.add(txtSaldo);
        txtSaldo.setBounds(740, 120, 127, 30);

        lblSaldo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSaldo.setText("Primer Pago:");
        jPanel1.add(lblSaldo);
        lblSaldo.setBounds(630, 130, 83, 14);

        TablaC.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        TablaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TablaC);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(50, 260, 494, 171);

        Crear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Crear.setText("Crear cuenta");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        jPanel1.add(Crear);
        Crear.setBounds(40, 210, 103, 23);

        buttonGroup1.add(Pequeño);
        Pequeño.setText("150000000");
        jPanel1.add(Pequeño);
        Pequeño.setBounds(449, 160, 90, 23);

        buttonGroup1.add(Mediano);
        Mediano.setText("180000000");
        jPanel1.add(Mediano);
        Mediano.setBounds(449, 190, 90, 23);

        buttonGroup1.add(Grande);
        Grande.setText("200000000");
        Grande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrandeActionPerformed(evt);
            }
        });
        jPanel1.add(Grande);
        Grande.setBounds(449, 220, 90, 23);

        c.setText("Tamaño de Apartamento");
        jPanel1.add(c);
        c.setBounds(300, 160, 140, 14);

        a.setText("80 m ");
        jPanel1.add(a);
        a.setBounds(550, 160, 50, 14);

        e.setText("2");
        jPanel1.add(e);
        e.setBounds(580, 160, 10, 10);

        b.setText("125 m");
        jPanel1.add(b);
        b.setBounds(550, 190, 40, 14);

        d.setText("2");
        jPanel1.add(d);
        d.setBounds(590, 180, 30, 14);

        f.setText("200 m ");
        jPanel1.add(f);
        f.setBounds(550, 220, 40, 14);

        g.setText("2");
        jPanel1.add(g);
        g.setBounds(586, 210, 10, 14);

        jLabel16.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("Venta de Apartamentos");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(210, 30, 320, 50);

        jTabbedPane2.addTab("Factura", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));

        btnCuentas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCuentas.setText("Ver Cuentas");
        btnCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentasActionPerformed(evt);
            }
        });

        TablaCu.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        TablaCu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaCuentas.setViewportView(TablaCu);

        btnCuenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCuenta.setText("Consultar movimientos");
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        id.setText("Numero documento: ");

        txtid.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N

        nc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nc.setText("Numero de cuenta:");

        txtnc.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N

        sa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sa.setText("Saldo: ");

        txtsa.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N

        cu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cu.setText("Tipo: ");

        txtcu.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TablaCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCuenta))
                .addGap(183, 183, 183))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nc)
                        .addGap(29, 29, 29)
                        .addComponent(txtnc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(cu)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtcu))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sa)
                .addGap(28, 28, 28)
                .addComponent(txtsa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtsa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sa))
                            .addComponent(nc, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(TablaCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("Registro", jPanel2);

        jPanel3.setBackground(new java.awt.Color(56, 167, 156));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Numero  de factura:");

        txtNuCuenta.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N

        btnVerificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnVerificar.setText("Realizar movimiento");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Numero de documento:");

        txtNDocumento.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N

        valor.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Valor: ");
        jLabel9.setToolTipText("");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel13.setText(" CONSIGNAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel7)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVerificar)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txtNuCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(194, 194, 194)
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtNDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(145, 145, 145))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNuCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(45, 45, 45)
                        .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("Consignar ", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
      this.Verificar();
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
       this.ConsultarMovimientos();
    }//GEN-LAST:event_btnCuentaActionPerformed

    private void btnCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentasActionPerformed
      this.InfoCuenta();
    }//GEN-LAST:event_btnCuentasActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        mDatos2();
        Registrar.setVisible(true);
        txtNombre.setEditable(true);
        txtDocu.setEditable(true);
    }//GEN-LAST:event_CrearActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed

    }//GEN-LAST:event_txtSaldoActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed

     this.Consultar();
    }//GEN-LAST:event_ConsultarActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
     this.Registrar();
    }//GEN-LAST:event_RegistrarActionPerformed

    private void GrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrandeActionPerformed
       
    }//GEN-LAST:event_GrandeActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Crear;
    private javax.swing.ButtonGroup Cuentas;
    private javax.swing.JRadioButton Grande;
    private javax.swing.JRadioButton Mediano;
    private javax.swing.JRadioButton Pequeño;
    private javax.swing.JButton Registrar;
    private javax.swing.JTable TablaC;
    private javax.swing.JTable TablaCu;
    private javax.swing.JScrollPane TablaCuentas;
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnCuentas;
    private javax.swing.JButton btnVerificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel c;
    private javax.swing.JLabel cu;
    private javax.swing.JLabel d;
    private javax.swing.JLabel e;
    private javax.swing.JLabel f;
    private javax.swing.JLabel g;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel n;
    private javax.swing.JLabel nc;
    private javax.swing.JLabel nd;
    private javax.swing.JLabel sa;
    private javax.swing.JLabel t;
    private javax.swing.ButtonGroup tipoMov;
    private javax.swing.JTextField txtDocu;
    private javax.swing.JTextField txtNDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNuCuenta;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtcu;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnc;
    private javax.swing.JTextField txtsa;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables

    private void Consultar() {
            mDatos();
      
        TablaC.setModel(new DefaultTableModel());
        String cedula = JOptionPane.showInputDialog("Digite número de cédula a buscar");
        Cuenta persona = null;
        for (Cuenta person : Lista) {
            if (person.getDocumento().equals(cedula)) {
                persona = person;
            }
        }
        if (persona != null) {
            mostrarPersona(persona);
        } else {
            limpiar();
            JOptionPane.showMessageDialog(this, "La cedula " + cedula + " no existe");
        }
    }

    private void Registrar() {
          mDatos();

        int contador = 0;
            contador++;
        if (txtNombre.getText().equals("") || txtDocu.getText().equals("") || txtTelefono.getText().equals("") || txtSaldo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campos vacios",
                "Error datos", JOptionPane.ERROR_MESSAGE);
        } else {
            if (Pequeño.isSelected() && Integer.parseInt(txtSaldo.getText()) > 0) {
                   Factura fac = new Factura();
                    Random r = new Random();
                    fac.setDocumento(txtDocu.getText());
                    fac.setNombre(txtNombre.getText());
                    fac.setTelefono(txtTelefono.getText());
                    fac.setCuenta("Cuenta Ahorro");
                    int numeroFactura = r.nextInt(6) + 63256332;
                    fac.setNumeroCuenta(String.valueOf(numeroFactura));
                    fac.setSaldo(Double.parseDouble(txtSaldo.getText()));
                    fac.setPrecio(150000000 - fac.getSaldo());
                    
                    tablaC(numeroFactura);
                    limpiar();
                    Lista.add(fac);

                } else if (Mediano.isSelected()) {
                     Factura fac = new Factura();
                    Random r = new Random();
                    fac.setDocumento(txtDocu.getText());
                    fac.setNombre(txtNombre.getText());
                    fac.setTelefono(txtTelefono.getText());
                    fac.setCuenta("Cuenta Ahorro");
                    int numeroFactura = r.nextInt(3);
                    fac.setNumeroCuenta(String.valueOf(numeroFactura));
                    fac.setSaldo(Double.parseDouble(txtSaldo.getText()));
                    fac.setPrecio(180000000 - fac.getSaldo());
                    
                    tablaC(numeroFactura);
                    limpiar();
                    Lista.add(fac);

                    
                } else if (Grande.isSelected()) {
                   Factura fac = new Factura();
                    Random r = new Random();
                    fac.setDocumento(txtDocu.getText());
                    fac.setNombre(txtNombre.getText());
                    fac.setTelefono(txtTelefono.getText());
                    fac.setCuenta("Cuenta Ahorro");
                    int numeroFactura = r.nextInt(2);
                    fac.setNumeroCuenta(String.valueOf(numeroFactura));
                    fac.setSaldo(Double.parseDouble(txtSaldo.getText()));
                    fac.setPrecio(200000000 - fac.getSaldo());

                    tablaC(numeroFactura);
                    limpiar();
                    Lista.add(fac);

                  
                } else {
                    JOptionPane.showMessageDialog(this, "Algo anda mal. Revise los datos ",
                        "Error datos", JOptionPane.ERROR_MESSAGE);
                }
      

        }
    }

    private void ConsultarMovimientos() {
         mDatos();
        String cuenta = JOptionPane.showInputDialog("Digite número de factura que desea buscar");
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getNumeroCuenta().equals(cuenta)) {
                JOptionPane.showMessageDialog(this, Lista.get(i).getMovi().toString());
            } else {
                limpiar();
            }
        }
    }

    private void InfoCuenta() {
            mDatos3();
        TablaCu.setModel(new DefaultTableModel());
        Cuenta cuentas = null;
        for (Cuenta cuentaa : Lista) {
            cuentas = cuentaa;
        }
        if (cuentas != null) {
            String[] titulos = {"Nombre cliente", "Numero de Factura", "Valor a Pagar"};
            DefaultTableModel modelo = (DefaultTableModel) TablaCu.getModel();
            modelo.setColumnIdentifiers(titulos);
            Object[] fila = new Object[3];
            for (int i = 0; i < Lista.size(); i++) {
                fila[0] = Lista.get(i).getNombre();
                fila[1] = Lista.get(i).getNumeroCuenta();
                fila[2] = String.valueOf(Lista.get(i).getPrecio());
                modelo.addRow(fila);
            }
            TablaCu.setModel(modelo);
        } else {
            limpiar();
            JOptionPane.showMessageDialog(this, "No existen cuentas");
        }
    }        
    public void Verificar(){
        String documento = txtNDocumento.getText();
        String cu = txtNuCuenta.getText();
        double Saldo1 = 0;
        if (txtNuCuenta.getText().equals("") || txtNDocumento.getText().equals("") || valor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campos vacios",
                "Error datos", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < Lista.size(); i++) {
                if (Lista.get(i).getDocumento().equals(documento) && Lista.get(i).getNumeroCuenta().equals(cu)) {
                    
                    if(Lista.get(i).getSaldo()<= Lista.get(i).getPrecio()){
                        
                        Lista.get(i).setFecha(String.valueOf(Calendar.getInstance().getTime()));
                        Lista.get(i).setMovimiento("Consignacion");
                        double z = Double.parseDouble(Lista.get(i).Saldo());
                        Lista.get(i).setSaldo(0);
                        Lista.get(i).setValor(0);
                        double a = z + Double.parseDouble(valor.getText());
                        Lista.get(i).setSaldo(a);
                        double b = Lista.get(i).getPrecio() - Double.parseDouble(valor.getText());
                        Lista.get(i).setPrecio(b);
                        
                        JOptionPane.showMessageDialog(this, "Pago Realizado \n" + "Pagado:\n " + a +"Falta por Pagar:"+ b);
                        Lista.get(i).consignar(Double.parseDouble(valor.getText()), String.valueOf(Calendar.getInstance().getTime()));
                }
                  else{
                        JOptionPane.showMessageDialog(this, "El apartamento ya esta vendido.");
                    }
            }
            limpiar();
        }
      }
}
    public void mDatos2() {
        txtNombre.setVisible(true);
        txtNDocumento.setVisible(true);
        txtTelefono.setVisible(true);
        txtSaldo.setVisible(true);
        txtDocu.setVisible(true);
        nd.setVisible(true);
        n.setVisible(true);
        t.setVisible(true);
        lblSaldo.setVisible(true);
         Pequeño.setVisible(true);
        Mediano.setVisible(true);
        Grande.setVisible(true);
        a.setVisible(true);
        b.setVisible(true);
        d.setVisible(true);
        e.setVisible(true);
        f.setVisible(true);
        g.setVisible(true);
         c.setVisible(true);

    }

    public void mDatos() {
        txtNombre.setVisible(false);
        txtTelefono.setVisible(false);
        txtSaldo.setVisible(false);
        txtDocu.setVisible(false);
        nd.setVisible(false);
        n.setVisible(false);
        t.setVisible(false);
        lblSaldo.setVisible(false);
        Registrar.setVisible(false);
        Pequeño.setVisible(false);
        Mediano.setVisible(false);
        Grande.setVisible(false);
        a.setVisible(false);
        b.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(false);
        c.setVisible(false);
    }

    public void mDatos3() {
        id.setVisible(false);
        nc.setVisible(false);
        cu.setVisible(false);
        sa.setVisible(false);
        txtid.setVisible(false);
        txtnc.setVisible(false);
        txtcu.setVisible(false);
        txtsa.setVisible(false);
        
    }

    public void tablaC(int r) {
        String[] titulos = {"Nombre", "Documento", "Numero Apartamento"};
        DefaultTableModel modelo = (DefaultTableModel) TablaC.getModel();
        modelo.setColumnIdentifiers(titulos);
        Object[] fila = new Object[3];
        fila[0] = txtNombre.getText();
        fila[1] = txtDocu.getText();
        fila[2] = r;
        modelo.addRow(fila);
        TablaC.setModel(modelo);
    }

    public void limpiar() {
        txtNombre.setText(null);
        txtDocu.setText(null);
        txtTelefono.setText(null);
        txtSaldo.setText(null);
        Cuentas.clearSelection();
        tipoMov.clearSelection();
        valor.setText(null);
        txtNDocumento.setText(null);
        txtNuCuenta.setText(null);
        tipoMov.clearSelection();
        txtid.setText(null);
        txtnc.setText(null);
        txtcu.setText(null);
        txtsa.setText(null);
    }

    public void mostrarPersona(Cuenta persona) {
        String[] titulos = {"Nombre", "Documento", "Telefono", "Saldo"};
        DefaultTableModel modelo = (DefaultTableModel) TablaC.getModel();
        modelo.setColumnIdentifiers(titulos);
        Object[] fila = new Object[4];
        fila[0] = persona.getNombre();
        fila[1] = persona.getDocumento();
        fila[2] = persona.getTelefono();
        fila[3] = persona.getSaldo();
        modelo.addRow(fila);
        TablaC.setModel(modelo);
    }

    public void Datos() {
        mDatos3();
        mDatos();
    }

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
}

