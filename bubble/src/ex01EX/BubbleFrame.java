package ex01EX;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame{
	
	private JLabel backgroundMap;
	private Player player;
	
	
	public BubbleFrame() {
		initData();
		setInitLayout();
		AddEventListener();
	}
	
	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap); //
		setSize(1000, 640);
		
		player = new Player();
		
	}
	
	private void setInitLayout() {
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);// JFrame 가운데 배치
		setVisible(true);
		
		add(player);
		
	}
	
	private void AddEventListener() {
		
	}
	
	
	public static void main(String[] args) {
		new BubbleFrame();
		
	}//end of main	
	
}// end of class
