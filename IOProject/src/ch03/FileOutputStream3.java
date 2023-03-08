package ch03;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {

	public static void main(String[] args) {

		// Output3.txt 
		// hello world 찍어주세요 
		
		FileOutputStream fos = null;
		// 파일이 없다면 FileOut.. 파일을 먼저 생성해준다.
		try {
			byte[]bs = new byte[11];
			byte myData1 = 65;
			fos = new FileOutputStream("output3.txt");
			
			fos.write(myData1 + 7);
			fos.write(myData1 + 4);
			fos.write(myData1 + 11);
			fos.write(myData1 + 11);
			fos.write(myData1 + 14);
						
			fos.write(myData1 + 22);
			fos.write(myData1 + 14);
			fos.write(myData1 + 17 );
			fos.write(myData1 + 11);
			fos.write(myData1 + 3);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// end of main

}// end of class
