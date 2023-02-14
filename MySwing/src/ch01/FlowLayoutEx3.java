package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame{
	
	
	// 배치 관리자 FlowLayout 멤버 변수로 선언
	// 화면에 Component 를 그려 주세요 
	
	// 멤버변수를 선언할 수 있는가
	// 배열을 활용할 수 있는가
	// 생성자 + 메서드 호출
	// for 문 활용할 수 있는가
	// GUI 프로그램 익숙해지기 
	

//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;
//	private JButton button7;
//	private JButton button8;
	
	// 배열 버튼8개
	JButton[] button = new JButton[8];
	
	
	
	private FlowLayout flowLayout;
	

	public FlowLayoutEx3() {
		initData();
		setInitLayout();
		
		
	}
	
	private void initData() {
		setTitle("버튼");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		button1 = new JButton("버튼1");
//		button2 = new JButton("버튼2");
//		button3 = new JButton("버튼3");
//		button4 = new JButton("버튼4");
//		button5 = new JButton("버튼5");
//		button6 = new JButton("버튼6");
//		button7 = new JButton("버튼7");
//		button8 = new JButton("버튼8");
		for(int i = 0; i < button.length; i++) {
			 button[i] = new JButton("버튼" + i);
		}
		
		flowLayout = new FlowLayout(FlowLayout.RIGHT, 20,20);
		
	}
	
	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT,10,200));
//		add(button1);
//		add(button2);
//		add(button3);
//		add(button4);
//		add(button5);
//		add(button6);
//		add(button7);
//		add(button8);
		for(int i =0; i < button.length; i++) {
			add(button[i]);
		}
	}


	public static void main(String[] args) {
		new FlowLayoutEx3();
	}

}
