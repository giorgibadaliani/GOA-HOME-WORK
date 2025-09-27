
import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
			JFrame frame = new JFrame("Window");
		
			frame.setSize(500, 400);
		
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			frame.setLocationRelativeTo(null);
			
			Drawing drawing = new Drawing();
			
			drawing.setBackground(Color.LIGHT_GRAY);
			
			frame.add(drawing);
			
			frame.setVisible(true);
			
			
	}

}
