package ch12;

import java.util.Scanner;

/*
 * 2023.09.04
 * 문서영 실습
 * chapter1 12강
 * Day3
 * */

public class ConditionTest {

	public static void main(String[] args) {

		int max;
		System.out.println("두 수를 입력 받아서 큰 수를 출력하세요");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input1:");
		int x = scanner.nextInt();
		System.out.println("input1:");
		int y = scanner.nextInt();
		
		max = (x>y)? x : y ;
		System.out.println(max);
		
	}

}
