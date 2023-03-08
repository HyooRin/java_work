package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyArticle2 {

	public static void main(String[] args) {
		// 파일 입출력을 활용해서 코드를 작성해주세요
		// 입력 대상 : article1.txt
		// 출력 대상 : today_article.txt
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("article1.txt");
			fw = new FileWriter("today_article.txt");
			// 더이상 읽을게 없다면 -1 을 리턴한다
			// Reader 기반은 2 바이트이상 처리 가능하다 -> 한글이 깨지지 않아요
			
			int i;
			fw.write("MVC 뉴스\n");
			while((i = fr.read()) != -1 ) {
				//System.out.print((char)i);
				fw.write(i);
			}
			fw.write("\n작성자 : 김효린");

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				// 사전 기반 지식
				// Writer 를 작성할 때 스트림이 열려 있으면 잠시 버퍼공간에 담아두었다가
				// 스트림이 종료되거나 flush 메서드 만나면 실제로 file에 출력한다.
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	

	}

}
