package ch02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Mycomponents extends JFrame {
	
	private JButton button1;
	private JLabel label; // 글자를 넣어서 화면에 띄울수있다.
	private JTextField textField; // 사용자한테 입력값을 받을 수 있는 컴포넌트
	private JPasswordField jPassWordField; //사용자 비번을 받는 컴포넌트
	private JCheckBox checkBox;
	
	public Mycomponents() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("컴포넌트 확인");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 =new JButton("JButton");
		label = new JLabel("글자를적는 컴포넌트");
		textField = new JTextField("아이디입력",20);
		jPassWordField = new JPasswordField("비번입력",10);
		checkBox = new JCheckBox("동의"); 
	}
	private void setInitLayout() {
		add(button1);
		add(label);
		add(textField);
		add(jPassWordField);
		add(checkBox);
		// 화면 보이는 구성 아이템에 대한 배치 --> 레이아웃 (배치관리자)
		setLayout( new FlowLayout());
		// setLayout(new FlowLayout(FlowLayout.LEFT, 30, 50));
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Mycomponents();
		
		
	}

}
