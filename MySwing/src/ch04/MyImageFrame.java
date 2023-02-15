package ch04;

import java.awt.Graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Swing 이미지를 다루는 방법은 3가지정도
// JLable <--- String, Image()
public class MyImageFrame extends JFrame {
	
	imagePanel imagePanel;

	// JPanel 안에 이미지를 넣는 방법!!
	// 내부 클래스 이용해보기
	class imagePanel extends JPanel {

		private Image image;

		public imagePanel() {
			image = new ImageIcon("image1.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// 대상 , x, y, 가로길이 , 세로길이
			g.drawImage(image,0, 0, 400, 400, null);
		}

	} // end of inner class

	public MyImageFrame() {
		initData();
		setInitLayout();

	}

	private void initData() {
		setTitle("이미지연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new imagePanel();

	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);

	}
}
