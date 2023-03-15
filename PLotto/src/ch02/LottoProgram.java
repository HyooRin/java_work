package ch02;

import java.util.Arrays;
import java.util.Random;

public class LottoProgram {
	
	final static int NUMBER_SIZE  = 6;

	// 생성자 Random / return 값 O
	public int[] Random() {
		int[] lotto = new int[NUMBER_SIZE];
		// 랜덤 숫자 받기 
		Random random = new Random();
		// 1~45까지 랜덤 로또 번호를 배열로 받기 
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			// 중복 없애기
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		} // end of for
		Arrays.sort(lotto); // 오름 차순으로 정렬하기 
		return lotto;

	}
}// end of class
