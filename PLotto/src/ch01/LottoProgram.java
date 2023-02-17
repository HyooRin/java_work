package ch01;

import java.util.Arrays;
import java.util.Random;

public class LottoProgram {
	
	final static int NUMBER_SIZE = 6;

	public void Random() {		
		int[] lotto = new int[NUMBER_SIZE];
		Random random = new Random();
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j] ) {
					i--;
				}
			}
		}// end of for		
		Arrays.sort(lotto);
		System.out.println("<<로또당첨 번호>>");
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t" );
		}		
	}
}// end of class 
