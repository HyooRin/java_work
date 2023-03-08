package ex11;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


//***** Main 을 가지는 클래스는 프로그램에 사용하는 참조변수를 다 알 수 있다.
public class BubbleFrame extends JFrame {

	// this= 주소값 을 mContext에  담아두는 것 
	private BubbleFrame mContext = this;	
	
	
	private JLabel backgroundMap;
	
	private Player player;
	
	private Enemy enemy;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
		// player 메모리에 올라간 상태이다.
		// 약속 run 메서드 안에 동작을 처리한다.
		new Thread(new BackgroundPlayerService(player)).start();
		new Thread(new BackgroundEnemyService(enemy)).start();
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Enemy getEnemy() {
		return enemy;
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);

		// 방법 2가지인데 1번사용 
		// 1. 부모의 주소값을 자식 객체한테 던져주면 된다.
		// (2. 콜백 메서드를 활용해서 구현할 수 있다. // --- 나중에 설명 ---)
		player = new Player(mContext);		
		// 적군 생성
		enemy = new Enemy(mContext, EnemyWay.LEFT);
	}	

	private void setInitLayout() {
		setLayout(null); // 좌표 기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치
		setVisible(true);

		add(player);
		add(enemy);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 38, 40, 39, 41 .......
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 여러번 누르더라도 한번만 호출되게 방어적 코드 작성
					// false
					// true로 변경
					// 한번더 누르면, 현재상태값이 true이기 때문에 다시 작동안됨
					if (player.isLeft() == false && player.isLeftWallCrash() == false) {
						player.left();
					}
					break;
				case KeyEvent.VK_RIGHT:
					if (player.isRight() == false && player.isRightWallCrash() == false) {
						player.right();
					}
					break;
				case KeyEvent.VK_UP:
					// 플레이어가 up == false
					// 플레이어가 down == false
					if (!player.isUp() && !player.isDown()) {
						player.up();
					}
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;
				case KeyEvent.VK_SPACE:
					player.attack();
					break;
				}
			}// end of KeyPressed

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽 버튼을 떼면 player는 멈춰야 해
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					// 오른쪽 버튼을 떼면 player는 멈춰야 해
					player.setRight(false);
					break;
				}
			}
		});

	}

	// ***** 자바 프로그램 main 함수를 가지는 클래스는
	// 프로그램에서 사용하는 모든 참조값을 알 수 있다 ********
	public static void main(String[] args) {
		new BubbleFrame();

	}// end of main

}// end of class
