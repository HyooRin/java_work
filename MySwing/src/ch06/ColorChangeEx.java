package ch06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeEx extends JFrame implements ActionListener{
	
	private JPanel panel1;
	private JPanel panel2;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;

	
	public ColorChangeEx() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel2 = new JPanel();
		button1 = new JButton("click1");
		button2 = new JButton("click2");
		button3 = new JButton("click3");
		button4 = new JButton("click4");
		button5 = new JButton("click5");
		button6 = new JButton("click6");
		button7 = new JButton("click7");

	}
	private void setInitLayout() {
		// Frame -> borderLayout
		add(panel1);
		add(panel2);
		panel1.setBackground(Color.yellow);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		
		setVisible(true);		
	}
	
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
	}
	
	//테스트 코드
	public static void main(String[] args) {
		new ColorChangeEx();		
	}// end of main
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetButton = (JButton)e.getSource();
		//targetButton.setText("눌러짐버튼입니다.");
		//System.out.println(targetButton.getText());
		
		
//		System.out.println(e.getSource());
		
//		if(e.getSource() == this.button1 ) {
//			//System.out.println("button1");
//			panel.setBackground(Color.gray);
//		}else {
//			//System.out.println("button2");
//			panel.setBackground(Color.yellow);
//		}
		
//		System.out.println(e.getID());
//		System.out.println("호출됨");
//		panel.setBackground(Color.gray);
//		System.out.println(e.toString());

		
		
		// 문제 2
		// 버튼 7개 만들어서 무지개 색으로 변경되도록 코드 작성 
		

		
		
		
	}

}// end of class
