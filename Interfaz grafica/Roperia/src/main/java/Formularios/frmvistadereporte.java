
package Formularios;

import Conexiones.ConexionBD;
import Conexiones.ConsultasBD;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class frmvistadereporte extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmvistadereporte.class.getName());

    private Date finicio;
    private Date ffinal;
    
    public frmvistadereporte(Date fecinicio, Date fecfinal) {
        initComponents();
        this.finicio = fecinicio;
        this.ffinal = fecfinal;
        this.setLocationRelativeTo(null);
        ConexionBD.setcuenta("roperia", "1234");
        ConexionBD.getConnection();
        String periodo = fecinicio.toString() + " HASTA " + fecfinal.toString();
        txtvistaventas.setText("VENTAS DESDE " + periodo);
        AjusteTabla();
        CargarDatos(fecinicio, fecfinal);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
    }


    public void AjusteTabla(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{},new String[]{"Producto", "Cantidad", "Precio", "Fecha y hora"});
        tblvistaventas.setModel(modelo);
        tblvistaventas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblvistaventas.getColumnModel().getColumn(0).setPreferredWidth(250);
        tblvistaventas.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblvistaventas.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblvistaventas.getColumnModel().getColumn(3).setPreferredWidth(400);
        tblvistaventas.setRowHeight(35);
        tblvistaventas.getTableHeader().setReorderingAllowed(false);
        tblvistaventas.getTableHeader().setResizingAllowed(false);
        JTableHeader titulos = tblvistaventas.getTableHeader();
        titulos.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        titulos.setPreferredSize(new Dimension(titulos.getWidth(), 35));

    }
    
    public void CargarDatos(Date finicio, Date ffinal){
        DefaultTableModel modelo = (DefaultTableModel) tblvistaventas.getModel();
        modelo.setRowCount(0);
        ResultSet res = ConsultasBD.ListarVentaPeriodo(finicio, ffinal);
        String total = String.valueOf(ConsultasBD.TotalVentaPeriodo(finicio, ffinal));
        try{
            while(res.next()){
                Object[] fila = new Object[4];
                fila[0] = res.getString("Productos");
                fila[1] = res.getInt("Cant");
                fila[2] = res.getFloat("Precio");
                fila[3] = res.getTimestamp("Datos");
                modelo.addRow(fila);
            }
            lbltotal.setText("TOTAL DE VENTAS EN EL PERIODO $" + total);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error en consulta: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlvistareporte = new javax.swing.JPanel();
        txtvistaventas = new javax.swing.JLabel();
        scrtblvistaventas = new javax.swing.JScrollPane();
        tblvistaventas = new javax.swing.JTable();
        btnsalir = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlvistareporte.setBackground(new java.awt.Color(102, 102, 102));

        txtvistaventas.setFont(new java.awt.Font("Microsoft JhengHei", 1, 32)); // NOI18N
        txtvistaventas.setForeground(new java.awt.Color(255, 204, 204));
        txtvistaventas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtvistaventas.setText("VENTAS DESDE ");

        scrtblvistaventas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        scrtblvistaventas.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N

        tblvistaventas.setFont(new java.awt.Font("Microsoft YaHei", 1, 32)); // NOI18N
        tblvistaventas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblvistaventas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblvistaventas.setEnabled(false);
        tblvistaventas.setFocusable(false);
        tblvistaventas.setRequestFocusEnabled(false);
        tblvistaventas.setRowSelectionAllowed(false);
        tblvistaventas.setUpdateSelectionOnSort(false);
        tblvistaventas.setVerifyInputWhenFocusTarget(false);
        scrtblvistaventas.setViewportView(tblvistaventas);

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

        lbltotal.setFont(new java.awt.Font("Microsoft YaHei", 1, 30)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(255, 204, 204));
        lbltotal.setText("TOTAL DE VENTAS EN EL PERIODO $");

        javax.swing.GroupLayout pnlvistareporteLayout = new javax.swing.GroupLayout(pnlvistareporte);
        pnlvistareporte.setLayout(pnlvistareporteLayout);
        pnlvistareporteLayout.setHorizontalGroup(
            pnlvistareporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlvistareporteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlvistareporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtvistaventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrtblvistaventas))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlvistareporteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbltotal, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        pnlvistareporteLayout.setVerticalGroup(
            pnlvistareporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlvistareporteLayout.createSequentialGroup()
                .addComponent(txtvistaventas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrtblvistaventas, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlvistareporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlvistareporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlvistareporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JPanel pnlvistareporte;
    private javax.swing.JScrollPane scrtblvistaventas;
    private javax.swing.JTable tblvistaventas;
    private javax.swing.JLabel txtvistaventas;
    // End of variables declaration//GEN-END:variables
}
