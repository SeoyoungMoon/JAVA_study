package ch13;

import java.util.Scanner;

/*
 * 2023.09.06
 * 문서영 실습
 * chapter1 13강
 * Day5
 * */

public class IfElseIfTest {

	public static void main(String[] args) {
		
		int age;
		int charge;
		
		System.out.println("나이를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		age = scanner.nextInt();
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학아동입니다.");
		} else if (age < 14){
			charge = 2000;
			System.out.println("초딩입니다.");
		} else if (age < 20){
			charge = 3000;
			System.out.println("중고딩입니다.");
		} else {
			charge = 4000;
			System.out.println("일반인입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다. ");

	}

}
