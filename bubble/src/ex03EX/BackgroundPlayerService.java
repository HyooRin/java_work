package ex03EX;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BackgroundPlayerService implements Runnable{
	
	private BufferedImage image;
	private Player player;	
	
	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어 서비스 객체에 사용하는 이미지 경로 및 파일명 확인");
		}
	}

	@Override
	public void run() {
		
		while(true) {
			// 색상 확인 
			// 왼쪽으로 갈 때는 좌표지점을 보정해야하고 
			// 오른쪽으로 갈때는 역시나 기준 좌표지점을 보정해야한다. 
			
			// 기준 왼쪽
			Color leftColor = new Color(image.getRGB(player.getX(), player.getY()));
			//기준 오른쪽
			Color rightColor = new Color(image.getRGB(player.getX(), player.getY()));
			
			if( rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				player.setRight(false);
				player.setRightWallCrash(true);
			}
			
			
		}
		
	}
	
	

}
