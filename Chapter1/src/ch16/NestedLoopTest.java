package ch16;

/*
 * 2023.09.08
 * 문서영 실습
 * chapter1 17강 <for문과 while문을 사용하여 구구단 만들어보기>
 * Day7
 * */

public class NestedLoopTest {

	public static void main(String[] args) {

		int dan = 2;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			
			for(times = 1; times <= 9; times++) {
				
				System.out.println(dan + "X" + times + "=" + dan*times);
				
			}
			System.out.println();
		}
		
		//---------------------------------------------------------------------------------------------------
		
		dan = 2;
		times = 1;
		while (dan <= 9) {
			
			times = 1;
			while (times <= 9) {
				
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
				
			}
			dan++;
		}
		
	}

}
