package ch04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyArticle {

	public static void main(String[] args) {
		// 파일 입출력을 활용해서 코드를 작성해주세요
		// 입력 대상 : article1.txt
		// 출력 대상 : today_article.txt
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("article1.txt");			
			fw = new FileWriter("today_article.txt");
			int i;
			fw.write("MVC 뉴스\n");			
//			fw.write( fr.read());
			while( ( i = fr.read()) != -1 ) {
				fw.write(i);
			}			
			fw.write("\n작성자 : 김효린");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
