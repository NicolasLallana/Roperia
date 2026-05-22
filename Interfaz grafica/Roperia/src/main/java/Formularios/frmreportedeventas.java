
package Formularios;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class frmreportedeventas extends javax.swing.JFrame {
    
  
    public frmreportedeventas() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        AjustarCalendario();
    }

    
    public void AjustarCalendario(){
        JCalendar cal1 = dtedesde.getJCalendar();

        // Acceder a los componentes internos
        JMonthChooser month = cal1.getMonthChooser();
        JYearChooser year = cal1.getYearChooser();

        // Obtener el panel que contiene mes + año
        JPanel topBar = (JPanel) month.getParent();

        // Reemplazar el layout por uno que respete tamaños
        topBar.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        // Ajustar tamaños
        month.setPreferredSize(new Dimension(110, 40));
        year.setPreferredSize(new Dimension(160, 40));

        // Forzar actualización
        topBar.revalidate();
        topBar.repaint();
        cal1.revalidate();
        cal1.repaint();

        JCalendar cal2 = dtehasta.getJCalendar();

        // Acceder a los componentes internos
        JMonthChooser mes = cal2.getMonthChooser();
        JYearChooser anio = cal2.getYearChooser();

        // Obtener el panel que contiene mes + año
        JPanel topebarra = (JPanel) month.getParent();

        // Reemplazar el layout por uno que respete tamaños
        topebarra.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        // Ajustar tamaños
        mes.setPreferredSize(new Dimension(110, 40));
        anio.setPreferredSize(new Dimension(160, 40));

        // Forzar actualización
        topebarra.revalidate();
        topebarra.repaint();
        cal2.revalidate();
        cal2.repaint();
        
        JTextField txtFecha1 = (JTextField) dtedesde.getDateEditor().getUiComponent();
        JTextField txtFecha2 = (JTextField) dtehasta.getDateEditor().getUiComponent();
        txtFecha1.setEditable(false);      // No permite escribir
        txtFecha1.setFocusable(false);     // Opcional: no toma foco al tabular
        txtFecha2.setEditable(false);      // No permite escribir
        txtFecha2.setFocusable(false);     // Opcional: no toma foco al tabular   
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlreporteventas = new javax.swing.JPanel();
        lblhasta = new javax.swing.JLabel();
        dtedesde = new com.toedter.calendar.JDateChooser();
        lbldesde = new javax.swing.JLabel();
        dtehasta = new com.toedter.calendar.JDateChooser();
        btnaceptar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SELECCIONE PERÍODO");
        setResizable(false);

        pnlreporteventas.setBackground(new java.awt.Color(102, 102, 102));
        pnlreporteventas.setEnabled(false);

        lblhasta.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        lblhasta.setForeground(new java.awt.Color(255, 204, 204));
        lblhasta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhasta.setText("HASTA");

        dtedesde.setBackground(new java.awt.Color(255, 204, 204));
        dtedesde.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        dtedesde.setToolTipText("");
        dtedesde.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        dtedesde.setName("dtedesde"); // NOI18N

        lbldesde.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        lbldesde.setForeground(new java.awt.Color(255, 204, 204));
        lbldesde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldesde.setText("DESDE");

        dtehasta.setBackground(new java.awt.Color(255, 204, 204));
        dtehasta.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        dtehasta.setToolTipText("");
        dtehasta.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 30)); // NOI18N
        dtehasta.setName("dtedesde"); // NOI18N

        btnaceptar.setBackground(new java.awt.Color(255, 204, 204));
        btnaceptar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnaceptar.setText("ACEPTAR");
        btnaceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(255, 204, 204));
        btnsalir.setFont(new java.awt.Font("Microsoft YaHei", 1, 8)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salida.png"))); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setIconTextGap(6);
        btnsalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlreporteventasLayout = new javax.swing.GroupLayout(pnlreporteventas);
        pnlreporteventas.setLayout(pnlreporteventasLayout);
        pnlreporteventasLayout.setHorizontalGroup(
            pnlreporteventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlreporteventasLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlreporteventasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlreporteventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtedesde, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldesde, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlreporteventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlreporteventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dtehasta, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblhasta, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        pnlreporteventasLayout.setVerticalGroup(
            pnlreporteventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlreporteventasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlreporteventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblhasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldesde, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlreporteventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dtedesde, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtehasta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlreporteventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlreporteventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        boolean sinfecha = dtedesde.getDate() != null && dtehasta.getDate() != null;
        if (sinfecha){  
            java.sql.Date finicio = new java.sql.Date(dtedesde.getDate().getTime());
            java.sql.Date ffinal = new java.sql.Date(dtehasta.getDate().getTime());
            frmvistadereporte ventana = new frmvistadereporte(finicio, ffinal);
            ventana.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE PERÍODO", "SIN FECHAS SELECIONADAS", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnsalir;
    private com.toedter.calendar.JDateChooser dtedesde;
    private com.toedter.calendar.JDateChooser dtehasta;
    private javax.swing.JLabel lbldesde;
    private javax.swing.JLabel lblhasta;
    private javax.swing.JPanel pnlreporteventas;
    // End of variables declaration//GEN-END:variables
}
