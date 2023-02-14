package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx4 extends JFrame {
	
	// 멤버 변수 선언 할게요 
	private JButton[] button = new JButton[5]; // 배열 선언 방법에 대해 
	// 생성자는 메모리에 올라갈 때 처음 생성되는 코드
	// 구현부 안에서 순서도 중요합니다.
	
	
	public FlowLayoutEx4() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("배열활용");
		setSize(600,600);
		// static 변수나 static 함수는 클래스 이름으로도!! 접근가능합니다. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0; i < button.length; i++) {
			button[i] = new JButton("button" + (i+1));
		}

//		button[0] = new JButton("button1");
//		button[1] = new JButton("button1");
//		button[2] = new JButton("button1");
//		button[3] = new JButton("button1");
//		button[4] = new JButton("button1");
				
	}
	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT,30,30));
		for(int i =0; i < button.length; i++) {
			// 방어적 코드 작성 염두!!
			add(button[i]);
		}

//		this.add(button[0]);
//		this.add(button[1]);
//		this.add(button[2]);
//		this.add(button[3]);
//		this.add(button[4]);
		setVisible(true);
		
	}

}

