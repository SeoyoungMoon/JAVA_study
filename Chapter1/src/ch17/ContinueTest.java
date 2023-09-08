package ch17;

/*
 * 2023.09.08
 * 문서영 실습
 * chapter1 18강 <Continue문 알아보기>
 * Day7
 * */

public class ContinueTest {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 100; i++) {		//3의 배수만 출력
			
			if ( ( i % 3 ) != 0) continue;
			
			System.out.println(i);
			
		}

	}

}
