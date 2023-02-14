package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame{
	
	// JButton[] button = new JButton[3];
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	
	
	// JButton <----
	public NoLayoutEx2() {
		initData();
		setInitLayout();

	}
	
	private void initData() {
		setTitle("연습연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("1");
		button1.setSize(100, 100);
		button2 = new JButton("2");
		button2.setSize(100, 100);
		button3 = new JButton("3");
		button3.setSize(100, 100);
		button4 = new JButton("4");
		button4.setSize(100, 100);

	}
	private void setInitLayout() {
		setLayout(null); 
		button1.setLocation(100, 0);
		add(button1);
		button2.setLocation(50, 100);
		add(button2);
		button3.setLocation(100, 200);
		add(button3);
		button4.setLocation(50, 300);
		add(button4);
		
		
		
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new NoLayoutEx2();
	}

}
