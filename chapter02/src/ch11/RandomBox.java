package ch11;

import java.util.Random;
import java.util.Scanner;

public class RandomBox {

	public static void main(String[] args) {
		
		// 랜덤 뽑기 만들기 
		// 경품 -->  인형, 자동차, 현금
		
		// 기능 만들기 
		// 랜덤 번호 1~3 중 하나 추출
		// 사용자 1~3 입력 받기
		// 맞으면 -> 상품전달
		// 틀리면 --> 다시 시도 돈을 넣어요 
		
		Toy toy1 = new Car();
		Toy toy2 = new Doll();
		Toy toy3 = new Money();
		
		
		Toy[] toys = new Toy[3];
		toys[0] = toy1;
		toys[1] = toy2;
		toys[2] = toy3;
		
		Scanner scanner = new Scanner(System.in);
		int selectedNumber = scanner.nextInt();
		Random random = new Random();
		// 0 , 1 , 2 
		int RandomNumber = random.nextInt(3);
		//System.out.println(toys[selectedNumber].name + " 이 당첨 되었습니다");

		System.out.println("선택 :" + selectedNumber);
		System.out.println("랜덤 :" + RandomNumber);
				
		if(selectedNumber == RandomNumber) {
			System.out.println(toys[selectedNumber].name + " 이 당첨 되었습니다" + "가격은"+ toys[selectedNumber].price );

		}else if(selectedNumber != RandomNumber) {
			System.out.println("다시");
		}
		

	} // end of main

}// end of class
