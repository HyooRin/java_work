package ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// 클라이언트 측 코드
// 소켓 통신을 하려면 소켓이 필요하다 (서버측 연결을 담당하는 포트 번호를 알아야 한다)
public class ClientFile {
	final String IP = "192.168.0.77";
	// final String IP = "192.168.0.125";
	// final String IP = "192.168.0.76";
	// final String IP = "192.168.0.80";
	// final String IP = "localhost";

	Socket socket;
	BufferedWriter bufferedWriter; // 출력 스트림
	BufferedReader bufferedReader; // 입력 스트림

	public ClientFile() {
		try {
			System.out.println("1. 클라이언트 소켓 프로그램 시작");
			socket = new Socket(IP, 11000);
			System.out.println("2. 소켓으로 연결완료");

			// socket에다가 버퍼 스트림 연결
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 키보드에서 값을 받아 서버측으로 문자 보내기!!
			// 표준 스트림 + 보조 스트림
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String msg = bufferedReader.readLine();
				System.out.println("글자를 입력해주세요");

				bufferedWriter.write(msg + "\n");// 문장 끝을 알려줘야함
				bufferedWriter.flush(); // 물 내리기 (버퍼 비우기)
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ClientFile();
	}

}
