package ch02;

public class MainTest {

	
	public static void main(String[] args) {
	
		LottoProgram lottoProgram = new LottoProgram();
		//int[] lotto = new int[lottoProgram.NUMBER_SIZE];
		//lottoNumber = lottoProgram.Random();
		// -->
		int[] lotto = lottoProgram.Random();

		System.out.println("<<로또당첨 번호>>");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	

	}// end of main

}// end of class
