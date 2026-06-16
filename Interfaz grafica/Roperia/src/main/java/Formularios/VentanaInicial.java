
package Formularios;

import javax.swing.ImageIcon;

public class VentanaInicial extends javax.swing.JFrame {

    private VentanaVentas ventanaventas;
    private frmVentanaConfiguracion ventanaconfig;
    
    public VentanaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlprincipal = new Clases.PanelConImagen();
        btnventa = new javax.swing.JButton();
        btnconfiguracion = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ROPERIA JB VERSION 1.1");
        setIconImages(null);
        setName("frminicial"); // NOI18N

        pnlprincipal.setBackground(new java.awt.Color(96, 96, 103));
        pnlprincipal.setForeground(new java.awt.Color(102, 0, 255));

        btnventa.setBackground(new java.awt.Color(255, 204, 204));
        btnventa.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        btnventa.setText("VENTA");
        btnventa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnventa.setFocusPainted(false);
        btnventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnventaActionPerformed(evt);
            }
        });

        btnconfiguracion.setBackground(new java.awt.Color(255, 204, 204));
        btnconfiguracion.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        btnconfiguracion.setText("CONFIGURACIÓN");
        btnconfiguracion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnconfiguracion.setFocusPainted(false);
        btnconfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfiguracionActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(255, 204, 204));
        btnsalir.setFont(new java.awt.Font("Microsoft YaHei", 1, 8)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salida.png"))); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsalir.setFocusPainted(false);
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setIconTextGap(7);
        btnsalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlprincipalLayout = new javax.swing.GroupLayout(pnlprincipal);
        pnlprincipal.setLayout(pnlprincipalLayout);
        pnlprincipalLayout.setHorizontalGroup(
            pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnventa, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnconfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pnlprincipalLayout.setVerticalGroup(
            pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlprincipalLayout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnconfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnventa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnventaActionPerformed
        if (ventanaventas == null){
            if (ventanaconfig != null){
                ventanaconfig.dispose();
            }
            ventanaventas = new VentanaVentas();
            ventanaventas.setVisible(true);
        } else {
            if (ventanaconfig != null){
                ventanaconfig.dispose();
            }
            ventanaventas.toFront();
            ventanaventas.setVisible(true);
        }
        ventanaventas.limpiezaCajas();
    }//GEN-LAST:event_btnventaActionPerformed

    private void btnconfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfiguracionActionPerformed
        if (ventanaconfig == null){
            if (ventanaventas != null){
                ventanaventas.dispose();
            }
            ventanaconfig = new frmVentanaConfiguracion();
            ventanaconfig.setVisible(true);
        } else {
            if (ventanaventas != null){
                ventanaventas.dispose();
            }
            ventanaconfig.toFront();
            ventanaconfig.setVisible(true);
        }
    }//GEN-LAST:event_btnconfiguracionActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconfiguracion;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnventa;
    private javax.swing.JPanel pnlprincipal;
    // End of variables declaration//GEN-END:variables
}
