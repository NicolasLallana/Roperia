
package Formularios;

import Conexiones.ConexionBD;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frmnuevoprecio extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmnuevoprecio.class.getName());
    
    private int idproducto;

    public frmnuevoprecio(int idprod) {
        initComponents();
        this.idproducto = idprod;
        this.setLocationRelativeTo(null);
        ConexionBD.setcuenta("roperia", "1234");
        ConexionBD.getConnection();
        String prod = Conexiones.ConsultasBD.getNombreProducto(idprod);
        String texto = "Ingrese nuevo precio de " + prod ;
        lbldescripcionprod.setText(texto);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
    }
    
    ImageIcon tickverde = new ImageIcon(getClass().getResource("/tick.png"));
    
    public static boolean EsFloat(JTextField txt) {
    try {
        Float.parseFloat(txt.getText().trim());
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlnuevoprecio = new javax.swing.JPanel();
        lbldescripcionprod = new javax.swing.JLabel();
        txtnuevoprecio = new javax.swing.JTextField();
        btnaceptar = new javax.swing.JButton();
        lblsignopesos = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlnuevoprecio.setBackground(new java.awt.Color(102, 102, 102));

        lbldescripcionprod.setFont(new java.awt.Font("Microsoft YaHei", 1, 22)); // NOI18N
        lbldescripcionprod.setForeground(new java.awt.Color(255, 204, 204));
        lbldescripcionprod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldescripcionprod.setText("INGRESE EL NUEVO PRECIO DE");

        txtnuevoprecio.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        txtnuevoprecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnaceptar.setBackground(new java.awt.Color(204, 204, 204));
        btnaceptar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnaceptar.setText("ACEPTAR");
        btnaceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        lblsignopesos.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        lblsignopesos.setForeground(new java.awt.Color(255, 204, 204));
        lblsignopesos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsignopesos.setText("$");

        btncancelar.setBackground(new java.awt.Color(204, 204, 204));
        btncancelar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btncancelar.setText("CANCELAR");
        btncancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlnuevoprecioLayout = new javax.swing.GroupLayout(pnlnuevoprecio);
        pnlnuevoprecio.setLayout(pnlnuevoprecioLayout);
        pnlnuevoprecioLayout.setHorizontalGroup(
            pnlnuevoprecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbldescripcionprod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
            .addGroup(pnlnuevoprecioLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblsignopesos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnuevoprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlnuevoprecioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pnlnuevoprecioLayout.setVerticalGroup(
            pnlnuevoprecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlnuevoprecioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbldescripcionprod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(pnlnuevoprecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsignopesos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnuevoprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(pnlnuevoprecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlnuevoprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlnuevoprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        if(EsFloat(txtnuevoprecio)){
            try {
                if (!txtnuevoprecio.getText().trim().isEmpty()){
                    float nuevoprecio = Float.parseFloat(txtnuevoprecio.getText());
                    Conexiones.ConsultasBD.ModificarPrecioProducto(idproducto, nuevoprecio);
                    JOptionPane.showMessageDialog(null, "OPERACIÓN EXITOSA", "CAMBIO REALIZADO CON ÉXITO", JOptionPane.PLAIN_MESSAGE, tickverde);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un monto", "SIN MONTO DECLARADO", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE MONTO VÁLIDO", "MONTO INVÁLIDO", JOptionPane.INFORMATION_MESSAGE);
            txtnuevoprecio.setText("");
            txtnuevoprecio.requestFocus();

        }
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btncancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JLabel lbldescripcionprod;
    private javax.swing.JLabel lblsignopesos;
    private javax.swing.JPanel pnlnuevoprecio;
    private javax.swing.JTextField txtnuevoprecio;
    // End of variables declaration//GEN-END:variables
}
