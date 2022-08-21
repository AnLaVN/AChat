package Object;
// Make By Bình An || AnLaVN || KatoVN

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class IcoPanel extends javax.swing.JPanel {
    private BufferedImage image;    private int wi, he = 0; //width and height
    public IcoPanel(String filePath, int w, int h) {
        wi = w; he = h;
        try { image = ImageIO.read(getClass().getResource(filePath)); }
        catch (IOException ex) { ex.printStackTrace(); }  
    }
    @Override protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
    @Override public Dimension getPreferredSize() { return new Dimension(wi, he); }
}