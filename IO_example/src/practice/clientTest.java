package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class clientTest {
	
	// 통신을 하기위해 소켓이 필요 + ip 주소 + 포트번호
	Socket socket;
	final String IP = "localhost";
	final int PORT = 10000;
	BufferedReader keyboardreader;
	BufferedWriter writer;
	
	// 소켓 통신을 통해 들어온 데이터를 입력 받아야 해 
	// 입력 스트림 필요하다 
	BufferedReader socketReader;
	
	public clientTest() {
		initData();
	}
	
	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(IP, PORT);
			// 클라이언트와 서버 연결 완료
			
			// 키보드에서 데이터 입력 받기 
			keyboardreader = 
					new BufferedReader(new InputStreamReader(System.in));		
			
			// 소켓 통신을 통해서 데이터 출력
			// 출력 스트림 연결 : 대상 소켓
			writer =
					new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.println("키보드 입력대기");
				String input = keyboardreader.readLine(); // 키보드에서 데이터 입력 받음
				writer.write(input);
				writer.newLine(); // 문장의 끝을 알려주어야 한다 .
				writer.flush();
			}			

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		} 
	}// end of initData
	
	// 내부클래스
	class ReadThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		new clientTest();
	}// end of main
	

}// end of class 
