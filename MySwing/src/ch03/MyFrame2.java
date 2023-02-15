package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame{
	
	MyDrawPanel2 drawPannel2;
	
	
	// 내부 클래스를 활용해서
	// JPanel를 상속받고  paint 메서드로  
	// 집 그림을 그려주세요 
	
	
	class MyDrawPanel2 extends JPanel {
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// 지붕
			g.drawLine(150,150,200,100);
			g.drawLine(200,100,250,150);
			g.drawLine(200,100,400,100);
			g.drawLine(400,100,450,150);
			// 집
			g.drawRect(150,150,100,200);
			g.drawRect(250,150,200,200);
			g.drawRect(270,170,150,50);
			// 창문
			g.drawOval(180, 170, 50, 50);
			// 달 
			g.drawOval(40, 40, 50, 50);
			// 문
			g.drawRect(170, 250, 60, 100);
			// 별
			g.drawString("★", 60 , 60);
			g.drawString("★", 100 , 60);
			g.drawString("★", 100 , 100);
			g.drawString("★", 130 , 30);			
		}
		
	}
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("집 그리기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPannel2 = new MyDrawPanel2();		
	}
	
	private void setInitLayout() {
		add(drawPannel2);
		setVisible(true);		
	}
}
