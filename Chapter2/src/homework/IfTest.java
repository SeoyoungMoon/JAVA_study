package homework;

import java.util.Scanner;

/*
 * 2023.09.11
 * 문서영 실습
 * chapter2 연습문제 풀기 <조건식을 조건문으로 바꿔보기 >
 * Day8
 * */

public class IfTest {

	public static void main(String[] args) {
		
		// 조건식 : grade = (sore >= 90) ? 'A' : 'B';
		// 위의 조건식을 조건문으로 바꿔보기
		
		char grade;
		int score;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		score = scanner.nextInt();
		
		if( score >= 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		
		System.out.println(grade);

	}

}
