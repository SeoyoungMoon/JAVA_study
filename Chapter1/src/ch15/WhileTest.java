package ch15;

/*
 * 2023.09.08
 * 문서영 실습
 * chapter1 15강 <while문 알아보기>
 * Day7
 * */

public class WhileTest {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			
			sum += num;
			num++;
			
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
