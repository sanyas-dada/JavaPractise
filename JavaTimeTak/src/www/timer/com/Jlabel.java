package www.timer.com;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jlabel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
       JLabel label = new JLabel();
       label.setBounds(40,150,100, 50);
       label.setText("i am going to make porject right now");
       label.setText("I am feeling good,");
       label.setBackground(Color.pink);
       
       
       frame.add(label);
       frame.setSize(500,400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
       frame.setVisible(true);
	}

}
