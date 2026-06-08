
package Formularios;

import Conexiones.ConexionBD;
import Conexiones.ConsultasBD;
import Impresiones.Impresion;
import Impresiones.PuertoUSB;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class frmVentanaConfirmacionVenta extends javax.swing.JFrame {
    
    private int id;
        
    public frmVentanaConfirmacionVenta(int idventa) {
        this.id = idventa;
        initComponents();
        ConexionBD.setcuenta("roperia", "1234");
        ConexionBD.getConnection();
        System.out.println("Estado: " + ConexionBD.getstatus());
        AjusteTabla();
        CargarDatos(idventa);
        String total = String.valueOf(ConsultasBD.TotalVenta(idventa));
        lbltotal.setText("TOTAL DE LA VENTA $ " + total);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
    }
    
    
    public void AjusteTabla(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{},new String[]{"Producto", "Cantidad", "Precio"});
        tbltabla.setModel(modelo);
        tbltabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbltabla.getColumnModel().getColumn(0).setPreferredWidth(350);
        tbltabla.getColumnModel().getColumn(1).setPreferredWidth(110);
        tbltabla.getColumnModel().getColumn(2).setPreferredWidth(320);
        tbltabla.setRowHeight(50);
        tbltabla.getTableHeader().setReorderingAllowed(false);
        tbltabla.getTableHeader().setResizingAllowed(false);
        JTableHeader titulos = tbltabla.getTableHeader();
        titulos.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        titulos.setPreferredSize(new Dimension(titulos.getWidth(), 35));

    }
    
    public void CargarDatos(int idventa){
    DefaultTableModel modelo = (DefaultTableModel) tbltabla.getModel();
    modelo.setRowCount(0); 
    ResultSet res = ConsultasBD.ListarVenta(idventa);
    try {
        while(res.next()){
            Object[] fila = new Object[3];
            fila[0] = res.getString("Productos");
            fila[1] = res.getInt("Cant");
            fila[2] = res.getFloat("Precio");
            modelo.addRow(fila);
        }
    } catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlprincipal = new javax.swing.JPanel();
        spnltabla = new javax.swing.JScrollPane();
        tbltabla = new javax.swing.JTable();
        lbltotal = new javax.swing.JLabel();
        btnconfirmarventa = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        pnlprincipal.setBackground(new java.awt.Color(102, 102, 102));

        tbltabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbltabla.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        tbltabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbltabla.setEnabled(false);
        tbltabla.setFocusable(false);
        tbltabla.setRequestFocusEnabled(false);
        tbltabla.setRowSelectionAllowed(false);
        tbltabla.getTableHeader().setResizingAllowed(false);
        tbltabla.getTableHeader().setReorderingAllowed(false);
        spnltabla.setViewportView(tbltabla);

        lbltotal.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(255, 204, 204));
        lbltotal.setText("TOTAL DE LA VENTA $");

        btnconfirmarventa.setBackground(new java.awt.Color(204, 204, 204));
        btnconfirmarventa.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnconfirmarventa.setText("CONFIRMAR VENTA");
        btnconfirmarventa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnconfirmarventa.setFocusPainted(false);
        btnconfirmarventa.setFocusable(false);
        btnconfirmarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarventaActionPerformed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(204, 204, 204));
        btncancelar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btncancelar.setText("CANCELAR");
        btncancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncancelar.setFocusPainted(false);
        btncancelar.setMaximumSize(new java.awt.Dimension(212, 32));
        btncancelar.setMinimumSize(new java.awt.Dimension(212, 32));
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlprincipalLayout = new javax.swing.GroupLayout(pnlprincipal);
        pnlprincipal.setLayout(pnlprincipalLayout);
        pnlprincipalLayout.setHorizontalGroup(
            pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalLayout.createSequentialGroup()
                .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlprincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnconfirmarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlprincipalLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(spnltabla, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlprincipalLayout.setVerticalGroup(
            pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlprincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spnltabla, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconfirmarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnconfirmarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarventaActionPerformed
        PuertoUSB usb;
        try {
            usb = PuertoUSB.detectar();
            Impresion imp = new Impresion(usb);
            imp.imprimirTicket();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, 
                "Error al imprimir el ticket:\n" + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        dispose();
    }//GEN-LAST:event_btnconfirmarventaActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        Conexiones.ConsultasBD.EliminarVenta(id);
        dispose();
    }//GEN-LAST:event_btncancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnconfirmarventa;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JPanel pnlprincipal;
    private javax.swing.JScrollPane spnltabla;
    private javax.swing.JTable tbltabla;
    // End of variables declaration//GEN-END:variables
}
