package ch01;

import java.util.Random;

public class LottoGameExEx {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		Random random = new Random();

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		} // end of for
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
			
		}
	}

}
