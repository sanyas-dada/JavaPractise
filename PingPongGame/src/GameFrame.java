import java.awt.Color;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GamePanel panel;

	GameFrame() {

		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Ping Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		// center of the windows
		this.setLocationRelativeTo(null);
	}

}
