import javax.swing.*;
import java.awt.*;
import java.awt.geom.CubicCurve2D;

public class AnatomyVisualizer extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        int startX = 150;
        int startY = 350;
        int endX = 300;
        int endY = 150;
        
        g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.setColor(new Color(233, 150, 150)); 
        
        CubicCurve2D anteriorWall = new CubicCurve2D.Double(
            startX, startY,          
            startX + 50, startY - 60, 
            endX - 50, endY + 40,    
            endX, endY               
        );
        g2d.draw(anteriorWall);
        
        CubicCurve2D posteriorWall = new CubicCurve2D.Double(
            startX + 30, startY + 20,
            startX + 80, startY - 40,
            endX - 20, endY + 80,
            endX + 30, endY + 30
        );
        g2d.draw(posteriorWall);
        
        g2d.setColor(Color.DARK_GRAY);
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.drawString("Vaginal Canal Pathway Profile", startX + 20, startY - 120);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Anatomical Structural Path Renderer");
        frame.add(new AnatomyVisualizer());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
