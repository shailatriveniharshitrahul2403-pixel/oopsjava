import javax.swing.*;
import java.awt.*;

public class FootballOval extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor(new Color(139, 69, 19)); 
        g2d.fillOval(100, 150, 300, 180);
        
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawArc(130, 155, 40, 170, 110, 140);
        g2d.drawArc(330, 155, 40, 170, 290, 140);
        
        g2d.setStroke(new BasicStroke(4));
        g2d.drawLine(200, 240, 300, 240);
        g2d.setStroke(new BasicStroke(3));
        for (int i = 0; i < 8; i++) {
            int currentX = 200 + (i * 14);
            g2d.drawLine(currentX, 228, currentX, 252);
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java 2D Football Shape");
        frame.add(new FootballOval());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
