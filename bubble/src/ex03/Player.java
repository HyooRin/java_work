package ex03;

import javax.swing.ImageIcon;

import javax.swing.JLabel;

public class Player extends JLabel implements Moveable{
	
	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	
	// 플레이어의 현재 움직임 상태를 기록해야만 컨트롤 할 수 있음
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	
	// 플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;
	
	public Player() {
		initData();
		setInitLayout();
		
	}
	
	
	
	//setter 메서드 만들기 left, right
	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setRight(boolean right) {
		this.right = right;
	}
	//gettter 메서드 추가 isleft, isright, isLeftWallCrash  isRightWallCrash
	
	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}
	
	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}
	
	public boolean isRightWallCrash() {
		return rightWallCrash;
	}
	
	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}
	
	public boolean isLeft() {
		return left;
	}
	
	public boolean isRight() {
		return right;
	}



	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		left = false;
		right = false;
		up = false;
		down = false;
		leftWallCrash = false;
		rightWallCrash = false;
				
	}
	
	private void setInitLayout() {		
		x = 500;
		y = 535;
		// 좌표 기반, 라벨의 크기를 지정해야한다 
		setSize(50, 50);
		setLocation(x, y);
		// JLabel 에 아이콘을 셋팅하는 메서드 
		setIcon(playerR);
		
	}

	@Override
	public void left() {
		left = true;
		
		// 한번 키보드 왼쪽 방향키를 누르면 
		// 쓰레드 생성이 된다. 
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(left) {
					setIcon(playerL);
					x = x- SPEED;
					setLocation(x, y);
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}//end of while
			}
		}).start();
		
		

	}

	@Override
	public void right() {		
		right = true;		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(right) {
					setIcon(playerR);
					x = x + SPEED;
					setLocation(x, y);
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}// end of while
				
			}
		}).start();
			
		
	}

	@Override
	public void up() {
		System.out.println("점프!");
		up = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 130 / JUMPSPEED; i++) {
					y = y - JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}// end of for
				
				//올라갔다가 자동으로 떨어지게 끔
				up = false;
				down();
				
			}
		}).start();
		
	}

	@Override
	public void down() {
		
		down = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 120/ JUMPSPEED; i++) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}//end of for 
				down = false;
				// Tip!!! 상태값을 다룰 때는 상황이 변하면 초기화 처리를 잘하자 
				
			}
		}).start();
		
	}

}
