
package Formularios;

import javax.swing.ImageIcon;


public class frmVentanaConfiguracion extends javax.swing.JFrame {
   

    public frmVentanaConfiguracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlproductos = new javax.swing.JPanel();
        btnreportesventa = new javax.swing.JButton();
        btncambiarprecio = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlproductos.setBackground(new java.awt.Color(102, 102, 102));

        btnreportesventa.setBackground(new java.awt.Color(255, 204, 204));
        btnreportesventa.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnreportesventa.setText("REPORTES DE VENTA");
        btnreportesventa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnreportesventa.setFocusPainted(false);
        btnreportesventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportesventaActionPerformed(evt);
            }
        });

        btncambiarprecio.setBackground(new java.awt.Color(255, 204, 204));
        btncambiarprecio.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btncambiarprecio.setText("    CAMBIAR PRECIO    ");
        btncambiarprecio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncambiarprecio.setFocusPainted(false);
        btncambiarprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiarprecioActionPerformed(evt);
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

        javax.swing.GroupLayout pnlproductosLayout = new javax.swing.GroupLayout(pnlproductos);
        pnlproductos.setLayout(pnlproductosLayout);
        pnlproductosLayout.setHorizontalGroup(
            pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlproductosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncambiarprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreportesventa, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pnlproductosLayout.setVerticalGroup(
            pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlproductosLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btncambiarprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnreportesventa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlproductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnreportesventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportesventaActionPerformed
        frmreportedeventas ventana = new frmreportedeventas();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnreportesventaActionPerformed

    private void btncambiarprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambiarprecioActionPerformed
        frmcambiarprecio ventana = new frmcambiarprecio();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncambiarprecioActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncambiarprecio;
    private javax.swing.JButton btnreportesventa;
    private javax.swing.JButton btnsalir;
    private javax.swing.JPanel pnlproductos;
    // End of variables declaration//GEN-END:variables
}
