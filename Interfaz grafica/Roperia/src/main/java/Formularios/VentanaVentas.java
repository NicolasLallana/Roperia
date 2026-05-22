
package Formularios;

import Clases.Productos;
import Conexiones.ConsultasBD;
import Conexiones.ConexionBD;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaVentas extends javax.swing.JFrame {
    
    private int idventa;
    private int cantprenda = 0;
    private int cantcartera = 0;
    private int cantmochila = 0;
    private int cantchicle = 0;
    private int cantchupetin = 0;
    private int cantalfajor = 0;
    private Productos listadoprod;
    
    public VentanaVentas() {
        initComponents();
        listadoprod = new Productos();
        this.setLocationRelativeTo(null);
        ConexionBD.setcuenta("roperia", "1234");
        ConexionBD.getConnection();
        System.out.println("Estado: " + ConexionBD.getstatus());
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
     }

    public void limpiezaCajas(){
        cantprenda = 0;
        cantcartera = 0;
        cantmochila = 0;
        cantchicle = 0;
        cantchupetin = 0;
        cantalfajor = 0;
        String cero = "0";
        lblprenda.setText(cero);
        lblcartera.setText(cero);
        lblmochila.setText(cero);
        lblchicles.setText(cero);
        lblchupetin.setText(cero);
        lblalfajor.setText(cero);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlventa = new javax.swing.JPanel();
        pnlproductos = new javax.swing.JPanel();
        btnchicles = new javax.swing.JButton();
        btnprenda = new javax.swing.JButton();
        btnmochila = new javax.swing.JButton();
        btncartera = new javax.swing.JButton();
        lblchicles = new javax.swing.JLabel();
        lblmochila = new javax.swing.JLabel();
        lblprenda = new javax.swing.JLabel();
        lblcartera = new javax.swing.JLabel();
        btnaceptar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnchupetin = new javax.swing.JButton();
        lblchupetin = new javax.swing.JLabel();
        btnalfajor = new javax.swing.JButton();
        lblalfajor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlventa.setBackground(new java.awt.Color(102, 102, 102));

        pnlproductos.setBackground(new java.awt.Color(102, 102, 102));

        btnchicles.setBackground(new java.awt.Color(255, 204, 204));
        btnchicles.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnchicles.setText("  CHICLES ");
        btnchicles.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnchicles.setFocusPainted(false);
        btnchicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiclesActionPerformed(evt);
            }
        });

        btnprenda.setBackground(new java.awt.Color(255, 204, 204));
        btnprenda.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnprenda.setText(" PRENDA ");
        btnprenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnprenda.setFocusPainted(false);
        btnprenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprendaActionPerformed(evt);
            }
        });

        btnmochila.setBackground(new java.awt.Color(255, 204, 204));
        btnmochila.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnmochila.setText("MOCHILA");
        btnmochila.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnmochila.setFocusPainted(false);
        btnmochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmochilaActionPerformed(evt);
            }
        });

        btncartera.setBackground(new java.awt.Color(255, 204, 204));
        btncartera.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btncartera.setText(" CARTERA");
        btncartera.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncartera.setFocusPainted(false);
        btncartera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarteraActionPerformed(evt);
            }
        });

        lblchicles.setBackground(new java.awt.Color(255, 204, 204));
        lblchicles.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblchicles.setForeground(new java.awt.Color(255, 204, 204));
        lblchicles.setText("0");

        lblmochila.setBackground(new java.awt.Color(255, 204, 204));
        lblmochila.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblmochila.setForeground(new java.awt.Color(255, 204, 204));
        lblmochila.setText("0");

        lblprenda.setBackground(new java.awt.Color(255, 204, 204));
        lblprenda.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblprenda.setForeground(new java.awt.Color(255, 204, 204));
        lblprenda.setText("0");

        lblcartera.setBackground(new java.awt.Color(255, 204, 204));
        lblcartera.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblcartera.setForeground(new java.awt.Color(255, 204, 204));
        lblcartera.setText("0");

        btnaceptar.setBackground(new java.awt.Color(204, 204, 204));
        btnaceptar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnaceptar.setText("ACEPTAR");
        btnaceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnaceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnaceptar.setFocusPainted(false);
        btnaceptar.setMaximumSize(new java.awt.Dimension(212, 45));
        btnaceptar.setMinimumSize(new java.awt.Dimension(212, 45));
        btnaceptar.setPreferredSize(new java.awt.Dimension(212, 32));
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(204, 204, 204));
        btnsalir.setFont(new java.awt.Font("Microsoft YaHei", 1, 8)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salida.png"))); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsalir.setFocusPainted(false);
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setIconTextGap(0);
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

        lblchupetin.setBackground(new java.awt.Color(255, 204, 204));
        lblchupetin.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblchupetin.setForeground(new java.awt.Color(255, 204, 204));
        lblchupetin.setText("0");

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

        lblalfajor.setBackground(new java.awt.Color(255, 204, 204));
        lblalfajor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblalfajor.setForeground(new java.awt.Color(255, 204, 204));
        lblalfajor.setText("0");

        javax.swing.GroupLayout pnlproductosLayout = new javax.swing.GroupLayout(pnlproductos);
        pnlproductos.setLayout(pnlproductosLayout);
        pnlproductosLayout.setHorizontalGroup(
            pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlproductosLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlproductosLayout.createSequentialGroup()
                        .addComponent(btnmochila, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblmochila))
                    .addGroup(pnlproductosLayout.createSequentialGroup()
                        .addComponent(btncartera, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblcartera))
                    .addGroup(pnlproductosLayout.createSequentialGroup()
                        .addComponent(btnprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblprenda))
                    .addGroup(pnlproductosLayout.createSequentialGroup()
                        .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnchicles, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(btnaceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnalfajor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(btnchupetin, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                        .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlproductosLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlproductosLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblalfajor)
                                    .addComponent(lblchicles)
                                    .addComponent(lblchupetin))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlproductosLayout.setVerticalGroup(
            pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlproductosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblprenda)
                    .addComponent(btnprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncartera, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlproductosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblcartera)))
                .addGap(30, 30, 30)
                .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmochila, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlproductosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblmochila)))
                .addGap(30, 30, 30)
                .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnchicles, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlproductosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblchicles)))
                .addGap(30, 30, 30)
                .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnchupetin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblchupetin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnalfajor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblalfajor))
                .addGap(45, 45, 45)
                .addGroup(pnlproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnaceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout pnlventaLayout = new javax.swing.GroupLayout(pnlventa);
        pnlventa.setLayout(pnlventaLayout);
        pnlventaLayout.setHorizontalGroup(
            pnlventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlventaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlproductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlventaLayout.setVerticalGroup(
            pnlventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlventaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnlventa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnchiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiclesActionPerformed
        cantchicle++;
        String chicle = String.valueOf(cantchicle);
        lblchicles.setText(chicle);
    }//GEN-LAST:event_btnchiclesActionPerformed

    private void btnprendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprendaActionPerformed
        cantprenda++;
        String prenda = String.valueOf(cantprenda);
        lblprenda.setText(prenda);
    }//GEN-LAST:event_btnprendaActionPerformed

    private void btnmochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmochilaActionPerformed
        cantmochila++;
        String mochila = String.valueOf(cantmochila);
        lblmochila.setText(mochila);
    }//GEN-LAST:event_btnmochilaActionPerformed

    private void btncarteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarteraActionPerformed
        cantcartera++;
        String cartera = String.valueOf(cantcartera);
        lblcartera.setText(cartera);
    }//GEN-LAST:event_btncarteraActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        idventa = ConsultasBD.NuevaIdVenta();
        if ((cantcartera + cantprenda + cantmochila + cantchicle + cantchupetin + cantalfajor) != 0){
            int[] productoscant = {0 ,cantprenda, cantcartera, cantmochila, cantchicle, cantchupetin, cantalfajor};
            int tope = productoscant.length;
            for (int i = 1; i < tope; i++){
                if (productoscant[i] != 0){
                    int idprod = Conexiones.ConsultasBD.IdProducto(listadoprod.getProductos()[i]);
                    int cant = productoscant[i];
                    Conexiones.ConsultasBD.CrearVenta(idventa, idprod, cant);
                }
            }
                frmVentanaConfirmacionVenta confirmacionventa = new frmVentanaConfirmacionVenta(idventa);
                confirmacionventa.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE CANTIDADES VÁLIDAS", "CANTIDADES INCORRECTAS", JOptionPane.INFORMATION_MESSAGE);
        }
        limpiezaCajas();
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnchupetinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchupetinActionPerformed
        cantchupetin++;
        String chupetin = String.valueOf(cantchupetin);
        lblchupetin.setText(chupetin);
    }//GEN-LAST:event_btnchupetinActionPerformed

    private void btnalfajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalfajorActionPerformed
        cantalfajor++;
        String alfajor = String.valueOf(cantalfajor);
        lblalfajor.setText(alfajor);
    }//GEN-LAST:event_btnalfajorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnalfajor;
    private javax.swing.JButton btncartera;
    private javax.swing.JButton btnchicles;
    private javax.swing.JButton btnchupetin;
    private javax.swing.JButton btnmochila;
    private javax.swing.JButton btnprenda;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel lblalfajor;
    private javax.swing.JLabel lblcartera;
    private javax.swing.JLabel lblchicles;
    private javax.swing.JLabel lblchupetin;
    private javax.swing.JLabel lblmochila;
    private javax.swing.JLabel lblprenda;
    private javax.swing.JPanel pnlproductos;
    private javax.swing.JPanel pnlventa;
    // End of variables declaration//GEN-END:variables
}
