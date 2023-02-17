package ch09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame {
	
	// 화면을 담당!!
	// LottoRandomNumber 클래스에 받아서 처리해보자 
	
	JButton button;
	boolean isStart = false;
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();	
	}
	
	private void initData() {
		setTitle("Lotto 연습");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("로또 시작");
	}
	
	private void setInitLayout() {
		add(button, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if( isStart == false ) {
			g.drawString("버튼을 눌러 게임을 실행해주세요", 150, 150);
		}else {
			LottoRandomNumber lottoRandomNumber;
			lottoRandomNumber = new LottoRandomNumber();
			

			
		}
		
	}
	
	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 그림을 다시 그려라 
				repaint();				
			}
		});
		
	}


}
