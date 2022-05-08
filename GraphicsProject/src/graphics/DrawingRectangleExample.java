package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DrawingRectangleExample extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DrawingRectangleExample() {
		super("Recatngle Drawing Demo");
		
		getContentPane().setBackground(Color.white);
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	} 
	void drawRectangles(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawRect(30, 50, 420, 120);
		// drawing Rectangles in double coordinates
		//g2d.fillRect(30, 50, 420, 120);
		 g2d.draw(new Rectangle2D.Double(25.50d,50.00d,130.345d,100.56d));
		
		
		 
		 // drawing rectangles in float coordinates
		 
		g2d.draw(new Rectangle2D.Float(35.5f,51.05f,100f,89.9f));
		//g2d.draw(new Rectangle(30,50,420,120));
		
		
		// drawing Rectangles with Rounded-corners
		   // to draw rectangle with four rounded corners, use the drawRounRect() method
		//  pass value for horizontal diameter(archWidth) and vertical diameter (arcHeight) of the corners
		
		g2d.drawRoundRect(40, 200, 120, 60, 20, 20);
		g2d.drawRoundRect(40, 300, 120, 60, 10, 10);
		g2d.drawRoundRect(40, 400, 120, 60, 5, 5);
		
		
		
		// drawing 3d rectangles
		
		g2d.setColor(Color.red);
		g2d.draw3DRect(400, 200, 200, 100,false);
		g2d.setColor(Color.LIGHT_GRAY);
		g2d.draw3DRect(500, 50, 200, 120, true);
		g2d.draw3DRect(500, 50, 200, 120, false);
		
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		drawRectangles(g);
	}

	public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {

		@Override
		public void run() {
			new DrawingRectangleExample().setVisible(true);
		}
    	   
       });         
	}

}
