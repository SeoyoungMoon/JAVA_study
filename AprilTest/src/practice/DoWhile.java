package practice;

/*
 * 2024.03.05
 * 정보처리기사 실기 공부 C언어
 * doWhile문
 * Day1
 * */

public class DoWhile {

	public static void main(String[] args) {
		
		int i = 1, sum = 0;
		
		do {
			sum = sum + 1;
			i++;
		} while (i<4);
		System.out.printf("%d\n", sum);
	}
	
}
