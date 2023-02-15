package Practice;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

// Swing 이미지를 다루는 방법은 3가지 정도
// JLable <--- String, Image()
public class MyImageFrame extends JFrame{
	
	// Jpanel 안에 이미지를 넣는 방법!!
	// 내부 클래스 이용해보기 
	class imagePanel {
		
		private ImageIcon image;
		
		public imagePanel() {
			image = new ImageIcon("image1.png");
		}
	}
	


	public MyImageFrame() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("이미지연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	private void setInitLayout() {
		
	}
	
	public static void main(String[] args) {
		
	}// end of main
	
}// end of class
	

