package Practice;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	// 랜덤 숫자 6개 배열로 받기
	public int[] ranNum() {
		int[] lotto = new int[6];
		Random random = new Random();

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;

	}

}
