package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyImageMove extends JFrame implements Moveable{
	
	private JLabel label;
	private int labelTextX;
	private int labelTextY;
	
	
	
	public MyImageMove() {
		initData();
		setInitLayout();
		addEventListener();
	
	}
	
	private void initData() {
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		labelTextX = 200;
		labelTextY = 200;
		label = new JLabel(new ImageIcon("images/image10.png"));
		label.setSize(200,200 );

	}
	
	private void setInitLayout() {
		setLayout(null);
		label.setLocation(labelTextX, labelTextY);
		add(label);
		setVisible(true);
		
	}
	private void addEventListener() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

	@Override
	public void left() {
		//label.setLocation(labelTextX -= 50, labelTextY);
		if((labelTextX-50) >= 0 ) {
			int x = labelTextX -= 50;
			int y = labelTextY;
			label.setLocation(x, y);
		}
		
	}

	@Override
	public void right() {
		//label.setLocation(labelTextX += 50, labelTextY);
		if((labelTextX+50) < 650 ) {
			int x = labelTextX += 50;
			int y = labelTextY;
			label.setLocation(x, y);
		}
		
	}

	@Override
	public void up() {
		//label.setLocation(labelTextX , labelTextY -= 50);
		if((labelTextY-50) >= 0 ) {
			int x = labelTextX;
			int y = labelTextY-= 50;
			label.setLocation(x, y);
		}
		
	}

	@Override
	public void down() {
		//label.setLocation(labelTextX , labelTextY+= 50);
		if((labelTextY-50) < 500 ) {
			int x = labelTextX;
			int y = labelTextY+= 50;
			label.setLocation(x, y);
		}
		
	}

}
