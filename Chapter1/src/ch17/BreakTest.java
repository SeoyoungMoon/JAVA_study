package ch17;

/*
 * 2023.09.08
 * 문서영 실습
 * chapter1 18강 <break문 알아보기>
 * Day7
 * */

public class BreakTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		for(num = 1; ; num++) {
			
			sum += num;
			if(sum > 100)
				break;			//break를 쓰면 자길 감싸고 있는 for문을 탈출할 수 있어. 
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
