package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DrawingDashedLine extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DrawingDashedLine() {
		super("Lines Drawing Demo");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	void drawLines(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		
		float[] dashingPattern1 = {2f,2f};
		Stroke stroke1 = new BasicStroke(2f,BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_MITER,1.0f,dashingPattern1,2.0f);
		g2d.setStroke(stroke1);
		g2d.drawLine(120,40,360,40);
		
		g2d.setColor(Color.green);
		float[] dashingPattern2 = {10f,4f};
		Stroke stroke2 = new BasicStroke(4f, BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_MITER,1.0f,dashingPattern2,0.0f);
		g2d.setStroke(stroke2);
		g2d.draw(new Line2D.Double(59.45d,60.5f,435.50f,60.5f));
		
		g2d.setColor(Color.BLUE);
		float[] dashingPattern3 = {10f,10f,1f,10f};
		Stroke stroke3 = new BasicStroke(8f,BasicStroke.CAP_SQUARE,
				BasicStroke.JOIN_MITER,1.0f,dashingPattern3,0.0f);
		
		g2d.setStroke(stroke3);
		g2d.draw(new Line2D.Float(21.50f, 80.05f, 459.50f,80.50f));
		
		
		
		 //Decorating line end Caps 
		 // BasicsStroke class provide theree cap styles: CAP_SQARE(default),
		 // CAP_BUTT and CAP_ROUND are decorations applied at both ends of the line(solid,unclosed-path line) or dash segments in a dashed line.
		
		
		// this stroke with default CAP_SQUARE and JOIN_MITER
		Stroke stroke4 = new BasicStroke(12f);
		
		
		// this storke with CAP_BUTT
		 Stroke stroke5 = new BasicStroke(12f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER);
		 
		 // this stroke with CAp_ROUND
		 Stroke stroke6 = new BasicStroke(12f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER);
		 g2d.setStroke(stroke4);
		 g2d.drawLine(100, 100, 450, 100);
		 
		 g2d.setStroke(stroke5);
		 g2d.drawLine(120, 120, 450, 120);
		 
		 g2d.setStroke(stroke6);
		 g2d.drawLine(30, 150, 450,150);
		 
		 // draws the first rectangle with a stroke of JOIN_MITER
		 g2d.setStroke(stroke4);
		 g2d.drawLine(30,200, 120, 200);
		 g2d.drawLine(30, 200, 30, 300);
		 g2d.drawLine(30, 300, 120,300);
		 g2d.drawLine(120, 200, 120, 300);
		 
		 // draws the second rectangle with a stroke of join_bevel
		     g2d.setStroke(stroke5);
		     g2d.drawLine(30+120,200, 120+120, 200);
			 g2d.drawLine(30+120, 200, 30+120, 300);
			 g2d.drawLine(30+120, 300, 120+120,300);
			 g2d.drawLine(120+120, 200, 120+120, 300);
		
		// draws the third rectangle with a stroke of JOIN_ROUND
			 g2d.setStroke(stroke6);
			 g2d.drawLine(30+240,200, 120+240, 200);
			 g2d.drawLine(30+240, 200, 30+240, 300);
			 g2d.drawLine(30+240, 300, 120+240,300);
			 g2d.drawLine(120+240, 200, 120+240, 300);
		              
		
				 
	}

	public void paint(Graphics g) {
		super.paint(g);
		drawLines(g);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new DrawingDashedLine().setVisible(true);
			}
		});
		;

	}

}
