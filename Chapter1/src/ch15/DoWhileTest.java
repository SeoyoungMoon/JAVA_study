package ch15;

import java.util.Scanner;

/*
 * 2023.09.08
 * 문서영 실습
 * chapter1 15강 <do-while문 알아보기>
 * Day7
 * */

public class DoWhileTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {										//한번은 수행문을 꼭 거쳐야하는 경우는 do-while문을 쓰면 좋아. 
			System.out.println("num: ");
			input = scanner.nextInt();
			sum += input;
		} while(input != 0);
		System.out.println(sum);
	}

}
