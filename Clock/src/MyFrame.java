import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Calendar calendar;
	SimpleDateFormat timeFormat;
	JLabel timeLabel;
	String time;
	
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Porgram");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		timeLabel = new JLabel();
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		this.add(timeLabel);
		this.setVisible(true);
		
	}
	

}
