package ch15;

/*
 * 2023.09.08
 * 문서영 실습
 * chapter1 16강 <for문과 while문 알아보기>
 * Day7
 * */

public class ForTest {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			
			sum += num;
			num++;
			
		}
		System.out.println(sum);
		
		for(num = 1, sum = 0; num <= 10; num++) {
			
			sum += num;
			
		}
		System.out.println(sum);					//위의 while문과 for문의 결과는 같아. 이렇게 써도 되고 저렇게 써도 돼.

	}

}
