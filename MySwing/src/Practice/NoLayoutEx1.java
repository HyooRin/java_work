package Practice;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx1 extends JFrame {
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	public NoLayoutEx1() {
		initData();
		setInitLatout();
	
	}
	
	private void initData() {
		setTitle("좌표기반연습");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("button1");
		button1.setSize(100, 100);
		button2 = new JButton("button2");
		button3 = new JButton("button3");
		
	}
	private void setInitLatout() {
		setLayout(null);
		button1.setLocation(100,100);
		add(button1);
		setVisible(true);
		
		
	}

}
