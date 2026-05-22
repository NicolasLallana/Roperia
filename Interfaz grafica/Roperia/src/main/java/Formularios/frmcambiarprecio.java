
package Formularios;

import javax.swing.ImageIcon;


public class frmcambiarprecio extends javax.swing.JFrame {
    
    
    public frmcambiarprecio() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlproductos = new javax.swing.JPanel();
        btnchicles = new javax.swing.JButton();
        btnprenda = new javax.swing.JButton();
        btnmochila = new javax.swing.JButton();
        btncartera = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnchupetin = new javax.swing.JButton();
        btnalfajor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SELECCIONE PRODUCTO A MODIFICAR");
        setResizable(false);

        pnlproductos.setBackground(new java.awt.Color(102, 102, 102));
        pnlproductos.setEnabled(false);

        btnchicles.setBackground(new java.awt.Color(255, 204, 204));
        btnchicles.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnchicles.setText("  CHICLES ");
        btnchicles.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnchicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiclesActionPerformed(evt);
            }
        });

        btnprenda.setBackground(new java.awt.Color(255, 204, 204));
        btnprenda.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnprenda.setText(" PRENDA ");
        btnprenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnprenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprendaActionPerformed(evt);
            }
        });

        btnmochila.setBackground(new java.awt.Color(255, 204, 204));
        btnmochila.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnmochila.setText("MOCHILA");
        btnmochila.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnmochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmochilaActionPerformed(evt);
            }
        });

        btncartera.setBackground(new java.awt.Color(255, 204, 204));
        btncartera.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btncartera.setText(" CARTERA");
        btncartera.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncartera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarteraActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(255, 204, 204));
        btnsalir.setFont(new java.awt.Font("Microsoft YaHei", 1, 8)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salida.png"))); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setIconTextGap(7);
        btnsalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnchupetin.setBackground(new java.awt.Color(255, 204, 204));
        btnchupetin.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnchupetin.setText("CHUPETIN");
        btnchupetin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnchupetin.setFocusPainted(false);
        btnchupetin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchupetinActionPerformed(evt);
            }
        });

        btnalfajor.setBackground(new java.awt.Color(255, 204, 204));
        btnalfajor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnalfajor.setText("ALFAJOR");
        btnalfajor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnalfajor.setFocusPainted(false);
        btnalfajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalfajorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlproductosLayout = new javax.swing.GroupLayout(pnlproductos);
        pnlproductos.setLayout(pnlproductosLayout);
        pnlproductosLayout.setHorizontalGroup(
            pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlproductosLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnchicles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmochila, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncartera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnchupetin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnalfajor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlproductosLayout.setVerticalGroup(
            pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlproductosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btncartera, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnmochila, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnchicles, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnchupetin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnalfajor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlproductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnchiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiclesActionPerformed
        frmnuevoprecio ventana = new frmnuevoprecio(5);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnchiclesActionPerformed

    private void btnprendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprendaActionPerformed
        frmnuevoprecio ventana = new frmnuevoprecio(3);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnprendaActionPerformed

    private void btnmochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmochilaActionPerformed
        frmnuevoprecio ventana = new frmnuevoprecio(1);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnmochilaActionPerformed

    private void btncarteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarteraActionPerformed
        frmnuevoprecio ventana = new frmnuevoprecio(2);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncarteraActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnchupetinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchupetinActionPerformed
        frmnuevoprecio ventana = new frmnuevoprecio(6);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnchupetinActionPerformed

    private void btnalfajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalfajorActionPerformed
        frmnuevoprecio ventana = new frmnuevoprecio(7);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnalfajorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnalfajor;
    private javax.swing.JButton btncartera;
    private javax.swing.JButton btnchicles;
    private javax.swing.JButton btnchupetin;
    private javax.swing.JButton btnmochila;
    private javax.swing.JButton btnprenda;
    private javax.swing.JButton btnsalir;
    private javax.swing.JPanel pnlproductos;
    // End of variables declaration//GEN-END:variables
}
