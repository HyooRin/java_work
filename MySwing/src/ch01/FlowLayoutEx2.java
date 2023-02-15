package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame{
	
	// 1단계 JButton 2개 생성
	// 배치 관리자 FlowLayout 멤버 변수로 선언
	// 화면에 Component 를 그려 주세요 

	// 배열
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	
	
	private FlowLayout flowLayout;

	public FlowLayoutEx2() {
		initData();
		setInitLayout();

	}
	
	private void initData() {
		setTitle("버튼");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		button3 = new JButton("버튼3");
		button4 = new JButton("버튼4");
		button5 = new JButton("버튼5");
		button6 = new JButton("버튼6");
		flowLayout = new FlowLayout(FlowLayout.RIGHT, 20,20);
		
	}
	
	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT,10,200));
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);

	}
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}

}
