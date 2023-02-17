package ex01;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame {
	
	JButton button;
	//LottoRandomNumber lottoRandomNumber;
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
		button = new JButton("game start");
		//lottoRandomNumber = new LottoRandomNumber();
	}
	private void setInitLayout() {
		add(button, BorderLayout.SOUTH);
		setVisible(true);		
	}
	
	@Override
	public void paint(Graphics g) {
		// System.out.println("여기도 동작하나"); // Yes
		super.paint(g);
		// 그림을 그릴때 두가지 구분 (처음. 버튼)
		if( isStart == false) {
			g.drawString("게임을 실행해주세요",150, 150);
			// return;  // 실행에 제어권 반납 
		} else {
			//LottoRandomNumber lottoRandomNumber = new LottoRandomNumber();
			LottoRandomNumber lottoRandomNumber;
			lottoRandomNumber = new LottoRandomNumber();			
			int[] getNumbers = lottoRandomNumber.createNumber();
			// 로또 번호 나타내기
			int x = 50;
			for( int i = 0; i < getNumbers.length; i++) {
				g.drawString(getNumbers[i] + "", x, 150);
				x += 100;
			}			
//			g.drawString(getNumbers[0] + "", 50, 150);
//			g.drawString(getNumbers[1] + "", 150, 150);
//			g.drawString(getNumbers[2] + "", 250, 150);
//			g.drawString(getNumbers[3] + "", 350, 150);
//			g.drawString(getNumbers[4] + "", 450, 150);
//			g.drawString(getNumbers[5] + "", 550, 150);			
		}		
	}
	
	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 // 그림을 다시 그려라 
				isStart = true;
				repaint();
			}
		});
		
	}

}
