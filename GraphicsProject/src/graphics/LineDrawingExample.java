package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class LineDrawingExample extends JFrame {
    public LineDrawingExample() {
        super("Lines Drawing Demo");
 
        setSize(480, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
 
    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        // creates a solid stroke with line width is 2
        Stroke stroke = new BasicStroke(2f);
        g2d.setStroke(stroke);
        g2d.drawLine(130, 70, 360, 70);
        
        g2d.setColor(Color.GREEN);
        g2d.setStroke(new BasicStroke(4f));
        g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));
        
        g2d.setColor(Color.blue);
        g2d.setStroke(new BasicStroke(6f));
 
        g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));
 
    }
    // here, the key point is to override the paint() method from the superclass(jFrame) so that 
    // we obtain the graphics.
 
    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
      
    }

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LineDrawingExample().setVisible(true);
            }
        });
    
	}

}
