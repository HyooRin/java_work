package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame3 extends JFrame implements Moveable{
	
	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;
	
	public MoveLabelFrame3() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		//초기값 세팅
		labelTextX = 300;
		labelTextY = 350;		
		labelText = new JLabel("Hello World~");
		labelText.setSize(100,100);
	}
	private void setInitLayout() {
		setLayout(null);
		labelText.setLocation(labelTextX,labelTextY);
		add(labelText);
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
				// 현재 이벤트가 일어난 시점에 x,y 좌표값을 확인
//				int currentX = labelText.getX();
//				int currentY = labelText.getY();
				
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}else if(e.getKeyCode() == KeyEvent.VK_UP) {
					up();
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
		// TODO Auto-generated method stub
		if((labelTextX) != 0) {
			int x = labelTextX -= 50;			
			int y = labelTextY;
			labelText.setLocation(x,y);
		}
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		if((labelTextX+50) != 750) {
			int x = labelTextX += 50;			
			int y = labelTextY;
			labelText.setLocation(x,y);
		}
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		if((labelTextY) != 0) {
			int x = labelTextX;			
			int y = labelTextY -= 50;
			labelText.setLocation(x,y);
		}
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		if((labelTextY+50) != 750) {
			int x = labelTextX;			
			int y = labelTextY += 50;
			labelText.setLocation(x,y);
		}
	}
	
}
