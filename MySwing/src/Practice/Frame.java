package Practice;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame {
	int[] arr = new int[6];
	JButton button;

	public Frame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("게임시작");

	}

	private void setInitLayout() {
		add(button, BorderLayout.SOUTH);
		setVisible(true);

	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			System.out.println("누가 먼저입니까");
				repaint();

			}
		});

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		System.out.println("이게 뭘까요");
		Lotto lotto = new Lotto();
		arr = lotto.ranNum();
//		g.drawString("버튼을 눌러줘", 250, 300);
		g.drawString(arr[0]+"", 100, 300);
		g.drawString(arr[1]+"", 200, 300);
		g.drawString(arr[2]+"", 300, 300);
		g.drawString(arr[3]+"", 400, 300);
		g.drawString(arr[4]+"", 500, 300);
		g.drawString(arr[5]+"", 600, 300);
	}
}
