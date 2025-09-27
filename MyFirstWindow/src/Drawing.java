
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;



public class Drawing extends JPanel {
	
@Override
protected void paintComponent(Graphics g) {
	
	super.paintComponent(g);
	
    
	g.setColor(Color.orange);
	g.fillRect(100, 150, 200, 150);
	
	g.setColor(new Color(139 , 69, 19));
	
	int[] xPoints = {100, 200, 300};
	int[] yPoints = {150, 80,  150};
	
	
	g.fillPolygon(xPoints, yPoints, 3);
    
	
	g.setColor(Color.DARK_GRAY);
	g.fillRect(180, 240, 40, 60);

	g.setColor(Color.CYAN);
    g.fillRect(230, 180, 40, 40);
    g.setColor(Color.BLACK); 
    g.drawRect(230, 180, 40, 40);
    
    g.setColor(Color.CYAN);
    g.fillRect(130, 180, 40, 40);
    g.setColor(Color.BLACK);
    g.drawRect(130, 180, 40, 40);
    
    g.setColor(Color.CYAN);
    g.fillRect(185, 115, 30, 20);
    g.setColor(Color.BLACK);
    g.drawRect(185, 115, 30, 20);
	
    g.setColor(Color.YELLOW);
    g.fillOval(350, 50, 60, 60);
    
    
    g.setColor(Color.GREEN);
    g.fillRect(0, 300, 500, 100);
    
     }

}
