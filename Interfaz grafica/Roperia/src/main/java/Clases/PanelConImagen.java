
package Clases;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelConImagen extends JPanel{
    
    private Image fondo;
    
    public PanelConImagen(){
        fondo = new ImageIcon(getClass().getResource("/roperiajb.png")).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        int imgWidth = fondo.getWidth(this);
        int imgHeight = fondo.getHeight(this);
    // calcular escala manteniendo proporción
        double scale = Math.min(
            (double) panelWidth / imgWidth,
            (double) panelHeight / imgHeight
        );
        int newWidth = (int) (imgWidth * scale);
        int newHeight = (int) (imgHeight * scale);
    // centrar
        int x = (panelWidth - newWidth) / 2;
        int y = (panelHeight - newHeight) / 2;
        
        g.drawImage(fondo, x, y, newWidth, newHeight, this);
    }
    
}
