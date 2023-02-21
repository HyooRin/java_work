package ex02EX;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable{
	
	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	
	private boolean left;
	private boolean right;
	private boolean up;
	private  boolean down;
	
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;
	
	public void Player() {
		initData();
		setInitLayout();
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		left = false;
		right = false;
		up = false;
		down = false;
		
	}
	
	private void setInitLayout() {
		
		x = 55;
		y = 535;
		setSize(50, 50);
		setLocation(x, y);
		setIcon(playerR);
		
	}

	@Override
	public void left() {
		left = true;
		

	}

	@Override
	public void right() {
		setIcon(playerR);
		x = x + 10;
		setLocation(x, y);		
	}

	@Override
	public void up() {
		System.out.println("점프");		
	}

	@Override
	public void down() {
		System.out.println("p down");
		
	}

}
